package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FormaPagamento;

public class FormaPagamentoDAO {

    public void inserir(FormaPagamento formaPagamento) {
        String sql = "INSERT INTO Forma_Pagamento (Codigo, Tipo) VALUES (?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, formaPagamento.getCodigo());
            statement.setString(2, formaPagamento.getTipo());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir forma de pagamento", e);
        }
    }

    public List<FormaPagamento> procurarPorNome(String formaNome) {
        List<FormaPagamento> formasPagamento = new ArrayList<>();
        String sql = "SELECT * FROM forma_pagamento WHERE LOWER(tipo) = LOWER(?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, formaNome);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                FormaPagamento formaPagamento = new FormaPagamento();
                formaPagamento.setCodigo(resultSet.getInt("Codigo"));
                formaPagamento.setTipo(resultSet.getString("Tipo"));
                formasPagamento.add(formaPagamento);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar formas de pagamento", e);
        }
        return formasPagamento;
    }

    public List<FormaPagamento> listarFormasPagamento() {
        List<FormaPagamento> formasPagamento = new ArrayList<>();
        String sql = "SELECT * FROM Forma_Pagamento;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                FormaPagamento formaPagamento = new FormaPagamento();
                formaPagamento.setCodigo(resultSet.getInt("Codigo"));
                formaPagamento.setTipo(resultSet.getString("Tipo"));
                formasPagamento.add(formaPagamento);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar formas de pagamento", e);
        }
        return formasPagamento;
    }
}
