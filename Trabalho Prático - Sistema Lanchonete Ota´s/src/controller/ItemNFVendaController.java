package controller;

import dao.ItemNFVendaDAO;
import java.util.List;
import model.ItemNFVenda;

/**
 *
 * @author wfabi0
 */
public class ItemNFVendaController {

    private final ItemNFVendaDAO itemNFVendaDAO = new ItemNFVendaDAO();

    public ItemNFVenda inserir(ItemNFVenda itemNFVenda) {
        try {
            return itemNFVendaDAO.newInserir(itemNFVenda);
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<ItemNFVenda> listarItensNFVenda() {
        return itemNFVendaDAO.listarItensNFVenda();
    }

}
