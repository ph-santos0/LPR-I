package model;

/**
 *
 * @author wfabi0
 */
public class Produto {

    private int codigo;
    private String nome;
    private int estoque;
    private double valor;
    private double imposto;
    private String unidade;

    public Produto() {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;
        this.imposto = imposto;
        this.unidade = unidade;
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome='" + nome + '\'' + ", estoque=" + estoque + ", valor=" + valor + ", imposto=" + imposto + ", unidade='" + unidade + '\'' + '}';
    }
    
    public Object[] getDadosModel() {
        Object[] retorno = new Object[] { getCodigo(), getNome(), getValor(), getEstoque(), getImposto(), getUnidade() };
        return retorno;
    }
}
