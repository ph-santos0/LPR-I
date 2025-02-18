package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.NFVendaPagamento;

/**
 *
 * @author ph-santos
 */
public class NFVendaPagamentoDAO {

    public void inserir(NFVendaPagamento nfVendaPagamento) {
        String sql = "INSERT INTO nf_venda_pagamento (codigo, codigo_nf, codigo_pagamento) VALUES (?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, nfVendaPagamento.getCodigo());
            statement.setInt(2, nfVendaPagamento.getCodigo_nf());
            statement.setString(3, nfVendaPagamento.getCodigo_pagamento());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir pagamento da nota fiscal de venda", e);
        }
    }

    public NFVendaPagamento newInserir(NFVendaPagamento nfVendaPagamento) {
        String sql = "INSERT INTO nf_venda_pagamento (codigo_nf, codigo_pagamento) VALUES (?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, nfVendaPagamento.getCodigo_nf());
            statement.setString(2, nfVendaPagamento.getCodigo_pagamento());
            int linhasAfetadas = statement.executeUpdate();
            if (linhasAfetadas > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGerado = generatedKeys.getInt(1);
                        nfVendaPagamento.setCodigo(idGerado);
                    }
                }
            }
            return nfVendaPagamento;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<NFVendaPagamento> listarNFVendaPagamentos() {
        List<NFVendaPagamento> pagamentos = new ArrayList<>();
        String sql = "SELECT * FROM nf_venda_pagamento;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NFVendaPagamento nfVendaPagamento = new NFVendaPagamento();
                nfVendaPagamento.setCodigo(resultSet.getInt("codigo"));
                nfVendaPagamento.setCodigo_nf(resultSet.getInt("codigo_nf"));
                nfVendaPagamento.setCodigo_pagamento(resultSet.getString("codigo_pagamento"));
                pagamentos.add(nfVendaPagamento);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar pagamentos da nota fiscal de venda", e);
        }
        return pagamentos;
    }
}
