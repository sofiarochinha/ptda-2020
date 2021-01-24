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
    private int tempo;

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

    public int getTempo() {
        return tempo;
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
     * Verifica se existe algum menu com o mesmo nome que o parâmetro nome
     *
     * @param nome
     * @return true/false
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean verNomeMenuRepetido(String nome) throws ClassNotFoundException, SQLException {

        String query = "select * from Menu";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            if (nome.equals(rs.getString("Nome"))) {
                return true;
            }
        }
        return false;
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
     * Descricao: retorna o nome de todos os produtos associados ao id de
     * produto
     *
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
        System.out.println(produtos.toString());

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
        String query = "select * from Menu_Pedido where ID_Pedido = ? ";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setInt(1, pedido);
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
     * @param menu
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public String verIDProdutoDoMenu(String menu) throws SQLException, ClassNotFoundException {

        StringBuilder sb = new StringBuilder();
        System.out.println(menu);
        if ("".equals(menu)) {
            return "";
        } else {
            String[] array = menu.split(" ");

            for (String idMenu : array) {
                String query = "select * from Menu_Produto where ID_Menu = ?";

                PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
                preparedStmtSelect.setInt(1, Integer.parseInt(idMenu));
                preparedStmtSelect.execute();

                ResultSet rs = preparedStmtSelect.getResultSet();

                while (rs.next()) {
                    sb.append(rs.getString("ID_Produto")).append(" ");
                }
            }
            super.conexao().close();

        }
        return sb.toString();
    }

    public String verNomeProduto(String[] produtos) throws SQLException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder();
        if (produtos.equals("")) {
            return "";
        } else {

            for (String n : produtos) {
                if (n.equals("")) {
                    return "";
                } else {
                    String query = "select * from Produto where ID = ?";

                    PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
                    preparedStmtSelect.setInt(1, Integer.parseInt(n));
                    preparedStmtSelect.execute();

                    ResultSet rs = preparedStmtSelect.getResultSet();

                    while (rs.next()) {
                        sb.append(rs.getString("Nome")).append("\n");
                        if (rs.getInt("Tempo") > tempo) {
                            tempo = rs.getInt("Tempo");
                            System.out.println(tempo);
                        }
                    }

                }
                super.conexao().close();
            }

        }

        return sb.toString();
    }

    /**
     * Adiciona um novo menu à base de dados
     *
     * @param nome
     * @param preco
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void criarNovoMenu(String nome, double preco) throws SQLException, ClassNotFoundException {

        String query = "insert into Menu (Nome, Preco) value (?, ?)";

        PreparedStatement preparedStmtInsert = super.conexao().prepareStatement(query);
        preparedStmtInsert.setString(1, nome);
        preparedStmtInsert.setDouble(2, preco);
        preparedStmtInsert.execute();

        super.conexao().close();

    }

    public void adicionarProdutoAMenu(int idMenu, int idProduto) throws SQLException, ClassNotFoundException {

        String query = "insert into Menu_Produto (ID_Menu, ID_Produto) value (?, ?)";

        PreparedStatement preparedStmtInsert = super.conexao().prepareStatement(query);
        preparedStmtInsert.setInt(1, idMenu);
        preparedStmtInsert.setInt(2, idProduto);
        preparedStmtInsert.execute();

        super.conexao().close();

    }

    /**
     * Desassocia o menu dos produtos
     *
     * @param idMenu
     * @param idProduto
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void removerProdutoAMenu(int idMenu, int idProduto) throws SQLException, ClassNotFoundException {

        String query = "delete from Menu_Produto where ID_Menu = ? and ID_Produto = ?";

        PreparedStatement preparedStmtInsert = super.conexao().prepareStatement(query);
        preparedStmtInsert.setInt(1, idMenu);
        preparedStmtInsert.setInt(2, idProduto);
        preparedStmtInsert.execute();

        super.conexao().close();

    }

}
