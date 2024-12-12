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
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ProvaPedroSantos {
    private ControleAlunos controleAlunos;
    private ControleTurma controleTurma;
    private List<Turma> turmas;

    public ProvaPedroSantos() {
        this.controleAlunos = new ControleAlunos();
        this.controleTurma = new ControleTurma();
        this.turmas = new ArrayList<>();
    }

    public void menu() {
        while (true) {
            String opcao = JOptionPane.showInputDialog("Menu:\n1 - Incluir turma\n2 - Incluir aluno\n3 - Consultar turma\n4 - Verificar quantidade de alunos casados\n5 - Sair");
            switch (opcao) {
                case "1":
                    incluirTurma();
                    break;
                case "2":
                    incluirAluno();
                    break;
                case "3":
                    consultarTurma();
                    break;
                case "4":
                    verificarAlunosCasados();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }

    private void incluirTurma() {
        String codigo = JOptionPane.showInputDialog("Digite o código da turma");
        String descricao = JOptionPane.showInputDialog("Digite a descrição da turma");
        int numeroAulas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de aulas (2, 4 ou 6)"));
        Turma turma = new Turma(codigo, descricao, numeroAulas);
        controleTurma.salvarTurma(turma);
        turmas.add(turma);
        JOptionPane.showMessageDialog(null, "Turma incluída com sucesso");
    }

    private void incluirAluno() {
        String matricula = JOptionPane.showInputDialog("Digite a matrícula do aluno");
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        char sexo = JOptionPane.showInputDialog("Digite o sexo do aluno (M ou F)").charAt(0);
        char estadoCivil = JOptionPane.showInputDialog("Digite o estado civil do aluno (S, C ou D)").charAt(0);
        Aluno aluno = new Aluno(matricula, nome, sexo, estadoCivil);
        controleAlunos.salvarAluno(aluno);
        JOptionPane.showMessageDialog(null, "Aluno incluído com sucesso");
    }

    private void consultarTurma() {
        String codigo = JOptionPane.showInputDialog("Digite o código da turma");
        for (Turma turma : turmas) {
            if (turma.getCodigo().equals(codigo)) {
                JOptionPane.showMessageDialog(null, turma.gerarRelatorio());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Turma não encontrada");
    }

    private void verificarAlunosCasados() {
        int totalCasados = 0;
        for (Turma turma : turmas) {
            for (Aluno aluno : turma.getAlunos()) {
                if (aluno.getEstadoCivil() == 'C') {
                    totalCasados++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Total de alunos casados: " + totalCasados);
    }

    public static void main(String[] args) {
        ProvaPedroSantos provapedrosantos = new ProvaPedroSantos();
        provapedrosantos.menu();
    }
}
