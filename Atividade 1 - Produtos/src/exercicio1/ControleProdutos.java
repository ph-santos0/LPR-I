/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author 0077113
 */
import java.util.ArrayList;
public class ControleProdutos {
    private ArrayList<Produtos> produtos;

    
    public ControleProdutos() {
        this.produtos = new ArrayList<>();
    }


    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    public String getProdutos() {
        StringBuilder sb = new StringBuilder();
        for (Produtos produto : produtos) {
            sb.append(produto.toString()).append("\n\n");
        }
        return sb.toString();
    }
}

  

    