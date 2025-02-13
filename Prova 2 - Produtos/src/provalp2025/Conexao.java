package provalp2025;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author fabio.martins
 */
public class Conexao {

    private final String url = "jdbc:postgresql://localhost:5432/dbtesteprova";
    private final String usuario = "postgres";
    private final String senha = "root";
    private Connection con = null;

    public Conexao() throws Exception {
        carregarDrive();
    }

    public Connection getConexao() throws Exception {
        if (con ==  null) {
            Properties prop = new Properties();
            prop.put("user", usuario);
            prop.put("password", senha);
            con = DriverManager.getConnection(url, prop);            
        }
        return con;
    }

    private void carregarDrive() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            throw e;
        }
    }

}
