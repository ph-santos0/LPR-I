package controller;

import dao.ContaPagarDAO;
import java.util.List;
import model.ContaPagar;

/**
 *
 * @author wfabi0
 */
public class ContaPagarController {

    private final ContaPagarDAO contaPagarDAO = new ContaPagarDAO();

    public boolean inserir(ContaPagar contaPagar) {
        try {
            contaPagarDAO.inserir(contaPagar);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<ContaPagar> getTodaContas() {
        return contaPagarDAO.listarContas();
    }

}
