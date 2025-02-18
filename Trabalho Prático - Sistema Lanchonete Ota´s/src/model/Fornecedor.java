package model;

public class Fornecedor {

    private String CNPJ;
    private String Nome;
    private String TelFixo;
    private String TelCelular;
    private String Cidade;
    private String Bairro;
    private int Numero;
    private String Rua;
    private String CEP;
    private String SiglaUF;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelFixo() {
        return TelFixo;
    }

    public void setTelFixo(String TelFixo) {
        this.TelFixo = TelFixo;
    }

    public String getTelCelular() {
        return TelCelular;
    }

    public void setTelCelular(String TelCelular) {
        this.TelCelular = TelCelular;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getSiglaUF() {
        return SiglaUF;
    }

    public void setSiglaUF(String SiglaUF) {
        this.SiglaUF = SiglaUF;
    }

    @Override
    public String toString() {
        return "Fornecedor{"
                + "CNPJ='" + CNPJ + '\''
                + ", Nome='" + Nome + '\''
                + ", TelFixo='" + TelFixo + '\''
                + ", TelCelular='" + TelCelular + '\''
                + ", Cidade='" + Cidade + '\''
                + ", Bairro='" + Bairro + '\''
                + ", Numero=" + Numero
                + ", Rua='" + Rua + '\''
                + ", CEP='" + CEP + '\''
                + ", SiglaUF='" + SiglaUF + '\''
                + '}';
    }
}
