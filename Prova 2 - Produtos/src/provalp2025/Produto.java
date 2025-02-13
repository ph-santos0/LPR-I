package provalp2025;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fabio
 */
public class Produto {

    private Integer codigo;
    private String nome;
    private Float estoque;
    private Float precovenda;
    private Boolean pesavel;
    private Boolean ativo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getEstoque() {
        return estoque;
    }

    public void setEstoque(Float estoque) {
        this.estoque = estoque;
    }

    public Float getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Float precovenda) {
        this.precovenda = precovenda;
    }

    public Boolean getPesavel() {
        return pesavel;
    }

    public void setPesavel(Boolean pesavel) {
        this.pesavel = pesavel;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getDadosModel() {
        return "Código: " + this.codigo + ", Nome: " + this.nome + ", Estoque: " + this.estoque
                + ", Preço de Venda: " + this.precovenda + ", Pesável: " + this.pesavel + ", Ativo: " + this.ativo;
    }

}
