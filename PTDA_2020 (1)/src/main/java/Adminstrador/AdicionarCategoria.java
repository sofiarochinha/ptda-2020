package Adminstrador;

import Design.*;
import BD.*;
import Thread.MostrarInterface;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 * Adiciona ou remove as categorias dos produtos
 *
 * @author sofia
 */
public class AdicionarCategoria extends javax.swing.JFrame {

    private final DesignAdicionarCategoria design;
    private final Produtos_Categorias produto;

    private short selecao;
    private boolean menu;

    public AdicionarCategoria() throws ClassNotFoundException, SQLException {
        initComponents();

        this.design = new DesignAdicionarCategoria(this);
        this.produto = new Produtos_Categorias();

        //design dos componentes
        design.titulo(titulo);
        design.botao(adicionarCategoria, removerCategoria, botaoCancelar);
        design.escrever(escreverCategoria);
        design.textoErro(erro);

        //busca as categorias da base de dados e coloca na lista para o utilizador ver
        categoriasLista();

        //tornar invisivel
        escreverCategoria.setVisible(false);
        erro.setVisible(false);
    }

    /**
     * Adiciona todas as categorias que estam na base de dados na lista
     *
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public void categoriasLista() throws ClassNotFoundException, SQLException {

        DefaultListModel dlm = new DefaultListModel();

        String[] categorias = produto.verNome("Categoria").split("\n");

        for (String n : categorias) {
            dlm.addElement(n);
        }

        listaCategorias.setModel(dlm);
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
        listaCategorias = new javax.swing.JList<>();
        adicionarCategoria = new javax.swing.JButton();
        removerCategoria = new javax.swing.JButton();
        escreverCategoria = new javax.swing.JTextField();
        erro = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("categoria"); // NOI18N

        titulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        titulo.setText("Categorias");

        listaCategorias.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        listaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaCategorias);

        adicionarCategoria.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adicionarCategoria.setText("Adicionar");
        adicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCategoriaActionPerformed(evt);
            }
        });

        removerCategoria.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        removerCategoria.setText("Remover");
        removerCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCategoriaActionPerformed(evt);
            }
        });

        escreverCategoria.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        escreverCategoria.setText("ex: Lanche");

        erro.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        erro.setText("jLabel1");

        botaoCancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escreverCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarCategoria)
                    .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerCategoria)
                    .addComponent(botaoCancelar)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionarCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(escreverCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(erro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Adiciona categorias à base de dados que o utilizador escolher
     *
     * @param evt
     */
    private void adicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCategoriaActionPerformed
        escreverCategoria.setVisible(true);

        adicionarCategoria.setText("OK");

        selecao += 1;
        try {
            if (selecao == 2 && escreverCategoria.getText().equals("ex: Lanche")) {
                erro.setVisible(true);
                erro.setText("Nada foi alterado.");
                selecao = 1;
            } else if ("".equals(escreverCategoria.getText())) {
                erro.setVisible(true);
                erro.setText("Tem de adicionar um nome");
                selecao = 1;
            } else if (selecao == 2) {
                selecao = 1;
                erro.setVisible(true);
                erro.setText("A categoria já existe.");
            } else if (selecao == 2 && produto.nomeRepetido("Categoria", escreverCategoria.getText())) {
                produto.adicionarDados("Categoria", escreverCategoria.getText());
                categoriasLista();
                selecao = 0;
                erro.setVisible(false);
                adicionarCategoria.setText("Adicionar");
                escreverCategoria.setVisible(false);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdicionarCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_adicionarCategoriaActionPerformed

    private void removerCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCategoriaActionPerformed

        try {
            if ("Sem categoria".equals(listaCategorias.getSelectedValue())) {
                erro.setVisible(true);
                erro.setText("Nao pode eliminar");
                selecao = 1;
            } else {
                erro.setVisible(false);
                produto.removerCategoria(listaCategorias.getSelectedValue());
                categoriasLista();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdicionarCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_removerCategoriaActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        if (menu) {
            MostrarInterface mi = new MostrarInterface(this, new MenuInicial());
            mi.start();
        } else {
            this.setVisible(false);
            this.setDefaultCloseOperation(AdicionarCategoria.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void listaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCategoriasMouseClicked
        erro.setVisible(false);
    }//GEN-LAST:event_listaCategoriasMouseClicked

    public void interfaceMenu() {
        botaoCancelar.setText("Menu");
        menu = true;
    }

    public boolean menu() {
        return menu;
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
            java.util.logging.Logger.getLogger(AdicionarCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AdicionarCategoria().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdicionarCategoria.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarCategoria;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JLabel erro;
    private javax.swing.JTextField escreverCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaCategorias;
    private javax.swing.JButton removerCategoria;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
