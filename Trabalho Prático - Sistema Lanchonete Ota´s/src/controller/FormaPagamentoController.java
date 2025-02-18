package controller;

import dao.FormaPagamentoDAO;
import java.util.List;
import model.FormaPagamento;

/**
 * @author wfabi0
 */
public class FormaPagamentoController {

    private final FormaPagamentoDAO formaPagamentoDAO = new FormaPagamentoDAO();

    public List<FormaPagamento> listar() {
        return formaPagamentoDAO.listarFormasPagamento();
    }

    public FormaPagamento procurarPorNome(String formaNome) {
        try {
            List<FormaPagamento> formasPagamentos = formaPagamentoDAO.procurarPorNome(formaNome);
            if (formasPagamentos.isEmpty()) {
                return null;
            }
            return formaPagamentoDAO.procurarPorNome(formaNome).get(0);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
