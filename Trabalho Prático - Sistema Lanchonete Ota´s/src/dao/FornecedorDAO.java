package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

public class FornecedorDAO {

    public void inserir(Fornecedor fornecedor) {
        String sql = "INSERT INTO Fornecedor (CNPJ, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, fornecedor.getCNPJ());
            statement.setString(2, fornecedor.getNome());
            statement.setString(3, fornecedor.getTelFixo());
            statement.setString(4, fornecedor.getTelCelular());
            statement.setString(5, fornecedor.getCidade());
            statement.setString(6, fornecedor.getBairro());
            statement.setInt(7, fornecedor.getNumero());
            statement.setString(8, fornecedor.getRua());
            statement.setString(9, fornecedor.getCEP());
            statement.setString(10, fornecedor.getSiglaUF());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir fornecedor", e);
        }
    }

    public List<Fornecedor> listarFornecedores() {
        List<Fornecedor> fornecedores = new ArrayList<>();
        String sql = "SELECT * FROM Fornecedor;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setCNPJ(resultSet.getString("CNPJ"));
                fornecedor.setNome(resultSet.getString("Nome"));
                fornecedor.setTelFixo(resultSet.getString("Tel_Fixo"));
                fornecedor.setTelCelular(resultSet.getString("Tel_Celular"));
                fornecedor.setCidade(resultSet.getString("Cidade"));
                fornecedor.setBairro(resultSet.getString("Bairro"));
                fornecedor.setNumero(resultSet.getInt("Numero"));
                fornecedor.setRua(resultSet.getString("Rua"));
                fornecedor.setCEP(resultSet.getString("CEP"));
                fornecedor.setSiglaUF(resultSet.getString("Sigla_UF"));
                fornecedores.add(fornecedor);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar fornecedores", e);
        }
        return fornecedores;
    }
}
