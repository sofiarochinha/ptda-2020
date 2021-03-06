package Adminstrador;

import BD.*;
import Design.*;

import Thread.MostrarInterface;
import Thread.ProgressBar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Regista todos os elementos da equipa
 *
 * @author sofia
 */
public final class CadastrarEquipa extends javax.swing.JFrame {

    private final DesignCadastrarEquipa design;
    private final Identidade identidade;
    private MostrarInterface mostrarInterface;

    private boolean update, menu;
    private int ID;

    public CadastrarEquipa() {
        this.design = new DesignCadastrarEquipa(this);
        this.identidade = new Identidade();
        this.update = false;
        this.ID = 0;

        initComponents();

        comboboxTipoFuncionario();
        erro.setVisible(false);

        design.BotaoCancelar(botaoCancelar);
        design.BotaoProximo(BotaoProximo);
        design.BotaoAnterior(BotaoAnterior);
        design.titulo(titulo);
        design.JLabel(nomeText, usernameText, passeText, repetirPasseText, tipoText);
        design.JTextField(nomeFuncionario, usernameFuncionario, password, repetirPassword);
        design.JCombobox(comboboxTipoFuncionario);
        design.textErro(erro);
        design.progressBar(progressBar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        tipoText = new javax.swing.JLabel();
        usernameFuncionario = new javax.swing.JTextField();
        passeText = new javax.swing.JLabel();
        comboboxTipoFuncionario = new javax.swing.JComboBox<>();
        nomeText = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        nomeFuncionario = new javax.swing.JTextField();
        BotaoProximo = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        BotaoAnterior = new javax.swing.JButton();
        repetirPassword = new javax.swing.JPasswordField();
        repetirPasseText = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        erro = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        titulo.setText("Adicionar empregado");

        tipoText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tipoText.setText("Tipo:");

        usernameFuncionario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        passeText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        passeText.setText("Palavra-Passe:");

        comboboxTipoFuncionario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comboboxTipoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nomeText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nomeText.setText("Nome:");

        usernameText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        usernameText.setText("Nome de Utilizador:");

        nomeFuncionario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        BotaoProximo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotaoProximo.setText("Próximo");
        BotaoProximo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        BotaoAnterior.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotaoAnterior.setText("Anterior");
        BotaoAnterior.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnteriorActionPerformed(evt);
            }
        });

        repetirPasseText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        repetirPasseText.setText("Repetir:");

        erro.setText("Tem de adicionar um nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 279, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passeText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tipoText)
                                        .addGap(40, 40, 40)
                                        .addComponent(comboboxTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(repetirPasseText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(repetirPassword)
                            .addComponent(password))
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 250, Short.MAX_VALUE)
                        .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)))
                .addComponent(BotaoProximo)
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(nomeText)
                    .addContainerGap(789, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(nomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addGap(398, 398, 398)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titulo)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameText)
                    .addComponent(usernameFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passeText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repetirPasseText))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoText))
                        .addGap(31, 31, 31)))
                .addComponent(erro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotaoProximo)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoCancelar)
                                .addComponent(BotaoAnterior)))
                        .addGap(42, 42, 42))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(nomeText)
                    .addContainerGap(391, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoActionPerformed
        ProgressBar pb = new ProgressBar(progressBar);

        String tipo = null;
        switch ((String) comboboxTipoFuncionario.getSelectedItem()) {
            case "Administrador":
                tipo = "'Admin'";
                break;
            case "Empregado de cozinha":
                tipo = "'Cozinha'";
                break;
            case "Empregado de Mesa":
                tipo = "'Mesa'";
                break;
        }

        if ("".equals(nomeFuncionario.getText())) {
            erro.setVisible(true);
            erro.setText("Tem de inserir o seu nome");
        } //so deixa inserir o nome com letras
        else if (!nomeFuncionario.getText().matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚáâãàçéêíóôõú\\s]*$")) {
            erro.setVisible(true);
            erro.setText("Só pode inserir letras");
        } else if ("".equals(usernameFuncionario.getText())) {
            erro.setVisible(true);
            erro.setText("Tem de inserir um nome de utilizador");
        } else if ("".equals(password.getText())) {
            erro.setVisible(true);
            erro.setText("Tem de inserir uma palavra-passe");
        } else if ("".equals(repetirPassword.getText())) {
            erro.setVisible(true);
            erro.setText("Tem de repetir a palavra-passe");
        } else {
            try {

                String[] partes = nomeFuncionario.getText().split(" ");
                StringBuilder sb = new StringBuilder();
                for (String word : partes) {
                    if (word.length() > 2) {
                        word = word.substring(0, 1).toUpperCase() + word.substring(1);
                    }
                    sb.append(" ").append(word);
                }

                String nome = sb.toString().replaceFirst(" ", "");
                String username = usernameFuncionario.getText();
                String passe = password.getText();
                Equipa equipa = new Equipa();

                if (update) {

                    if (password.getText().equals(repetirPassword.getText())) {
                        erro.setVisible(false);
                        identidade.updateFuncionario(ID, nome, username, passe, tipo);

                        if (menu) {
                            equipa.interfaceMenu();
                        }

                        mostrarInterface = new MostrarInterface(this, equipa);
                        pb.start();
                        mostrarInterface.start();

                    } else {
                        erro.setVisible(true);
                        erro.setText("As palavras-passes não correspondem.");
                    }
                } else {
                    if (password.getText().equals(repetirPassword.getText()) && !identidade.verNomeUtilizadorRepetido(usernameFuncionario.getText(), tipo)) {

                        erro.setVisible(false);
                        identidade.novoFuncionario(nome, username, passe, tipo);

                        if (menu) {
                            equipa.interfaceMenu();
                        }

                        mostrarInterface = new MostrarInterface(this, equipa);
                        pb.start();
                        mostrarInterface.start();

                    } else if (identidade.verNomeUtilizadorRepetido(usernameFuncionario.getText(), tipo)) {
                        erro.setVisible(true);
                        erro.setText("Esse nome de utilizador já existe.");
                    } else if (!password.getText().equals(repetirPassword.getText())) {
                        erro.setVisible(true);
                        erro.setText("As palavras-passes não correspondem.");
                    }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CadastrarEquipa.class.getName()).log(Level.SEVERE, null, ex);
            }

            update = false;

        }
    }//GEN-LAST:event_BotaoProximoActionPerformed

    private void BotaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnteriorActionPerformed
        try {
            mostrarInterface = new MostrarInterface(this, new ProdutosAdicionados());
            mostrarInterface.start();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutosAdicionados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAnteriorActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        if (menu) {
            try {
                mostrarInterface = new MostrarInterface(this, new ProdutosAdicionados());
                mostrarInterface.start();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CadastrarEquipa.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_botaoCancelarActionPerformed

    public void comboboxTipoFuncionario() {
        Object o = comboboxTipoFuncionario.getSelectedItem();

        comboboxTipoFuncionario.removeAllItems();

        String[] tipoFuncionario = {"Administrador", "Empregado de cozinha", "Empregado de mesa"};
        for (String n : tipoFuncionario) {
            comboboxTipoFuncionario.addItem(n);
        }

        comboboxTipoFuncionario.setSelectedItem(o);
    }

    public void setComboboxTipoFuncionario(String funcionario) {
        int n = 0;
        while (!comboboxTipoFuncionario.getItemAt(n).equals(funcionario)) {
            n++;
        }
        comboboxTipoFuncionario.setSelectedIndex(n);
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario.setText(nomeFuncionario);
    }

    public void setUsernameFuncionario(String usernameFuncionario) {
        this.usernameFuncionario.setText(usernameFuncionario);
    }

    public void setPassword(String password) {
        this.password.setText(password);
    }

    public void setRepetirPassword(String repetirPassword) {
        this.repetirPassword.setText(repetirPassword);
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void interfaceMenu() {
        BotaoAnterior.setVisible(false);
        BotaoProximo.setText("Adicionar");
        menu = true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarEquipa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarEquipa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarEquipa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarEquipa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastrarEquipa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAnterior;
    private javax.swing.JButton BotaoProximo;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JComboBox<String> comboboxTipoFuncionario;
    private javax.swing.JLabel erro;
    private javax.swing.JTextField nomeFuncionario;
    private javax.swing.JLabel nomeText;
    private javax.swing.JLabel passeText;
    private javax.swing.JPasswordField password;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel repetirPasseText;
    private javax.swing.JPasswordField repetirPassword;
    private javax.swing.JLabel tipoText;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField usernameFuncionario;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables
}
