package model;

import java.sql.Date;

/**
 *
 * @author wfabi0
 */
public class ContaPagar {
    private int codigo;
    private Date data_compra;
    private Date data_paga;
    private Date data_vencimento;
    private double valor;
    private int codigo_nf;
    private String cnpj_fonecedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    public Date getData_paga() {
        return data_paga;
    }

    public void setData_paga(Date data_paga) {
        this.data_paga = data_paga;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo_nf() {
        return codigo_nf;
    }

    public void setCodigo_nf(int codigo_nf) {
        this.codigo_nf = codigo_nf;
    }

    public String getCnpj_fonecedor() {
        return cnpj_fonecedor;
    }

    public void setCnpj_fonecedor(String cnpj_fonecedor) {
        this.cnpj_fonecedor = cnpj_fonecedor;
    }
    
    @Override
    public String toString() {
        return "ContaPagar{" +
                "codigo=" + codigo +
                ", data_compra=" + data_compra +
                ", data_paga=" + data_paga +
                ", data_vencimento=" + data_vencimento +
                ", valor=" + valor +
                ", codigo_nf=" + codigo_nf +
                ", cnpj_fonecedor='" + cnpj_fonecedor + '\'' +
                '}';
    }
}
