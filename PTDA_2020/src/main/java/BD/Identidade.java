package BD;

//comandos SQL
//select * from Categoria" -> selecionar tudo da tabela categoria
//ResultSet rs = preparedStmtSelect.getResultSet();
//insert into Categoria (ID, Nome)" + " values (?, ?)
//delete from Categoria where ** = ?";
//UPDATE facil SET marca = 0
//api
//  GET, POST, PUT, DELETE
// /produtos = URL para ações sobre recursos do tipo Produto
// /produtos/1 = URL para ações sobre um produto específico
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Identidade extends ConexaoBD{

    
    public boolean verPassword(String tipoFuncionario, String nome, String pass) throws ClassNotFoundException, SQLException {


        String query = "select * from Funcionario where Funcao like" + tipoFuncionario;

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            if (nome.equals(rs.getString("Nome_Utilizador")) && pass.equals(rs.getString("Palavra_passe"))) {
                return true;
            }
        }

        super.conexao().close();

        return false;
    }

    public boolean verNomeUtilizadorRepetido(String nomeUtilizador) throws ClassNotFoundException, SQLException {

        String query = "select * from Funcionario where Funcao like 'Admin'";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();
        while (rs.next()) {
            if (nomeUtilizador.equals(rs.getString("Nome_Utilizador"))) {
                return false;
            }

        }

        super.conexao().close();
        return true;
    }

    public void mudarNomePasse(String nomeUtilizador, String palavraPasse) throws ClassNotFoundException, SQLException {

        String query = "update Funcionario set Nome_Utilizador = ? where Funcao = ?";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, nomeUtilizador);
        preparedStmtUpdate.setString(2, "Admin");

        preparedStmtUpdate.execute();

        query = "update Funcionario set Palavra_passe = ? where Funcao = ?";

        preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, palavraPasse);
        preparedStmtUpdate.setString(2, "Admin");

        preparedStmtUpdate.execute();
       
        super.conexao().close();
    }

    
}
