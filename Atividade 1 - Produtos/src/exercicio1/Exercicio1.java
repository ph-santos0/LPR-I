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
import javax.swing.JOptionPane;

public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleProdutos controleProduto = new ControleProdutos();

        while (true) {
            String[] options = {"Adicionar Produto", "Ver Produtos", "Remover Produto", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Controle de Produtos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                try {
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
                    String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
                    String unidade = JOptionPane.showInputDialog("Digite a unidade de medida (ex: kg, unidade, litro):");
                    int estoque = Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque do produto:"));

                    Produtos produto = new Produtos(codigo, nome, preco, unidade, estoque);
                    controleProduto.adicionarProduto(produto);
                    JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira valores válidos.");
                }
            } else if (choice == 1) {
                String produtosTexto = controleProduto.getProdutos();
                if (produtosTexto.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado.");
                } else {
                    JOptionPane.showMessageDialog(null, produtosTexto);
                }
            } else if (choice == 2) {
                try {
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto a ser removido:"));
                    boolean removido = controleProduto.removerProduto(codigo);
                    if (removido) {
                        JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Código inválido. Por favor, insira um valor válido.");
                }
            } else if (choice == 3) {
                break;
            }
        }
    }

}
