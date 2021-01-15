/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adminstrador;

import Design.*;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import BD.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Adicionar ou remover personalizações dos produtos
 *
 * @author sofia
 */
public class Personalizacao extends javax.swing.JFrame {

    DesignAdicionarCategoria design = new DesignAdicionarCategoria(this);
    Produtos produto = new Produtos();
    short selecao = 0;

    public Personalizacao() throws ClassNotFoundException, SQLException {
        initComponents();

        design.titulo(titulo);
        design.botao(adicionarPersonalizacao, removerPersonalizacao, cancelar);
        design.escrever(escreverPersonalizacao);
        design.lista(listaPersonalizacao);
        design.textoErro(erro);

        erro.setVisible(false);
        escreverPersonalizacao.setVisible(false);

        personalizacaoLista();
    }

    public void personalizacaoLista() throws ClassNotFoundException, SQLException {

        DefaultListModel dlm = new DefaultListModel();

        String nome = produto.verDados("Personalizacao");
        String[] personalizacao = nome.split("\n");
        for (String n : personalizacao) {
            dlm.addElement(n);
        }

        listaPersonalizacao.setModel(dlm);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPersonalizacao = new javax.swing.JList<>();
        adicionarPersonalizacao = new javax.swing.JButton();
        removerPersonalizacao = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        escreverPersonalizacao = new javax.swing.JTextField();
        erro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("personalizacao"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 350));

        titulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        titulo.setText("Personalizacao");

        listaPersonalizacao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        listaPersonalizacao.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPersonalizacao);

        adicionarPersonalizacao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adicionarPersonalizacao.setText("Adicionar");
        adicionarPersonalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPersonalizacaoActionPerformed(evt);
            }
        });

        removerPersonalizacao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        removerPersonalizacao.setText("Remover");
        removerPersonalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerPersonalizacaoActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        escreverPersonalizacao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        escreverPersonalizacao.setText("ex: sem carne");

        erro.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        erro.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(removerPersonalizacao)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionarPersonalizacao)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(cancelar))))
                                    .addComponent(escreverPersonalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(erro)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionarPersonalizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(escreverPersonalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(erro)
                        .addGap(2, 2, 2)
                        .addComponent(removerPersonalizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarPersonalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPersonalizacaoActionPerformed
        escreverPersonalizacao.setVisible(true);

        adicionarPersonalizacao.setText("OK");

        if (!adicionarPersonalizacao.isSelected()) {
            selecao += 1;
            System.out.println(selecao);
            if (selecao == 2 && escreverPersonalizacao.getText().equals("ex: sem carne")) {
                erro.setVisible(true);
                erro.setText("Nada foi alterado.");
                selecao = 1;
            } else {
                try {
                    if (selecao == 2 && produto.dadoProduto("Personalizacao", escreverPersonalizacao.getText())) {
                        produto.adicionarDados("Personalizacao", escreverPersonalizacao.getText());
                        personalizacaoLista();
                        selecao = 0;
                        erro.setVisible(false);
                        escreverPersonalizacao.setText("Adicionar");
                        escreverPersonalizacao.setVisible(false);
                    } else if (selecao == 2) {
                        selecao = 1;
                        erro.setVisible(true);
                        erro.setText("Já existe.");
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(AdicionarCategoria.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_adicionarPersonalizacaoActionPerformed

    private void removerPersonalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerPersonalizacaoActionPerformed
        try {
            produto.removerDado("Personalizacao", listaPersonalizacao.getSelectedValue());
            personalizacaoLista();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdicionarCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_removerPersonalizacaoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Personalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Personalizacao().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Personalizacao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarPersonalizacao;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel erro;
    private javax.swing.JTextField escreverPersonalizacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPersonalizacao;
    private javax.swing.JButton removerPersonalizacao;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}