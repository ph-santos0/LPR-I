package exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Agenda {
    private ArrayList<Agendamento> agendamentos = new ArrayList<>();

    public void adicionarAgendamento(Agendamento agendamento) {
        if (verificarAgendamento(agendamento.getHora())) {
            JOptionPane.showMessageDialog(null, "Já existe um agendamento neste horário.");
        } else {
            agendamentos.add(agendamento);
            JOptionPane.showMessageDialog(null, "Agendamento adicionado com sucesso.");
        }
    }

    private boolean verificarAgendamento(int hora) {
        for (Agendamento ag : agendamentos) {
            if (ag.getHora() == hora) {
                return true;
            }
        }
        return false;
    }

    public void listarAgendamentos() {
        if (agendamentos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum agendamento encontrado.");
            return;
        }

        agendamentos.sort(Comparator.comparingInt(Agendamento::getHora));

        StringBuilder lista = new StringBuilder("Agendamentos:\n");
        for (Agendamento ag : agendamentos) {
            Pessoa pessoa = ag.getPessoa();
            lista.append("Hora: ").append(ag.getHora())
                 .append("\nNome: ").append(pessoa.getNome())
                 .append("\nTelefone: ").append(pessoa.getTelefone())
                 .append("\n\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    public void excluirAgendamento(int hora) {
        for (Agendamento ag : agendamentos) {
            if (ag.getHora() == hora) {
                agendamentos.remove(ag);
                JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nenhum agendamento encontrado para a hora informada.");
    }
}
