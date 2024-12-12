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
public class Aluno {
    private String matricula;
    private String nome;
    private char sexo;
    private char estadoCivil;

    public Aluno(String matricula, String nome, char sexo, char estadoCivil) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }
    
}
