package model;

import java.sql.Date;

/**
 *
 * @author ph-santos
 */
public class ContaReceber {
    private int codigo;
    private Date data_venda;
    private Date data_vencimento;
    private Date data_paga;
    private double valor;
    private int codigo_nf;
    private String cpf_cliente;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public Date getData_paga() {
        return data_paga;
    }

    public void setData_paga(Date data_paga) {
        this.data_paga = data_paga;
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

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    @Override
    public String toString() {
        return "ContaReceber{" +
                "codigo=" + codigo +
                ", data_venda=" + data_venda +
                ", data_vencimento=" + data_vencimento +
                ", data_paga=" + data_paga +
                ", valor=" + valor +
                ", codigo_nf=" + codigo_nf +
                ", cpf_cliente='" + cpf_cliente + '\'' +
                '}';
    }
}