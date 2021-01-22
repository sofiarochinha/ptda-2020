
package Adminstrador;

import BD.*;
import Design.*;
import Empregado_mesa.*;
import Empregado_cozinha.*;
import Thread.MostrarInterface;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Primeira interface da aplicação que irá iniciar sessãodo utilizador
 * @author sofia
 */
public class Aplicacao extends javax.swing.JFrame {

    private String tipoFuncionario;
    private final Identidade identidade;
    private final Design design;

    public Aplicacao() {
        initComponents();

        tipoFuncionario = "'Admin";
        identidade = new Identidade();
        design = new Design(this);

        MostrarInterface mi = new MostrarInterface(this, this);
        mi.start();

        erro.setVisible(false);
        buttonGroup1.add(BotaoAdmin);
        buttonGroup1.add(BotaoEmpregadoCozinha);
        buttonGroup1.add(BotaoEmpregadoMesa);

        //design dos componentes
        design.BotaoCentro(BotaoSessao);
        design.textoErro(erro);
        design.titulo(tituloSessao);

        BotaoAdmin.setSelected(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        dialog = new javax.swing.JDialog();
        tituloSessao = new javax.swing.JLabel();
        escreverUsername = new javax.swing.JTextField();
        BotaoSessao = new javax.swing.JButton();
        erro = new javax.swing.JLabel();
        BotaoAdmin = new javax.swing.JRadioButton();
        BotaoEmpregadoMesa = new javax.swing.JRadioButton();
        BotaoEmpregadoCozinha = new javax.swing.JRadioButton();
        escreverPassword = new javax.swing.JPasswordField();
        mostrarPassword = new javax.swing.JCheckBox();

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("Login"); // NOI18N

        tituloSessao.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        tituloSessao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloSessao.setText("Restauração");

        escreverUsername.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        escreverUsername.setText("Nome de utilizador");
        escreverUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escreverUsernameActionPerformed(evt);
            }
        });

        BotaoSessao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotaoSessao.setText("Entrar");
        BotaoSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSessaoActionPerformed(evt);
            }
        });

        erro.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        erro.setText("Erro");

        BotaoAdmin.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BotaoAdmin.setText("Adminstrador");
        BotaoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdminActionPerformed(evt);
            }
        });

        BotaoEmpregadoMesa.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BotaoEmpregadoMesa.setText("Empregado de mesa");
        BotaoEmpregadoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEmpregadoMesaActionPerformed(evt);
            }
        });

        BotaoEmpregadoCozinha.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BotaoEmpregadoCozinha.setText("Empregado de Cozinha");
        BotaoEmpregadoCozinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEmpregadoCozinhaActionPerformed(evt);
            }
        });

        escreverPassword.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        escreverPassword.setText("jPasswordField1");
        escreverPassword.setAlignmentX(0.1F);
        escreverPassword.setAlignmentY(0.1F);

        mostrarPassword.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        mostrarPassword.setText("Mostrar");
        mostrarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(BotaoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoEmpregadoMesa)
                    .addComponent(BotaoEmpregadoCozinha)
                    .addComponent(BotaoAdmin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloSessao)
                    .addComponent(escreverUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(escreverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarPassword)))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloSessao)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAdmin)
                    .addComponent(escreverUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotaoEmpregadoMesa)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escreverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarPassword)
                    .addComponent(BotaoEmpregadoCozinha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(BotaoSessao)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escreverUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escreverUsernameActionPerformed

    }//GEN-LAST:event_escreverUsernameActionPerformed

    private void BotaoSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSessaoActionPerformed

        try {
            //verifica se o username e a password sao coincidentes  
            if (identidade.verPassword(tipoFuncionario, escreverUsername.getText(), escreverPassword.getText())) {

                switch (tipoFuncionario) {
                    case "'Mesa'":
                        MostrarInterface mi = new MostrarInterface(this, new Ver_mesa());
                        mi.start();
                        break;

                    case "'Admin'":
                        mi = new MostrarInterface(this, new ConfigurarConta());
                        mi.start();
                        break;
                    case "'Cozinha'":
                        mi = new MostrarInterface(this, new Ver_pedidos());
                        mi.start();
                        break;
                    default:
                        erro.setText("Opção Inválida");
                }

            } else {
                erro.setVisible(true);
                erro.setText("O nome de utilizador e a palavra-passe não coincidem.");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BotaoSessaoActionPerformed

    private void BotaoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdminActionPerformed
        erro.setVisible(false);
        tipoFuncionario = "'Admin'";

    }//GEN-LAST:event_BotaoAdminActionPerformed

    private void BotaoEmpregadoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEmpregadoMesaActionPerformed
        erro.setVisible(false);
        tipoFuncionario = "'Mesa'";

    }//GEN-LAST:event_BotaoEmpregadoMesaActionPerformed

    private void BotaoEmpregadoCozinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEmpregadoCozinhaActionPerformed
        erro.setVisible(false);
        tipoFuncionario = "'Cozinha'";
    }//GEN-LAST:event_BotaoEmpregadoCozinhaActionPerformed

    private void mostrarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPasswordActionPerformed
        if (mostrarPassword.isSelected()) {
            escreverPassword.setEchoChar((char) 0);
        } else {
            escreverPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarPasswordActionPerformed

    public String getUsername() {
        return escreverPassword.getText();
    }

    public String getPassword() {
        return escreverPassword.getText();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Aplicacao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotaoAdmin;
    private javax.swing.JRadioButton BotaoEmpregadoCozinha;
    private javax.swing.JRadioButton BotaoEmpregadoMesa;
    private javax.swing.JButton BotaoSessao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JDialog dialog;
    private javax.swing.JLabel erro;
    private javax.swing.JPasswordField escreverPassword;
    private javax.swing.JTextField escreverUsername;
    private javax.swing.JCheckBox mostrarPassword;
    private javax.swing.JLabel tituloSessao;
    // End of variables declaration//GEN-END:variables
}
