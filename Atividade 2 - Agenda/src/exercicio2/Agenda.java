package exercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Agenda {
    private ArrayList<Agendamento> agendamentos = new ArrayList<>();
    private final String ARQUIVO_AGENDAMENTOS = "agendamentos.txt";

    public Agenda() {
        carregarAgendamentosDeArquivo();
    }

    public void adicionarAgendamento(Agendamento agendamento) {
        if (verificarAgendamento(agendamento.getHora())) {
            JOptionPane.showMessageDialog(null, "Já existe um agendamento neste horário.");
        } else {
            agendamentos.add(agendamento);
            salvarAgendamentosEmArquivo();
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
                salvarAgendamentosEmArquivo();
                JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nenhum agendamento encontrado para a hora informada.");
    }

    private void salvarAgendamentosEmArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_AGENDAMENTOS))) {
            for (Agendamento ag : agendamentos) {
                Pessoa pessoa = ag.getPessoa();
                writer.write(ag.getHora() + ";" + pessoa.getCodigo() + ";" + pessoa.getNome() + ";" + pessoa.getTelefone());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar agendamentos: " + e.getMessage());
        }
    }

    private void carregarAgendamentosDeArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_AGENDAMENTOS))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                int hora = Integer.parseInt(partes[0]);
                int codigo = Integer.parseInt(partes[1]);
                String nome = partes[2];
                String telefone = partes[3];
                Pessoa pessoa = new Pessoa(codigo, nome, telefone);
                Agendamento agendamento = new Agendamento(hora, pessoa);
                agendamentos.add(agendamento);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            System.err.println("Erro ao carregar agendamentos: " + e.getMessage());
        }
    }
}
