package model;

public class FormaPagamento {

    private int Codigo;
    private String Tipo;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "FormaPagamento{"
                + "Codigo=" + Codigo
                + ", Tipo='" + Tipo + '\''
                + '}';
    }
}
