package dao;

import database.ConexaoBanco;
import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO Cliente (CPF, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getTelFixo());
            statement.setString(4, cliente.getTelCelular());
            statement.setString(5, cliente.getCidade());
            statement.setString(6, cliente.getBairro());
            statement.setInt(7, cliente.getNumero());
            statement.setString(8, cliente.getRua());
            statement.setString(9, cliente.getCep());
            statement.setString(10, cliente.getSiglaUF());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir cliente", e);
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Cliente;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setCpf(resultSet.getString("CPF"));
                cliente.setNome(resultSet.getString("Nome"));
                cliente.setTelFixo(resultSet.getString("Tel_Fixo"));
                cliente.setTelCelular(resultSet.getString("Tel_Celular"));
                cliente.setCidade(resultSet.getString("Cidade"));
                cliente.setBairro(resultSet.getString("Bairro"));
                cliente.setNumero(resultSet.getInt("Numero"));
                cliente.setRua(resultSet.getString("Rua"));
                cliente.setCep(resultSet.getString("CEP"));
                cliente.setSiglaUF(resultSet.getString("Sigla_UF"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar clientes", e);
        }
        return clientes;
    }
}
