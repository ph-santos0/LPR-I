package controller;

import dao.ClienteDAO;
import java.util.List;
import model.Cliente;

/**
 *
 * @author joaop
 */
public class ClienteController {

    private final ClienteDAO clienteDAO = new ClienteDAO();

    public boolean inserir(Cliente cliente) {
        try {
            clienteDAO.inserir(cliente);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<Cliente> getTodosClientes() {
        try {
            return clienteDAO.listarClientes();
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }
}