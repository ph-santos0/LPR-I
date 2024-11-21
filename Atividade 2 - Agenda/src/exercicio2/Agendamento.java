package exercicio2;

public class Agendamento {
    private int hora;
    private Pessoa pessoa;

    public Agendamento(int hora, Pessoa pessoa) {
        this.hora = hora;
        this.pessoa = pessoa;
    }

    public int getHora() {
        return hora;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
