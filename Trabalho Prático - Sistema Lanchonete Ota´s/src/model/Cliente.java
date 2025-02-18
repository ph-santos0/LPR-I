package model;

public class Cliente {

    private String cpf;
    private String nome;
    private String telFixo;
    private String telCelular;
    private String cidade;
    private String bairro;
    private int numero;
    private String rua;
    private String cep;
    private String siglaUF;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String telFixo, String telCelular, String cidade, String bairro, int numero, String rua, String cep, String siglaUF) {
        this.cpf = cpf;
        this.nome = nome;
        this.telFixo = telFixo;
        this.telCelular = telCelular;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.rua = rua;
        this.cep = cep;
        this.siglaUF = siglaUF;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSiglaUF() {
        return siglaUF;
    }

    public void setSiglaUF(String siglaUF) {
        this.siglaUF = siglaUF;
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "cpf='" + cpf + '\''
                + ", nome='" + nome + '\''
                + ", telFixo='" + telFixo + '\''
                + ", telCelular='" + telCelular + '\''
                + ", cidade='" + cidade + '\''
                + ", bairro='" + bairro + '\''
                + ", numero=" + numero
                + ", rua='" + rua + '\''
                + ", cep='" + cep + '\''
                + ", siglaUF='" + siglaUF + '\''
                + '}';
    }
}
