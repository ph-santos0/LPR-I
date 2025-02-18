package controller;

import dao.NFCompraPagamentoDAO;
import java.util.List;
import model.NFCompraPagamento;

/**
 *
 * @author wfabi0
 */
public class NFCompraPagamentoController {

    private final NFCompraPagamentoDAO nfCompraPagamentoDAO = new NFCompraPagamentoDAO();

    public NFCompraPagamento inserir(NFCompraPagamento nfCompraPagamento) {
        try {
            return nfCompraPagamentoDAO.newInserir(nfCompraPagamento);
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<NFCompraPagamento> listarNFCompraPagamentos() {
        return nfCompraPagamentoDAO.listarNFCompraPagamentos();
    }

}
