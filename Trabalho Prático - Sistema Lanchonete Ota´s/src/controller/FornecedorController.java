package controller;

import dao.FornecedorDAO;
import java.util.List;
import model.Fornecedor;

/**
 *
 * @author joaop
 */
public class FornecedorController {

    private final FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public boolean inserir(Fornecedor fornecedor) {
        try {
            fornecedorDAO.inserir(fornecedor);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<Fornecedor> getTodosFornecedores() {
        try {
            return fornecedorDAO.listarFornecedores();
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }
}