package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.NFVenda;

/**
 *
 * @author ph-santos
 */
public class NFVendaDAO {

    public void inserir(NFVenda nfVenda) {
        String sql = "INSERT INTO nf_venda (codigo, data_emissao, valor, cpf_cliente) VALUES (?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, nfVenda.getCodigo());
            statement.setDate(2, nfVenda.getDataEmissao());
            statement.setDouble(3, nfVenda.getValor());
            statement.setString(4, nfVenda.getCpfCliente());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir NF de Venda", e);
        }
    }

    public NFVenda newInserir(NFVenda nfVenda) {
        String sql = "INSERT INTO nf_venda (data_emissao, valor, cpf_cliente) VALUES (?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setDate(1, nfVenda.getDataEmissao());
            statement.setDouble(2, nfVenda.getValor());
            statement.setString(3, nfVenda.getCpfCliente());
            int linhasAfetadas = statement.executeUpdate();
            if (linhasAfetadas > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGerado = generatedKeys.getInt(1);
                        nfVenda.setCodigo(idGerado);
                    }
                }
            }
            return nfVenda;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<NFVenda> listarNFVendas() {
        List<NFVenda> nfVendas = new ArrayList<>();
        String sql = "SELECT * FROM nf_venda;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                NFVenda nfVenda = new NFVenda();
                nfVenda.setCodigo(resultSet.getInt("codigo"));
                nfVenda.setDataEmissao(resultSet.getDate("data_emissao"));
                nfVenda.setValor(resultSet.getDouble("valor"));
                nfVenda.setCpfCliente(resultSet.getString("cpf_cliente"));
                nfVendas.add(nfVenda);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar NFs de Venda", e);
        }
        return nfVendas;
    }
    
    public List<NFVenda> procurarNFVendaPorData(Date dataApartir, Date dataAte) {
        if (dataAte == null) {
            dataAte = new Date(System.currentTimeMillis());
        }
        List<NFVenda> notasFiscais = new ArrayList<>();
        String sql = "SELECT * FROM NF_Venda WHERE Data_Emissao BETWEEN ? AND ?;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, dataApartir);
            statement.setDate(2, dataAte);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NFVenda nfVenda = new NFVenda();
                nfVenda.setCodigo(resultSet.getInt("Codigo"));
                nfVenda.setDataEmissao(resultSet.getDate("Data_Emissao"));
                nfVenda.setValor(resultSet.getDouble("Valor"));
                nfVenda.setCpfCliente(resultSet.getString("cpf_cliente"));
                notasFiscais.add(nfVenda);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar notas fiscais de venda", e);
        }
        return notasFiscais;
    }
    
}
