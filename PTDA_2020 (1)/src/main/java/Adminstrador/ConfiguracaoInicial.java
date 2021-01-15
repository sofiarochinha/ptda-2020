/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adminstrador;

import Design.*;
import BD.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Thread.*;

/**
 *
 * @author sofia
 */
public class ConfiguracaoInicial extends javax.swing.JFrame {

    /**
     * Creates new form ConfiguraçãoInicial
     */
    DesignConfiguracaoInicial design = new DesignConfiguracaoInicial(this);
    
    public ConfiguracaoInicial() {
        initComponents();
        
        design.titulo(titulo);
        design.label(textoNumeroMesas);
        design.spinner(spinner);
        design.textoErro(erro); //nao se vou usar mas vou deixar ficar
        design.BotaoCancelar(botaoCancelar);
        design.BotaoProximo(BotaoProximo);
        erro.setVisible(false); // nao se vou usar mas vou deixar ficar

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
        textoNumeroMesas = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        BotaoProximo = new javax.swing.JButton();
        erro = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ConfiguracaoInicial"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 550));

        titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        titulo.setText("Configuração Inicial");

        textoNumeroMesas.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        textoNumeroMesas.setText("Número de mesas do estabelecimento");

        botaoCancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        BotaoProximo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotaoProximo.setText("Próximo");
        BotaoProximo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoActionPerformed(evt);
            }
        });

        erro.setText("jLabel1");

        spinner.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(botaoCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(erro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoNumeroMesas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titulo)
                .addGap(82, 82, 82)
                .addComponent(textoNumeroMesas)
                .addGap(18, 18, 18)
                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(erro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(BotaoProximo))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoActionPerformed
        
        ConfiguracaoEstabelecimento ce = new ConfiguracaoEstabelecimento();
        
        int num = (Integer) spinner.getValue(); //valor do tipo int

        try {
            ce.inserirNumMesas(num);
            MostrarInterface mi = new MostrarInterface(this, new AdicionarProduto());
            mi.start();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConfiguracaoInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_BotaoProximoActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracaoInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracaoInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoProximo;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JLabel erro;
    private javax.swing.JSpinner spinner;
    private javax.swing.JLabel textoNumeroMesas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
