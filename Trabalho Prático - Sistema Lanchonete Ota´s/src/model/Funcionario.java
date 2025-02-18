package model;

import java.sql.Date;

/**
 *
 * @author wfabi0
 */
public class Funcionario {

    private int id;
    private String nome;
    private String senha;
    private String cargo;
    private Date dataCriada;
    private Date dataAtualizada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataCriada() {
        return dataCriada;
    }

    public void setDataCriada(Date dataCriada) {
        this.dataCriada = dataCriada;
    }

    public Date getDataAtualizada() {
        return dataAtualizada;
    }

    public void setDataAtualizada(Date dataAtualizada) {
        this.dataAtualizada = dataAtualizada;
    }

    @Override
    public String toString() {
        return "Funcionario{"
                + "ID='" + id + '\''
                + ", Nome='" + nome + '\''
                + ", Senha='" + senha + '\''
                + ", Cargo='" + cargo + '\''
                + ", DatCriada='" + dataCriada + '\''
                + ", DataAtualizada='" + dataAtualizada + '\''
                + '}';
    }
}
