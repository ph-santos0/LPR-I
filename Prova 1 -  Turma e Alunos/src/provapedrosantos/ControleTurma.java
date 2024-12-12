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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ControleTurma {
    public void salvarTurma(Turma turma) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("turmas.txt", true))) {
            writer.println(turma.getCodigo() + ";" + turma.getDescricao() + ";" + turma.getNumeroAulas());
            for (Aluno aluno : turma.getAlunos()) {
                writer.println(aluno.getMatricula());
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar turma: " + e.getMessage());
        }
    }
    
}