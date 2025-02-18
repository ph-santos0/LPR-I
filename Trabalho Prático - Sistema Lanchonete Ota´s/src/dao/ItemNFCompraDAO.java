package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ItemNFCompra;

/**
 *
 * @author ph-santos
 */
public class ItemNFCompraDAO {

    public void inserir(ItemNFCompra itemNFCompra) {
        String sql = "INSERT INTO item_nf_compra (codigo, quantidade, valor_uni, valor_total, codigo_nf, codigo_produto) VALUES (?, ?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, itemNFCompra.getCodigo());
            statement.setInt(2, itemNFCompra.getQuantidade());
            statement.setDouble(3, itemNFCompra.getValor_uni());
            statement.setDouble(4, itemNFCompra.getValor_total());
            statement.setInt(5, itemNFCompra.getCodigo_nf());
            statement.setInt(6, itemNFCompra.getCodigo_produto());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir item na nota fiscal de compra", e);
        }
    }
    
    public ItemNFCompra newInserir(ItemNFCompra itemNFCompra) {
        String sql = "INSERT INTO item_nf_compra (quantidade, valor_uni, valor_total, codigo_nf, codigo_produto) VALUES (?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, itemNFCompra.getQuantidade());
            statement.setDouble(2, itemNFCompra.getValor_uni());
            statement.setDouble(3, itemNFCompra.getValor_total());
            statement.setInt(4, itemNFCompra.getCodigo_nf());
            statement.setInt(5, itemNFCompra.getCodigo_produto());
            int linhasAfetadas = statement.executeUpdate();
            if (linhasAfetadas > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGerado = generatedKeys.getInt(1);
                        itemNFCompra.setCodigo(idGerado);
                    }
                }
            }
            return itemNFCompra;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir itens da nota fiscal");
            return null;
        }
    }

    public List<ItemNFCompra> listarItensNFCompra() {
        List<ItemNFCompra> itensNF = new ArrayList<>();
        String sql = "SELECT * FROM item_nf_compra;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                ItemNFCompra itemNFCompra = new ItemNFCompra();
                itemNFCompra.setCodigo(resultSet.getInt("codigo"));
                itemNFCompra.setQuantidade(resultSet.getInt("quantidade"));
                itemNFCompra.setValor_uni(resultSet.getDouble("valor_uni"));
                itemNFCompra.setValor_total(resultSet.getDouble("valor_total"));
                itemNFCompra.setCodigo_nf(resultSet.getInt("codigo_nf"));
                itemNFCompra.setCodigo_produto(resultSet.getInt("codigo_produto"));
                itensNF.add(itemNFCompra);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar itens da nota fiscal de compra", e);
        }
        return itensNF;
    }
}
