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

/**
 *
 * @author HP
 */
public class Menu extends VerDados {

    private int pedido;

    public Menu(int pedido) {
        this.pedido = pedido;
    }

    /**
     * Descricao: construtor vazio para a classe Menus em Administrador
     */
    public Menu() {

    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    /**
     * Descricao: retorna o nome de todos os Menus
     *
     * @return StringBuilder
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String nomeMenu() throws ClassNotFoundException, SQLException {
        StringBuilder sb = new StringBuilder();
        String query = "select * from Menu";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            sb.append(rs.getString("Nome")).append("\n");
        }

        super.conexao().close();

        return sb.toString();
    }

    /**
     * Descricao: ve o ID de um determinado Menu
     *
     * @param tabela
     * @param nome
     * @return int ID
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public int verID(String tabela, String nome) throws ClassNotFoundException, SQLException {
        int ID = 0;

        String query = "select * from Menu where Nome = ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setString(1, nome);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            ID = rs.getInt("ID");
        }

        super.conexao().close();

        return ID;

    }

    /**
     * Descicao: retorna todos os IDs do produtos associados ao Menu
     *
     * @param ID_Menu
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String IdProdutosAssociadosAoMenu(int ID_Menu) throws ClassNotFoundException, SQLException {
        StringBuilder sb = new StringBuilder();
        String query = "select * from Menu_Produto where ID_Menu = ? ";

        PreparedStatement preparedStmtSelectIdProdutos = super.conexao().prepareStatement(query);
        preparedStmtSelectIdProdutos.setInt(1, ID_Menu);
        preparedStmtSelectIdProdutos.execute();

        ResultSet rs = preparedStmtSelectIdProdutos.getResultSet();

        while (rs.next()) {
            sb.append(rs.getString("ID_Produto")).append("\n");
        }
        super.conexao().close();

        return sb.toString();
    }

    /**
     * Descricao: retorna o nome de todos os produtos associados ao id de produto
     * @param idProdutos
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public String produtoAsssociadosAoMenu(String idProdutos) throws SQLException, ClassNotFoundException {

        StringBuilder produtos = new StringBuilder();
        String[] arrayIdMenu = idProdutos.split("\n");

        for (String n : arrayIdMenu) {
            String query = "select * from Produto where ID = ? ";

            PreparedStatement preparedStmtSelectProdutos = super.conexao().prepareStatement(query);

            preparedStmtSelectProdutos.setInt(1, parseInt(n));
            preparedStmtSelectProdutos.execute();

            ResultSet rs = preparedStmtSelectProdutos.getResultSet();

            while (rs.next()) {
                produtos.append(rs.getString("Nome")).append("\n");
            }

            super.conexao().close();
        }

        return produtos.toString();
    }

    /**
     * Descricao: ve que menus estam associados aos pedidos
     *
     * @param pedido
     * @return StringBuilder
     * @throws ClassNotFoundException
     * @throws SQLException
     */
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

    /**
     * Descricao: ve os produtos associados ao menu
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
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

    public String verNomeProduto() throws SQLException, ClassNotFoundException {
        String[] produto = verIDProdutoDoMenu().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < produto.length; i++) {

            System.out.println(parseInt(produto[i]));
            String query = "select * from Produto where ID = " + parseInt(produto[i]);

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
//
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Menu menu = new Menu();
//
//        String[] p = menu.nomeMenu().split("\n");
//        for(String n : p){
//            System.out.println(n);
//            int w = menu.verID("GDJHAD", n);
//            String i = menu.IdProdutosAssociadosAoMenu(w);
//            String k = menu.produtoAsssociadosAoMenu(i);
//            System.out.println(k);
//        }
//        
//    }
}
