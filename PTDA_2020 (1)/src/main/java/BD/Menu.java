/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Menu extends ConexaoBD {
    private int pedido;
    public Menu(int pedido){
        this.pedido = pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }
    
    public String verMenu(int pedido) throws ClassNotFoundException, SQLException {
        StringBuilder sb = new StringBuilder();
        String query = "select * from Menu_Pedido where ID_Pedido = " + pedido;

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            sb.append(rs.getString("ID_Menu")).append(" ");
        }

        super.conexao().close();

        return sb.toString();
    }

    public String verIDProdutoDoMenu() throws SQLException, ClassNotFoundException {
        String menu = verMenu(pedido);
        String[] array = menu.split(" ");
        StringBuilder sb = new StringBuilder();
        System.out.println(parseInt(array[0]));
        for (int i = 0; i < array.length; i++) {
            
            String query = "select * from Menu_Produto where ID_Menu = " + parseInt(array[i]);
        
        
        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();
        
        while (rs.next()) {
            sb.append(rs.getString("ID_Produto")).append(" ");
        }
        }
        super.conexao().close();

        return sb.toString();
    }
    
    public String verNomeProduto() throws SQLException, ClassNotFoundException{
        String produto = verIDProdutoDoMenu();
        System.out.println(produto);
        String[] array = produto.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(parseInt(array[i]));
            String query = "select * from Produto where ID = " + parseInt(array[i]);
        
        
        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();
        
        while (rs.next()) {
            sb.append(rs.getString("Nome")).append(" ");
        }
        
        }
        super.conexao().close();

        return sb.toString();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Menu menu = new Menu(5);

        try {
            System.out.println(menu.verNomeProduto());
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
