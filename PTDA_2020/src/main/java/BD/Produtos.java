package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sofia
 */
public class Produtos extends ConexaoBD {

    public void removerDado(String tabela, String nome) throws ClassNotFoundException, SQLException {

        String query = "delete from " + tabela + " where Nome = ?";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, nome);

        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    public boolean dadoProduto(String tabela, String nome) throws ClassNotFoundException, SQLException {

        String query = "select * from " + tabela;

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            if (nome.equals(rs.getString("Nome"))) {
                return false;
            }
        }

        super.conexao().close();

        return true;
    }

    public String verDados(String nome) throws ClassNotFoundException, SQLException {

        StringBuilder dados = new StringBuilder();

        String query = "select * from " + nome;

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            dados.append(rs.getString("Nome") + "\n");
        }

        super.conexao().close();

        return dados.toString();
    }

    public void adicionarDados(String tabela, String nome) throws ClassNotFoundException, SQLException {

        String query = "insert into " + tabela + " (Nome) " + " value (?)";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, nome);

        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    public void adicionarProduto(String nome, int tempo, String iva, String descricao, double preco, String categoria, String personalizacao) throws ClassNotFoundException, SQLException {

        String query = "insert into Produto (ID_Categoria, Nome, Preco, ID_Iva, ID_Personalizacao, Descricao) " + " value (?,?,?,?,?,?)";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setInt(1, verID("Categoria", categoria));
        preparedStmtUpdate.setString(2, nome);
        preparedStmtUpdate.setDouble(3, preco);
        preparedStmtUpdate.setDouble(4, verID("Iva", iva));
        preparedStmtUpdate.setInt(5, verID("Personalizacao", personalizacao));
        preparedStmtUpdate.setString(6, descricao);
        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    public int verID(String tabela, String nome) throws ClassNotFoundException, SQLException {
        int id = 0;

        String query = "select * from " + tabela;

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        if (tabela.equals("Iva")) {
            while (rs.next()) {
                if (nome.equals(rs.getString("Custo") + "%")) {
                    id = rs.getInt("ID");
                }
            }
        } else {
            while (rs.next()) {
                if (nome.equals(rs.getString("Nome"))) {
                    id = rs.getInt("ID");
                }
            }
        }
        super.conexao().close();

        return id;
    }
}
