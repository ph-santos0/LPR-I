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

public class ControleAlunos {
    public void salvarAluno(Aluno aluno) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("alunos.txt", true))) {
            writer.println(aluno.getMatricula() + ";" + aluno.getNome() + ";" + aluno.getSexo() + ";" + aluno.getEstadoCivil());
        } catch (IOException e) {
            System.err.println("Erro ao salvar aluno: " + e.getMessage());
        }
    }
}