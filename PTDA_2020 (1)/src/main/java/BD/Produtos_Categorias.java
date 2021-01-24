package BD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sofia
 */
public class Produtos_Categorias extends VerDados {

    /**
     *
     * @param tabela
     * @param nome
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void adicionarDados(String tabela, String nome) throws ClassNotFoundException, SQLException {

        String query = "insert into " + tabela + " (Nome) " + " value (?)";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, nome);

        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    /**
     * Descricao: Adiciona o produto na BD consoante os dados
     *
     * @param nome
     * @param tempo
     * @param iva
     * @param descricao
     * @param preco
     * @param categoria
     * @param personalizacao
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void adicionarProduto(String nome, int tempo, String iva, String descricao, double preco, String categoria, String personalizacao) throws ClassNotFoundException, SQLException {

        String query = "insert into Produto (ID_Categoria, Nome, Preco, ID_Iva, ID_Personalizacao, Descricao, Tempo) " + " value (?,?,?,?,?,?,?)";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setInt(1, verID("Categoria", categoria));
        preparedStmtUpdate.setString(2, nome);
        preparedStmtUpdate.setDouble(3, preco);
        preparedStmtUpdate.setDouble(4, verID("Iva", iva));
        preparedStmtUpdate.setInt(5, verID("Personalizacao", personalizacao));
        preparedStmtUpdate.setString(6, descricao);
        preparedStmtUpdate.setInt(7, tempo);
        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    /**
     * Descrição: Devolve os produtos de cada Categoria
     *
     * @param id
     * @return produtos.toString()
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String nomeProdutosCategoria(int id) throws ClassNotFoundException, SQLException {
        StringBuilder produtos = new StringBuilder();

        String query = "select * from Produto where ID_Categoria = ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setInt(1, id);

        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            produtos.append(rs.getString("Nome")).append("\n");
        }

        super.conexao().close();
        return produtos.toString();
    }

    /**
     * Descrição: Retorna todos os dados de um determinado produto
     *
     * @param nome -- do produto
     * @return dados
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String dadosCadaProduto(String nome) throws ClassNotFoundException, SQLException {
        StringBuilder produto = new StringBuilder();

        String query = "select * from Produto where Nome like ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setString(1, nome);

        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {

            produto.append(rs.getString("ID_Categoria")).append("\n").append(rs.getString("Preco")).append("\n").append(rs.getString("Descricao")).append("\n");

            produto.append(rs.getString("ID_Iva")).append("\n").append(rs.getString("ID_Personalizacao")).append("\n").append(rs.getString("Tempo")).append("\n");

            produto.append(rs.getString("Nome"));
        }

        super.conexao().close();
        return produto.toString();

    }

    /**
     * Descricao: ve o nome associado ao id de personalizacao ou categoria ou
     * iva
     *
     * @param id
     * @param tabela
     * @return nome do produto
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String dadosID(int id, String tabela) throws ClassNotFoundException, SQLException {
        String nome = null;

        String query = "select * from " + tabela + " where ID = ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setInt(1, id);

        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        if (tabela.equals("Iva")) {
            while (rs.next()) {
                nome = rs.getString("Custo");

            }
        } else {
            while (rs.next()) {
                nome = rs.getString("Nome");
            }
        }

        super.conexao().close();
        return nome;
    }

    /**
     * Remove uma determinada Categoria
     * @param nome
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void removerCategoria(String nome) throws ClassNotFoundException, SQLException {
        int idSemCategoria = verID("Categoria", "Sem categoria");

        int idCategoria = verID("Categoria", nome); //ve o id da categoria
        String[] arrayProdutos = nomeProdutosCategoria(idCategoria).split("\n"); //array com todos os produtos 

        for (String produto : arrayProdutos) {
            System.out.println(produto);
            String queryUpdate = "update Produto set ID_Categoria = ? where Nome like ?";

            PreparedStatement preparedStmtUpdateCategoria = super.conexao().prepareStatement(queryUpdate);
            preparedStmtUpdateCategoria.setInt(1, idSemCategoria);
            preparedStmtUpdateCategoria.setString(2, produto);
            
            preparedStmtUpdateCategoria.execute();
        }

        String query = "delete from Categoria where Nome like ?";

        PreparedStatement preparedStmtDelete = super.conexao().prepareStatement(query);
        preparedStmtDelete.setString(1, nome);

        preparedStmtDelete.execute();

        super.conexao().close();
    }
    
    /**
     * Remove uma determinada personalizacao
     * @param nome
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void removerPersonalizacao(String nome) throws ClassNotFoundException, SQLException {
        int idSemCategoria = verID("Personalizacao", "Sem personalizacao");

        int idCategoria = verID("Personalizacao", nome); //ve o id da categoria
        String[] arrayProdutos = nomeProdutosCategoria(idCategoria).split("\n"); //array com todos os produtos 

        for (String produto : arrayProdutos) {
            System.out.println(produto);
            String queryUpdate = "update Produto set ID_Personalizacao = ? where Nome like ?";

            PreparedStatement preparedStmtUpdatePersonalizacao = super.conexao().prepareStatement(queryUpdate);
            preparedStmtUpdatePersonalizacao.setInt(1, idSemCategoria);
            preparedStmtUpdatePersonalizacao.setString(2, produto);
            
            preparedStmtUpdatePersonalizacao.execute();
        }

        String query = "delete from Personalizacao where Nome like ?";

        PreparedStatement preparedStmtDelete = super.conexao().prepareStatement(query);
        preparedStmtDelete.setString(1, nome);

        preparedStmtDelete.execute();

        super.conexao().close();
    }
    
    /**
     * Descricao: atualiza o produto 
     * @param ID
     * @param nome
     * @param categoria
     * @param preco
     * @param Descricao
     * @param iva
     * @param personalizacao
     * @param tempo
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void updateProduto(int ID, String nome, String categoria, double preco, String Descricao, String iva, String personalizacao, int tempo) throws ClassNotFoundException, SQLException {

        String query = "update Produto set Nome = ?, ID_Categoria = ?, Preco = ?, Descricao = ?, ID_Iva = ?, ID_Personalizacao = ?, Tempo = ? where ID = ?";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, nome);
        preparedStmtUpdate.setInt(2, verID("Categoria", categoria));
        preparedStmtUpdate.setDouble(3, preco);
        preparedStmtUpdate.setString(4, Descricao);
        preparedStmtUpdate.setInt(5, verID("Iva", iva));
        preparedStmtUpdate.setInt(6, verID("Personalizacao", personalizacao));
        preparedStmtUpdate.setInt(7, tempo);
        preparedStmtUpdate.setInt(8, ID);
        
        preparedStmtUpdate.execute();

        super.conexao().close();
    }
}
