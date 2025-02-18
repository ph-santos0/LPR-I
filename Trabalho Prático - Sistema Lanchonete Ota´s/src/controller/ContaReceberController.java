package controller;

import dao.ContaReceberDAO;
import java.util.List;
import model.ContaReceber;

/**
 *
 * @author ph-santos
 */
public class ContaReceberController {

    private final ContaReceberDAO contaReceberDAO = new ContaReceberDAO();

    public boolean inserir(ContaReceber contaReceber) {
        try {
            contaReceberDAO.inserir(contaReceber);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<ContaReceber> getTodasContas() {
        return contaReceberDAO.listarContas();
    }
}
