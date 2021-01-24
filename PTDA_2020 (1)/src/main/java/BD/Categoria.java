/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import BD.VerDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class Categoria extends VerDados{
    public String verCategoria() throws ClassNotFoundException, SQLException{
        StringBuilder sb = new StringBuilder();
        String query = "select Nome from Categoria";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            sb.append(rs.getString("Nome")).append(" ");
        }

        super.conexao().close();

        return sb.toString();
    }
}
