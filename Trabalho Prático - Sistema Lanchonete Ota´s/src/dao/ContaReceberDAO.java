package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ContaReceber;

/**
 *
 * @author ph-santos
 */
public class ContaReceberDAO {

    public void inserir(ContaReceber contaReceber) {
        String sql = "INSERT INTO contareceber (codigo, data_venda, data_vencimento, data_paga, valor, codigo_nf, cpf_cliente) VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, contaReceber.getCodigo());
            statement.setDate(2, contaReceber.getData_venda());
            statement.setDate(3, contaReceber.getData_vencimento());
            statement.setDate(4, contaReceber.getData_paga());
            statement.setDouble(5, contaReceber.getValor());
            statement.setInt(6, contaReceber.getCodigo_nf());
            statement.setString(7, contaReceber.getCpf_cliente());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir uma conta a receber", e);
        }
    }

    public List<ContaReceber> listarContas() {
        List<ContaReceber> contasReceber = new ArrayList<>();
        String sql = "SELECT * FROM contareceber;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                ContaReceber contaReceber = new ContaReceber();
                contaReceber.setCodigo(resultSet.getInt("codigo"));
                contaReceber.setData_venda(resultSet.getDate("data_venda"));
                contaReceber.setData_vencimento(resultSet.getDate("data_vencimento"));
                contaReceber.setData_paga(resultSet.getDate("data_paga"));
                contaReceber.setValor(resultSet.getDouble("valor"));
                contaReceber.setCodigo_nf(resultSet.getInt("codigo_nf"));
                contaReceber.setCpf_cliente(resultSet.getString("cpf_cliente"));
                contasReceber.add(contaReceber);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar contas a receber", e);
        }
        return contasReceber;
    }
}