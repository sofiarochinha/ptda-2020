/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sofia
 */
public class VerDados extends ConexaoBD{
    /**
     * Descricao: ve o ID de cada tuplo que contém um determinado nome
     *
     * @param tabela
     * @param nome
     * @return id
     * @throws ClassNotFoundException
     * @throws SQLException
     */
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
    
    /**
     * Descricao: remove dados da BD de uma determinado tabela que contém
     * atributo nome
     *
     * @param tabela
     * @param nome
     * @param id
     * @param atributo
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void removerDado(String tabela, String nome, int id, String atributo) throws ClassNotFoundException, SQLException {

        PreparedStatement preparedStmtDelete = null;

        if (nome == null) {
            String query = "delete from " + tabela + " where " + atributo + " = ?";

            preparedStmtDelete = super.conexao().prepareStatement(query);
            preparedStmtDelete.setInt(1, id);
        } else {
            String query = "delete from " + tabela + " where " + atributo + " like ?";

            preparedStmtDelete = super.conexao().prepareStatement(query);
            preparedStmtDelete.setString(1, nome);
        }

        preparedStmtDelete.execute();

        super.conexao().close();
    }
}
