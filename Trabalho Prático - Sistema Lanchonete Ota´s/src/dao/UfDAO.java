package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.UF;

/**
 *
 * @author wfabi0
 */
public class UfDAO {

    public void inserir(UF uf) {
        String sql = "INSERT INTO uf (codigo, sigla) VALUES (?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, uf.getCodigo());
            statement.setString(2, uf.getSigla());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir produto", e);
        }
    }

    public List<UF> listarUFs() {
        List<UF> ufs = new ArrayList<>();
        String sql = "SELECT * FROM uf;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                UF uf = new UF();
                uf.setCodigo(resultSet.getInt("codigo"));
                uf.setSigla(resultSet.getString("sigla"));
                ufs.add(uf);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar ufs", e);
        }
        return ufs;
    }

    public List<UF> procurarPorSigla(String sigla) {
        List<UF> ufs = new ArrayList<>();
        String sql = "SELECT * FROM uf WHERE sigla = ?";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, sigla);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                UF uf = new UF();
                uf.setCodigo(resultSet.getInt("codigo"));
                uf.setSigla(resultSet.getString("sigla"));
                ufs.add(uf);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar ufs", e);
        }
        return ufs;
    }

    public void setupSiglas() {
        String sql = "INSERT IGNORE INTO uf (codigo, sigla) VALUES (?, ?);";
        try {
            String[] ufs = {
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
                "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
                "RS", "RO", "RR", "SC", "SP", "SE", "TO"
            };
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            for (int i = 0; i < ufs.length; i++) {
                statement.setInt(1, i + 1);
                statement.setString(2, ufs[i]);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Siglas já criadas", e);
        }
    }

}
