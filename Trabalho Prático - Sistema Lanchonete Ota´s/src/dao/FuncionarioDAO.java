package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;

/**
 *
 * @author wfabi0
 */
public class FuncionarioDAO {

    public Funcionario autenticarUsuario(Funcionario funcionario) {
        String sql = "SELECT * FROM funcionario WHERE nome = ? AND senha = ?";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getSenha());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Funcionario novoFuncionario = new Funcionario();
                novoFuncionario.setId(resultSet.getInt("ID"));
                novoFuncionario.setNome(resultSet.getString("Nome"));
                novoFuncionario.setSenha(resultSet.getString("Senha"));
                novoFuncionario.setCargo(resultSet.getString("Cargo"));
                novoFuncionario.setDataCriada(resultSet.getDate("Data_Criada"));
                novoFuncionario.setDataAtualizada(resultSet.getDate("Data_Atualizada"));
                return novoFuncionario;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao autenticar usuário");
            System.out.println(e);
            return null;
        }
        return null;
    }

}
