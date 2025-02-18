package model;

/**
 *
 * @author ph-santos
 */
public class ItemNFCompra {

    private int codigo;
    private int quantidade;
    private double valor_uni;
    private double valor_total;
    private int codigo_nf;
    private int codigo_produto;
    private Produto produto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_uni() {
        return valor_uni;
    }

    public void setValor_uni(double valor_uni) {
        this.valor_uni = valor_uni;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public int getCodigo_nf() {
        return codigo_nf;
    }

    public void setCodigo_nf(int codigo_nf) {
        this.codigo_nf = codigo_nf;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    @Override
    public String toString() {
        return "ItemNFCompra{"
                + "codigo=" + codigo
                + ", quantidade=" + quantidade
                + ", valor_uni=" + valor_uni
                + ", valor_total=" + valor_total
                + ", codigo_nf=" + codigo_nf
                + ", codigo_produto=" + codigo_produto
                + '}';
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
