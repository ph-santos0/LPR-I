package exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int opcao;

        do {
            String menu = "Agenda:\n" +
                    "1. Adicionar agendamento\n" +
                    "2. Ver todos os agendamentos\n" +
                    "3. Excluir agendamento\n" +
                    "4. Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do agendamento:"));
                    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
                    String telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa:");
                    int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do agendamento:"));
                    Pessoa pessoa = new Pessoa(codigo, nome, telefone);
                    Agendamento agendamento = new Agendamento(hora, pessoa);
                    agenda.adicionarAgendamento(agendamento);
                    break;

                case 2:
                    agenda.listarAgendamentos();
                    break;

                case 3:
                    int horaExclusao = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do agendamento que deseja excluir:"));
                    agenda.excluirAgendamento(horaExclusao);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while (opcao != 4);
    }
}
