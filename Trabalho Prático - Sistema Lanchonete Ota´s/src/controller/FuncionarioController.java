package controller;

import dao.FuncionarioDAO;
import java.sql.SQLException;
import model.Funcionario;

/**
 *
 * @author wfabi0
 */
public class FuncionarioController {

    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public FuncionarioController() {
    }

    public Funcionario autenticar(Funcionario funcionario) {
        try {
            return funcionarioDAO.autenticarUsuario(funcionario);
        } catch (Exception e) {
            System.out.println("Funcionario não encontrado");
            return null;
        }
    }

}
