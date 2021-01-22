/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adminstrador;

import BD.Menu;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author sofia
 */
public class Menus extends javax.swing.JFrame {

    private final Menu menu;

    /**
     * Creates new form Menus
     *
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public Menus() throws ClassNotFoundException, SQLException {
        initComponents();

        menu = new Menu();

        menusLista();

        listaMenu.setSelectedIndex(0);
        listaProdutos();

    }

    /**
     * Descricao: adiciona o nome dos menus as listas
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void menusLista() throws ClassNotFoundException, SQLException {

        DefaultListModel dlm = new DefaultListModel();

        String[] menus = menu.nomeMenu().split("\n");

        for (String n : menus) {
            dlm.addElement(n);
        }

        listaMenu.setModel(dlm);
    }

    /**
     * Descricao: adiciona todos os produtos associados ao menu clicado na lista
     * de Menus
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void listaProdutos() throws ClassNotFoundException, SQLException {
        DefaultListModel dlm = new DefaultListModel();

        String menuNome = listaMenu.getSelectedValue();

        int id = menu.verID("dADS", menuNome);
        String idProdutos = menu.IdProdutosAssociadosAoMenu(id);
        String[] produtos = menu.produtoAsssociadosAoMenu(idProdutos).split("\n");

        for (String n : produtos) {
            dlm.addElement(n);
        }

        listaProdutos.setModel(dlm);

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
        listaMenu = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pesquisaMenu = new javax.swing.JTextField();
        pesquisaProduto = new javax.swing.JTextField();
        adicionarProduto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        botaoPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        titulo.setText("Menus");

        listaMenu.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        listaMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaMenu);

        listaProdutos.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        listaProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaProdutos);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Menus");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Produtos");

        pesquisaMenu.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        pesquisaMenu.setText("Pesquisa");
        pesquisaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaMenuActionPerformed(evt);
            }
        });

        pesquisaProduto.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        pesquisaProduto.setText("Pesquisa");
        pesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaProdutoActionPerformed(evt);
            }
        });

        adicionarProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adicionarProduto.setText("Adicionar");
        adicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarProdutoActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setText("Remover");

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton3.setText("Criar novo");

        jButton4.setText("✔");

        botaoPesquisa.setText("✔");
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisa)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adicionarProduto)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesquisaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPesquisa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3))
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(adicionarProduto)
                                .addGap(57, 57, 57)
                                .addComponent(jButton2)))))
                .addGap(0, 96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaMenuActionPerformed

    private void listaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMenuMouseClicked
        try {
            pesquisaMenu.setText("Pesquisa");
            pesquisaProduto.setText("Pesquisa");

            listaProdutos();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Menus.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_listaMenuMouseClicked


    private void pesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaProdutoActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed

        String pesquisa = pesquisaMenu.getText();

        DefaultListModel dlmMenu = new DefaultListModel();

        DefaultListModel dlmProdutos = new DefaultListModel();
        try {

            String[] menus = menu.nomeMenu().split("\n");

            for (String n : menus) {

                if (n.toLowerCase().contains(pesquisa.toLowerCase())) {
                    dlmMenu.addElement(n);
                }
                listaMenu.setSelectedIndex(0);
            }

             listaMenu.setModel(dlmMenu);
             
            if (listaMenu.getModel().getSize() == 0) {
                dlmMenu.addElement("Nada encontrado");
                listaMenu.setModel(dlmMenu);
                dlmProdutos.clear();
                dlmProdutos.addElement("");
                listaProdutos.setModel(dlmProdutos);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Menus.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void adicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarProdutoActionPerformed
        
    }//GEN-LAST:event_adicionarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Menus().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Menus.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarProduto;
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaMenu;
    private javax.swing.JList<String> listaProdutos;
    private javax.swing.JTextField pesquisaMenu;
    private javax.swing.JTextField pesquisaProduto;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}