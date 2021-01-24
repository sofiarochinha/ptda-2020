package BD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Pedidos extends VerDados{
    /**
     * Retorna todos os pedidos que estam para confecionar
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public String verPedido() throws ClassNotFoundException, SQLException{
        StringBuilder sb = new StringBuilder();
        String query = "select * from Pedido where Estado like ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setString(1, "A confecionar");
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            sb.append(rs.getString("Mesa")).append(" ");
        }

        super.conexao().close();

        return sb.toString();
    }
    
    
    /**
     * Retorna o id do pedido associado a uma determinada mesa
     * @param mesa
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public int verID (int mesa) throws ClassNotFoundException, SQLException {
        int id = 0;
        
        String query = "select * from Pedido where Mesa = ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setInt(1, mesa);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            id = rs.getInt("ID");
        }

        super.conexao().close();

        return id;
    }
    
    /**
     * Coloca os pedidos como prontos na BD
     * @param id
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
     public void pedidoPronto(int id) throws ClassNotFoundException, SQLException {

        String query = "update Pedido set Estado = ? where ID = ?";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, "Pronto");
        preparedStmtUpdate.setInt(2, id);

        preparedStmtUpdate.execute();

        super.conexao().close();
    }
    
}
