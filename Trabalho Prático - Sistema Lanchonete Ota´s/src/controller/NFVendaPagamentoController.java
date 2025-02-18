package controller;

import dao.NFVendaPagamentoDAO;
import java.util.List;
import model.NFVendaPagamento;

/**
 *
 * @author ph-santos
 */
public class NFVendaPagamentoController {

    private final NFVendaPagamentoDAO nfVendaPagamentoDAO = new NFVendaPagamentoDAO();

    public NFVendaPagamento inserir(NFVendaPagamento nfVendaPagamento) {
        try {
            return nfVendaPagamentoDAO.newInserir(nfVendaPagamento);
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<NFVendaPagamento> listarNFVendaPagamentos() {
        return nfVendaPagamentoDAO.listarNFVendaPagamentos();
    }
}
