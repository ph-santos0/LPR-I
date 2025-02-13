package provalp2025;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection con;

    public ProdutoDAO(Connection con) {
        this.con = con;
    }

    public void inserir(Produto p) throws Exception {
        String sql = "INSERT INTO Produto (codigo, nome, estoque, precovenda, pesavel, ativo) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setInt(1, p.getCodigo());
            pstm.setString(2, p.getNome());
            pstm.setFloat(3, p.getEstoque());
            pstm.setFloat(4, p.getPrecovenda());
            pstm.setBoolean(5, p.getPesavel());
            pstm.setBoolean(6, p.getAtivo());

            pstm.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Erro ao inserir produto: " + e.getMessage(), e);
        }
    }

    public List<Produto> getTodos() throws Exception {
        String sql = "SELECT * FROM Produto";
        List<Produto> lista = new ArrayList<>();
        
        try (PreparedStatement pstm = con.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {
            
            while (rs.next()) {
                Produto p = new Produto();
                p.setCodigo(rs.getInt("codigo"));
                p.setNome(rs.getString("nome"));
                p.setEstoque(rs.getFloat("estoque"));
                p.setPrecovenda(rs.getFloat("precovenda"));
                p.setPesavel(rs.getBoolean("pesavel"));
                p.setAtivo(rs.getBoolean("ativo"));

                lista.add(p);
            }
        } catch (Exception e) {
            throw new Exception("Erro ao recuperar produtos: " + e.getMessage(), e);
        }
        return lista;
    }
}
