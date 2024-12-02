package exercicio1;

import java.io.*;
import java.util.ArrayList;

public class ControleProdutos {

    private ArrayList<Produtos> produtos;

    public ControleProdutos() {
        this.produtos = new ArrayList<>();
        carregarProdutosDeArquivo();
    }

    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
        salvarProdutosEmArquivo();
    }

    public boolean removerProduto(int codigo) {
        for (Produtos produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtos.remove(produto);
                salvarProdutosEmArquivo();
                return true;
            }
        }
        return false;
    }

    public String getProdutos() {
        StringBuilder sb = new StringBuilder();
        for (Produtos produto : produtos) {
            sb.append(produto.toString()).append("\n\n");
        }
        return sb.toString();
    }

    private void salvarProdutosEmArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("produtos.txt"))) {
            for (Produtos produto : produtos) {
                writer.write(produto.getCodigo() + ";"
                        + produto.getNome() + ";"
                        + produto.getPreco() + ";"
                        + produto.getUnidade() + ";"
                        + produto.getEstoque());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    private void carregarProdutosDeArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("produtos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                int codigo = Integer.parseInt(partes[0]);
                String nome = partes[1];
                double preco = Double.parseDouble(partes[2]);
                String unidade = partes[3];
                int estoque = Integer.parseInt(partes[4]);

                Produtos produto = new Produtos(codigo, nome, preco, unidade, estoque);
                produtos.add(produto);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            System.err.println("Erro ao carregar produtos: " + e.getMessage());
        }
    }
}
