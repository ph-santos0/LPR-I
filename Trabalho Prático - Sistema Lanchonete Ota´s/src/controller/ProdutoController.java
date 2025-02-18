package controller;

import dao.ProdutoDAO;
import java.util.List;
import model.Produto;

/**
 *
 * @author wfabi0
 */
public class ProdutoController {

    private final ProdutoDAO produtoDAO = new ProdutoDAO();

    public boolean inserir(Produto produto) {
        try {
            produtoDAO.inserir(produto);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean editar(Produto produto) {
        try {
            produtoDAO.atualizar(produto);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<Produto> getTodosProdutos() {
        try {
            return produtoDAO.listarProdutos();
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<Produto> consultarPorCodigo(int codigo) {
        return produtoDAO.procurarPorCodigo(codigo);
    }

    public List<Produto> consultarPorNome(String nome) {
        return produtoDAO.procurarPorNome(nome);
    }

}
