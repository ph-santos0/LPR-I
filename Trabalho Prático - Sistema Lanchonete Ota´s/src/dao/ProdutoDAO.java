package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author wfabi0
 */
public class ProdutoDAO {

    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (codigo, nome, estoque, valor, imposto, unidade) VALUES (?, ?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, produto.getCodigo());
            statement.setString(2, produto.getNome());
            statement.setInt(3, produto.getEstoque());
            statement.setDouble(4, produto.getValor());
            statement.setDouble(5, produto.getImposto());
            statement.setString(6, produto.getUnidade());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir produto", e);
        }
    }

    public void atualizar(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, estoque = ?, valor = ?, imposto = ?, unidade = ? WHERE codigo = ?;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setInt(2, produto.getEstoque());
            statement.setDouble(3, produto.getValor());
            statement.setDouble(4, produto.getImposto());
            statement.setString(5, produto.getUnidade());
            statement.setInt(6, produto.getCodigo());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir produto", e);
        }
    }

    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setCodigo(resultSet.getInt("codigo"));
                produto.setNome(resultSet.getString("nome"));
                produto.setEstoque(resultSet.getInt("estoque"));
                produto.setValor(resultSet.getDouble("valor"));
                produto.setImposto(resultSet.getDouble("imposto"));
                produto.setUnidade(resultSet.getString("unidade"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar produtos", e);
        }
        return produtos;
    }

    public List<Produto> procurarPorCodigo(int codigo) {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto WHERE codigo = ?;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, codigo);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setCodigo(resultSet.getInt("codigo"));
                produto.setNome(resultSet.getString("nome"));
                produto.setEstoque(resultSet.getInt("estoque"));
                produto.setValor(resultSet.getDouble("valor"));
                produto.setImposto(resultSet.getDouble("imposto"));
                produto.setUnidade(resultSet.getString("unidade"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("Erro ao procurar produto pelo codigo", e);
        }
        return produtos;
    }

    public List<Produto> procurarPorNome(String nome) {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto WHERE LOWER(nome) LIKE LOWER(?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + nome + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setCodigo(resultSet.getInt("codigo"));
                produto.setNome(resultSet.getString("nome"));
                produto.setEstoque(resultSet.getInt("estoque"));
                produto.setValor(resultSet.getDouble("valor"));
                produto.setImposto(resultSet.getDouble("imposto"));
                produto.setUnidade(resultSet.getString("unidade"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("Erro ao procurar produto pelo nome", e);
        }
        return produtos;
    }
}
