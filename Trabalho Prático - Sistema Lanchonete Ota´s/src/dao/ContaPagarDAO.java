package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ContaPagar;

/**
 *
 * @author wfabi0
 */
public class ContaPagarDAO {

    public void inserir(ContaPagar contaPagar) {
        String sql = "INSERT INTO contapagar (codigo, data_compra, data_paga, data_vencimento, valor, codigo_nf, cnpj_fornecedor) VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, contaPagar.getCodigo());
            statement.setDate(2, contaPagar.getData_compra());
            statement.setDate(3, contaPagar.getData_paga());
            statement.setDate(4, contaPagar.getData_vencimento());
            statement.setDouble(5, contaPagar.getValor());
            statement.setInt(6, contaPagar.getCodigo_nf());
            statement.setString(7, contaPagar.getCnpj_fonecedor());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir uma conta a pagar", e);
        }
    }

    public List<ContaPagar> listarContas() {
        List<ContaPagar> contasPagar = new ArrayList<>();
        String sql = "SELECT * FROM contapagar;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                ContaPagar contaPagar = new ContaPagar();
                contaPagar.setCodigo(resultSet.getInt("codigo"));
                contaPagar.setData_compra(resultSet.getDate("data_compra"));
                contaPagar.setData_paga(resultSet.getDate("data_paga"));
                contaPagar.setData_vencimento(resultSet.getDate("data_vencimento"));
                contaPagar.setValor(resultSet.getDouble("valor"));
                contaPagar.setCodigo_nf(resultSet.getInt("codigo_nf"));
                contaPagar.setCnpj_fonecedor(resultSet.getString("cnpj_fornecedor"));
                contasPagar.add(contaPagar);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar produtos", e);
        }
        return contasPagar;
    }

}
