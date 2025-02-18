package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.NFCompra;

public class NFCompraDAO {

    public void inserir(NFCompra nfCompra) {
        String sql = "INSERT INTO NF_Compra (Codigo, Data_Emissao, Valor, CNPJ_Fornecedor) VALUES (?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, nfCompra.getCodigo());
            statement.setDate(2, nfCompra.getDataEmissao());
            statement.setDouble(3, nfCompra.getValor());
            statement.setString(4, nfCompra.getCNPJFornecedor());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir nota fiscal de compra", e);
        }
    }

    public List<NFCompra> listarNFCompra() {
        List<NFCompra> notasFiscais = new ArrayList<>();
        String sql = "SELECT * FROM NF_Compra;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NFCompra nfCompra = new NFCompra();
                nfCompra.setCodigo(resultSet.getInt("Codigo"));
                nfCompra.setDataEmissao(resultSet.getDate("Data_Emissao"));
                nfCompra.setValor(resultSet.getDouble("Valor"));
                nfCompra.setCNPJFornecedor(resultSet.getString("CNPJ_Fornecedor"));
                notasFiscais.add(nfCompra);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar notas fiscais de compra", e);
        }
        return notasFiscais;
    }

    public List<NFCompra> procurarNFCompraPorData(Date dataApartir, Date dataAte) {
        if (dataAte == null) {
            dataAte = new Date(System.currentTimeMillis());
        }
        List<NFCompra> notasFiscais = new ArrayList<>();
        String sql = "SELECT * FROM NF_Compra WHERE Data_Emissao BETWEEN ? AND ?;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, dataApartir);
            statement.setDate(2, dataAte);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NFCompra nfCompra = new NFCompra();
                nfCompra.setCodigo(resultSet.getInt("Codigo"));
                nfCompra.setDataEmissao(resultSet.getDate("Data_Emissao"));
                nfCompra.setValor(resultSet.getDouble("Valor"));
                nfCompra.setCNPJFornecedor(resultSet.getString("CNPJ_Fornecedor"));
                notasFiscais.add(nfCompra);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar notas fiscais de compra", e);
        }
        return notasFiscais;
    }
}
