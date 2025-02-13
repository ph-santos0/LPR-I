package provalp2025;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoControle {

    private Connection connection;

    public ProdutoControle() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:seubanco:url", "usuario", "senha");
    }

    public void inserir(Produto p) throws SQLException {
        String sql = "INSERT INTO Produto (codigo, nome, estoque, precovenda, pesavel, ativo) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, p.getCodigo());
            stmt.setString(2, p.getNome());
            stmt.setFloat(3, p.getEstoque());
            stmt.setFloat(4, p.getPrecovenda());
            stmt.setBoolean(5, p.getPesavel());
            stmt.setBoolean(6, p.getAtivo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto: " + e.getMessage(), e);
        }
    }

    public List<Produto> getTodos() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM Produto";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Produto p = new Produto();
                p.setCodigo(rs.getInt("codigo"));
                p.setNome(rs.getString("nome"));
                p.setEstoque(rs.getFloat("estoque"));
                p.setPrecovenda(rs.getFloat("precovenda"));
                p.setPesavel(rs.getBoolean("pesavel"));
                p.setAtivo(rs.getBoolean("ativo"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao recuperar produtos: " + e.getMessage(), e);
        }
        return produtos;
    }
}
