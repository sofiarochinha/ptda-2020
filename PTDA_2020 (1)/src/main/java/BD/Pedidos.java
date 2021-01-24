package BD;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Pedidos extends VerDados {
    private double preco = 0;
    /**
     * Retorna todos os pedidos que estam para confecionar
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String verPedido() throws ClassNotFoundException, SQLException {
        StringBuilder sb = new StringBuilder();
        String query = "select * from Pedido where Estado like ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setBoolean(1, true);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            sb.append(rs.getString("Mesa")).append(" ");
        }

        super.conexao().close();

        return sb.toString();
    }

    /**
     *
     * @param mesa
     * @return
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public String idProdutos(int mesa) throws ClassNotFoundException, SQLException {
        StringBuilder sb = new StringBuilder();

        String query = "select ID_Produto from Produtos_Pedido inner join Pedido on "
                + "Produtos_Pedido.ID_Pedido = Pedido.ID where Produtos_Pedido.ID_Pedido = 2";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
       // preparedStmtSelect.setInt(1, mesa);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while(rs.next()){
            sb.append(rs.getString("ID_Produto")).append("\n");
        }
        super.conexao().close();
        return sb.toString();
    }

    public double precoTotal(int produto) throws ClassNotFoundException, SQLException{
        
        
        String query = "select Preco from Produto where ID = ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setInt(1, produto);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while(rs.next()){
            preco += rs.getDouble("Preco");
        }
        super.conexao().close();
        
        return preco;
       
    }
    
    /**
     * Insere um novo pedido na base de dados
     *
     * @param precoTotal
     * @param mesa
     * @param ID_Funcionario
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void inserir_Pedido(double precoTotal, int mesa, int ID_Funcionario) throws ClassNotFoundException, SQLException {
        StringBuilder sb = new StringBuilder();
        String query = "INSERT INTO Pedido (Preco_total, Mesa, ID_Funcionario)" + " values (?,?,?)";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setDouble(1, 4);
        preparedStmtUpdate.setInt(2, mesa);
        preparedStmtUpdate.setInt(3, ID_Funcionario);

        preparedStmtUpdate.execute();

        ResultSet rs = preparedStmtUpdate.getResultSet();
        
        super.conexao().close();
    }

    /**
     * Retorna o id do pedido associado a uma determinada mesa
     *
     * @param mesa
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int verID(int mesa) throws ClassNotFoundException, SQLException {
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
     *
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
