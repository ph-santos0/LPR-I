package controller;

import dao.ItemNFCompraDAO;
import java.util.List;
import model.ItemNFCompra;

/**
 *
 * @author ph-santos
 */
public class ItemNFCompraController {

    private final ItemNFCompraDAO itemNFCompraDAO = new ItemNFCompraDAO();

    public ItemNFCompra inserir(ItemNFCompra itemNFCompra) {
        try {
            return itemNFCompraDAO.newInserir(itemNFCompra);
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<ItemNFCompra> listarItensNFCompra() {
        return itemNFCompraDAO.listarItensNFCompra();
    }
}
