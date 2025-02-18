package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.NFCompraPagamento;
import model.NFVendaPagamento;

/**
 *
 * @author wfabi0
 */
public class NFCompraPagamentoDAO {

    public void inserir(NFCompraPagamento nfCompraPagamento) {
        String sql = "INSERT INTO nf_compra_pagamento (codigo, codigo_nf, codigo_pagamento) VALUES (?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, nfCompraPagamento.getCodigo());
            statement.setInt(2, nfCompraPagamento.getCodigo_nf());
            statement.setString(3, nfCompraPagamento.getCodigo_pagamento());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir conta de pagamento");
        }
    }

    public NFCompraPagamento newInserir(NFCompraPagamento nfCompraPagamento) {
        String sql = "INSERT INTO nf_compra_pagamento (codigo_nf, codigo_pagamento) VALUES (?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, nfCompraPagamento.getCodigo_nf());
            statement.setString(2, nfCompraPagamento.getCodigo_pagamento());
            int linhasAfetadas = statement.executeUpdate();
            if (linhasAfetadas > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGerado = generatedKeys.getInt(1);
                        nfCompraPagamento.setCodigo(idGerado);
                    }
                }
            }
            return nfCompraPagamento;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<NFCompraPagamento> listarNFCompraPagamentos() {
        List<NFCompraPagamento> pagamentos = new ArrayList<>();
        String sql = "SELECT * FROM nf_compra_pagamento;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NFCompraPagamento nfCompraPagamento = new NFCompraPagamento();
                nfCompraPagamento.setCodigo(resultSet.getInt("codigo"));
                nfCompraPagamento.setCodigo_nf(resultSet.getInt("codigo_nf"));
                nfCompraPagamento.setCodigo_pagamento(resultSet.getString("codigo_pagamento"));
                pagamentos.add(nfCompraPagamento);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar pagamentos de nf de compra");
        }
        return pagamentos;
    }

}
