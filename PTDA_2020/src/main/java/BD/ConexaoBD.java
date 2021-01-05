/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sofia
 */
public class ConexaoBD {
    
    String url = "jdbc:mysql://estga-dev.clients.ua.pt:3306/ptda2020gr1db";
    String username = "ptda-2020-gr1";
    String password = "snh_936=i";
    String driver = "com.mysql.cj.jdbc.Driver";

    
    public Connection conexao() throws ClassNotFoundException, SQLException{
        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
}
