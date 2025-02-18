package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ItemNFVenda;

/**
 *
 * @author wfabi0
 */
public class ItemNFVendaDAO {

    public void inserir(ItemNFVenda itemNFVenda) {
        String sql = "INSERT INTO item_nf_venda (codigo, quantidade, valor_uni, valor_total, codigo_nf, codigo_produto) VALUES (?, ?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, itemNFVenda.getCodigo());
            statement.setInt(2, itemNFVenda.getQuantidade());
            statement.setDouble(3, itemNFVenda.getValor_uni());
            statement.setDouble(4, itemNFVenda.getValor_total());
            statement.setInt(5, itemNFVenda.getCodigo_nf());
            statement.setInt(6, itemNFVenda.getCodigo_produto());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir itens da nota fiscal");
        }
    }

    public ItemNFVenda newInserir(ItemNFVenda itemNFVenda) {
        String sql = "INSERT INTO item_nf_venda (quantidade, valor_uni, valor_total, codigo_nf, codigo_produto) VALUES (?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, itemNFVenda.getQuantidade());
            statement.setDouble(2, itemNFVenda.getValor_uni());
            statement.setDouble(3, itemNFVenda.getValor_total());
            statement.setInt(4, itemNFVenda.getCodigo_nf());
            statement.setInt(5, itemNFVenda.getCodigo_produto());
            int linhasAfetadas = statement.executeUpdate();
            if (linhasAfetadas > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGerado = generatedKeys.getInt(1);
                        itemNFVenda.setCodigo(idGerado);
                    }
                }
            }
            return itemNFVenda;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir itens da nota fiscal");
            return null;
        }
    }

    public List<ItemNFVenda> listarItensNFVenda() {
        List<ItemNFVenda> itensNF = new ArrayList<>();
        String sql = "SELECT * FROM nf_compra_pagamento;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                ItemNFVenda nfCompraPagamento = new ItemNFVenda();
                nfCompraPagamento.setCodigo(resultSet.getInt("codigo"));
                nfCompraPagamento.setQuantidade(resultSet.getInt("quantidade"));
                nfCompraPagamento.setValor_uni(resultSet.getDouble("valor_uni"));
                nfCompraPagamento.setValor_total(resultSet.getDouble("valor_total"));
                nfCompraPagamento.setCodigo_nf(resultSet.getInt("codigo_nf"));
                nfCompraPagamento.setCodigo_produto(resultSet.getInt("codigo_produto"));
                itensNF.add(nfCompraPagamento);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar pagamentos de nf de compra");
        }
        return itensNF;
    }

}
