package BD;

import java.sql.*;

public class Identidade extends VerDados {

    /**
     * Descricao: Verifica se o username e a password coincidem
     *
     * @param tipoFuncionario
     * @param nome
     * @param pass
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean verPassword(String tipoFuncionario, String nome, String pass) throws ClassNotFoundException, SQLException {

        String query = "select * from Funcionario where Funcao like ? and Situacao like ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setString(1, tipoFuncionario);
        preparedStmtSelect.setString(2, "Ativo");
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

    public int verID(String nomeUtilizador) throws ClassNotFoundException, SQLException {

        String query = "select * from Funcionario where Nome_Utilizador like ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setString(1, nomeUtilizador);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            if (nomeUtilizador.equals(rs.getString("Nome_Utilizador"))) {
                return rs.getInt("ID");
            }
        }

        super.conexao().close();

        return 0;

    }

    /**
     * Descicao: Verifica se existe um username repetido para uma determinada
     * funcao
     *
     * @param nomeUtilizador
     * @param Funcao
     * @return true/false
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean verNomeUtilizadorRepetido(String nomeUtilizador, String Funcao) throws ClassNotFoundException, SQLException {

        String query = "select * from Funcionario where Funcao like ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setString(1, Funcao);
        preparedStmtSelect.execute();
        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            if (nomeUtilizador.equals(rs.getString("Nome_Utilizador"))) {
                return true;
            }
        }

        super.conexao().close();
        return false;
    }

    /**
     * Descricao: Muda a palavra-passe padrão do adminstrador
     *
     * @param nomeUtilizador
     * @param palavraPasse
     * @throws ClassNotFoundException
     * @throws SQLException
     */
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

    /**
     * Altera os dados de um funcionario
     *
     * @param ID
     * @param nome
     * @param nomeUtilizador
     * @param palavraPasse
     * @param Funcao
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void updateFuncionario(int ID, String nome, String nomeUtilizador, String palavraPasse, String Funcao) throws ClassNotFoundException, SQLException {

        String query = "update Funcionario set Nome = ?, Nome_Utilizador = ?, Palavra_Passe = ?, Funcao = ? where ID like ?";

        switch (Funcao) {
            case "'Admin'":
                Funcao = "Admin";
                break;
            case "Empregado de mesa":
                Funcao = "Mesa";
                break;
            case "Empregado de cozinha":
                Funcao = "Cozinha";
                break;

        }
        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, nome);
        preparedStmtUpdate.setString(2, nomeUtilizador);
        preparedStmtUpdate.setString(3, palavraPasse);
        preparedStmtUpdate.setString(4, Funcao);
        preparedStmtUpdate.setInt(5, ID);

        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    /**
     * Descricao: Adiciona um novo funcionario à BD
     *
     * @param nome
     * @param nomeUtilizador
     * @param palavraPasse
     * @param Funcao
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void novoFuncionario(String nome, String nomeUtilizador, String palavraPasse, String Funcao) throws ClassNotFoundException, SQLException {

        String query = "insert into Funcionario (Nome, Nome_Utilizador, Palavra_Passe, Funcao) " + " value (?,?,?,?)";

        switch (Funcao) {
            case "'Admin'":
                Funcao = "Admin";
                break;
            case "'Mesa'":
                Funcao = "Mesa";
                break;
            case "'Cozinha'":
                Funcao = "Cozinha";
                break;

        }
        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, nome);
        preparedStmtUpdate.setString(2, nomeUtilizador);
        preparedStmtUpdate.setString(3, palavraPasse);
        preparedStmtUpdate.setString(4, Funcao);

        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    /**
     * Descricao: devolve o nome dos funcionario de uma determinada funcao
     *
     * @param Funcao
     * @return String funcionarios --> nomes dos funcionarios
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String verFuncionarioAtivo(String Funcao) throws ClassNotFoundException, SQLException {
        StringBuilder funcionarios = new StringBuilder();
        String query = "select * from Funcionario where Funcao like ? and Situacao like 'Ativo'";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setString(1, Funcao);

        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();
        while (rs.next()) {
            funcionarios.append(rs.getString("Nome")).append("\n");

        }
        super.conexao().close();

        return funcionarios.toString();
    }

    /**
     * Retorna os funcionarios que não estam ativos
     *
     * @return funcionarios.toString()
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String verFuncionarioNaoAtivo() throws ClassNotFoundException, SQLException {
        StringBuilder funcionarios = new StringBuilder();
        String query = "select * from Funcionario where Situacao like 'Não ativo'";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);

        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();
        while (rs.next()) {
            funcionarios.append(rs.getString("Nome_Utilizador")).append("\n");

        }
        super.conexao().close();

        return funcionarios.toString();
    }

    /**
     * Descricao: desativa uma conta da base de dados
     *
     * @param nome
     * @param Funcao
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void removerFuncionario(String nome, String Funcao) throws ClassNotFoundException, SQLException {

        String query = "update Funcionario set Situacao = ? where Nome like ? and Funcao like ?";

        PreparedStatement preparedStmtDelete = super.conexao().prepareStatement(query);
        preparedStmtDelete.setString(1, "Não ativo");
        preparedStmtDelete.setString(2, nome);
        preparedStmtDelete.setString(3, Funcao);

        preparedStmtDelete.execute();

        super.conexao().close();
    }

    /**
     * Descricao: ativa uma conta da base de dados
     *
     * @param nomeUtilizador
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void ativarFuncionario(String nomeUtilizador) throws ClassNotFoundException, SQLException {

        String query = "update Funcionario set Situacao = ? where Nome_Utilizador like ?";

        PreparedStatement preparedStmtUpdate = super.conexao().prepareStatement(query);
        preparedStmtUpdate.setString(1, "Ativo");
        preparedStmtUpdate.setString(2, nomeUtilizador);

        preparedStmtUpdate.execute();

        super.conexao().close();
    }

    /**
     * Descricao: retorna todos os dados do funcionario
     *
     * @param nome
     * @return StringBuilder funcionario
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public String dadosCadaFuncionario(String nome) throws ClassNotFoundException, SQLException {
        StringBuilder funcionario = new StringBuilder();

        String query = "select * from Funcionario where Nome like ?";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.setString(1, nome);

        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {

            funcionario.append(rs.getString("Nome_Utilizador")).append("\n").append(rs.getString("Palavra_passe")).append("\n");

            funcionario.append(rs.getString("Nome")).append("\n");
        }

        super.conexao().close();
        return funcionario.toString();

    }

}
