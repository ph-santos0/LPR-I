/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapedrosantos;

/**
 *
 * @author 0077113
 */
import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigo;
    private String descricao;
    private int numeroAulas;
    private List<Aluno> alunos;

    public Turma(String codigo, String descricao, int numeroAulas) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.numeroAulas = numeroAulas;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Código: ").append(codigo).append("\n");
        relatorio.append("Descrição: ").append(descricao).append("\n");
        relatorio.append("Número de aulas: ").append(numeroAulas).append("\n");
        relatorio.append("Alunos:\n");
        for (Aluno aluno : alunos) {
            relatorio.append(aluno.getMatricula()).append(" - ").append(aluno.getNome()).append("\n");
        }
        return relatorio.toString();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }
}
