/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Pedidos extends VerDados{
    public String verPedido() throws ClassNotFoundException, SQLException{
        StringBuilder sb = new StringBuilder();
        String query = "select * from Pedido";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            sb.append(rs.getString("Mesa")).append(" ");
        }

        super.conexao().close();

        return sb.toString();
    }
    
}
