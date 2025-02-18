package model;

/**
 *
 * @author wfabi0
 */
public class UF {

    private int codigo;
    private String sigla;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "UF{"
                + "codigo=" + codigo
                + ", sigla='" + sigla + '\''
                + '}';
    }
}
