/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sofia
 */
public class ConfiguracaoEstabelecimento extends VerDados {

    public void inserirNumMesas(int numMesas) throws ClassNotFoundException, SQLException {

        String query = "insert into Mesa (Numero) " + " value (?)";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setInt(1, numMesas);

        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    public int VerNumMesas() throws ClassNotFoundException, SQLException {
        int numero = 0;
        String query = "SELECT * from Mesa";
        
        PreparedStatement Select = super.conexao().prepareStatement(query);

        Select.execute();
        ResultSet rs = Select.getResultSet();

        while (rs.next()) {
            numero = parseInt(rs.getString("Numero"));
        }
        
        super.conexao().close();
        return numero;
    }
}
