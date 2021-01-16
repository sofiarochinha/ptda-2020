package BD;

import java.sql.*;

public class Identidade extends ConexaoBD{

    /**
     * Descricao: 
     * @param tipoFuncionario
     * @param nome
     * @param pass
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
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
    /**
     * 
     * @param nomeUtilizador
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public boolean verNomeUtilizadorRepetido(String nomeUtilizador, String Funcao) throws ClassNotFoundException, SQLException {

        String query = "select * from Funcionario where Funcao like " + Funcao;

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

     public void novoFuncionario(String nome, String nomeUtilizador, String palavraPasse, String Funcao) throws ClassNotFoundException, SQLException {

        String query = " insert into Funcionario (Nome, Nome_Utilizador, Palavra_Passe, Funcao) " + " value (?,?,?,?)";

        switch (Funcao){
            case "'Admin'":
                Funcao = "Admin";break;
            case "'Mesa'":
                Funcao = "Mesa"; break;
            case "'Cozinha'":
                Funcao = "Cozinha"; break;
            
        }
        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, nome);
        preparedStmtUpdate.setString(2, nomeUtilizador);
        preparedStmtUpdate.setString(3, palavraPasse);
        preparedStmtUpdate.setString(4, Funcao);
        
        preparedStmtUpdate.execute();
      
        super.conexao().close();
    }
    
}
