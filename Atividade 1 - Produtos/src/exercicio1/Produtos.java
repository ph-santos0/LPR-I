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
public class Produtos {

    public Produtos() {
    }
    
    private int codigo;
    private String nome;
    private double preco;
    private String unidade;
    private int estoque;

    public Produtos(int codigo, String nome, double preco, String unidade, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.unidade = unidade;
        this.estoque = estoque;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String toString() {
        return "Código: " + codigo + "\nNome: " + nome + "\nPreço: R$ " + preco 
                + "\nUnidade: " + unidade + "\nEstoque: " + estoque;
    }
    
    
    
}
