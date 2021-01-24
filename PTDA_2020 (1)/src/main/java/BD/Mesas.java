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
 * @author Humberto Vaz
 */
public class Mesas extends ConexaoBD{
    
    public String VerMesas() throws ClassNotFoundException, SQLException{
        StringBuilder sb = new StringBuilder();
        String query = "select * from Mesa";
        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();
        ResultSet rs = preparedStmtSelect.getResultSet();
        while (rs.next()) {
            sb.append(rs.getString("Numero")).append("\n");
        }
        super.conexao().close();
        return sb.toString();
}
    public int id_pedido (int x) throws ClassNotFoundException, SQLException{
        int sb =0;
        String query = "select ID from Mesa where Numero = ?";
        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setInt(1, x);
        preparedStmtSelect.execute();
        ResultSet rs = preparedStmtSelect.getResultSet();
        while (rs.next()) {
            sb=rs.getInt("ID");
        }
        super.conexao().close();
        return sb;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Mesas menu = new Mesas();
        System.out.println(menu.id_pedido(13));
    }
}