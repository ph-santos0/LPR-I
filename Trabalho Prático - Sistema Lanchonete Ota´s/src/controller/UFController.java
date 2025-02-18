package controller;

import dao.UfDAO;
import java.util.List;
import model.UF;

/**
 *
 * @author wfabi0
 */
public class UFController {

    private final UfDAO ufDAO = new UfDAO();

    public boolean inserir(UF uf) {
        try {
            ufDAO.inserir(uf);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<UF> getTodosUFs() {
        return ufDAO.listarUFs();
    }

    public List<UF> procurarSigla(String sigla) {
        return ufDAO.procurarPorSigla(sigla);
    }

    public boolean setupSiglas() {
        try {
            ufDAO.setupSiglas();
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

}
