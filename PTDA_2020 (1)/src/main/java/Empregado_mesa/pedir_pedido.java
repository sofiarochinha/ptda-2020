/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empregado_mesa;

import BD.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

/**
 *
 * @author Miguel
 */
public class pedir_pedido extends javax.swing.JFrame{
    
    private final Categoria categoria;
    private final Produtos_Categorias produto;
    private final DefaultListModel dm;
    private int idFuncionario, numMesa;
    private final Pedidos pedido;
    
    /**
     * Creates new form pedir_pedido
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public pedir_pedido() throws ClassNotFoundException, SQLException {
        initComponents();
        this.categoria = new Categoria();
        this.produto = new Produtos_Categorias();
        this.dm = new DefaultListModel();
        this.pedido = new Pedidos();
        
        String[] categorias = categoria.verCategoria().split(" ");
        setLayout(null);
        
        for(int i=0; i<categorias.length; i++)
        {
            JButton btn = new JButton(categorias[i]);
            btn.setText(categorias[i]);
            
            btn.setBounds(100+(i*150), 50, 150, 50);         
            add(btn);
            btn.getText(); 
            btn.setActionCommand(categorias[i]);
            btn.addActionListener((ActionEvent e) -> {
                try {
                    btn_1(e);//To change body of generated methods, choose Tools | Templates.
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(pedir_pedido.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } 
        
    }
                                            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista_Pedidos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_ped = new javax.swing.JList<>();
        btn_conf = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lista_Pedidos);

        jScrollPane2.setViewportView(lista_ped);

        btn_conf.setText("Confirmar Pedido");
        btn_conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confActionPerformed(evt);
            }
        });

        btn_remover.setText("Remover Opção");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        btn_add.setText("Adicionar Opção");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_conf, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_conf, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       /**
        * Adiciona um produto do pedido
        * @param evt 
        */
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        lista_ped.setModel(dm);
        dm.addElement(lista_Pedidos.getSelectedValue());
        
    }//GEN-LAST:event_btn_addActionPerformed

    /**
     * Remove um produto do pedido
     * @param evt 
     */
    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        dm.removeElementAt(lista_ped.getSelectedIndex());        
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confActionPerformed
            
        double preco = 0;
        int i = 0;
        
        try {
            String[] nome = pedido.idProdutos(4).split("\n");
            for(String n : nome){
                preco = pedido.precoTotal(Integer.parseInt(n));
                
            }
            
            pedido.inserir_Pedido(preco, numMesa, idFuncionario);
   
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(pedir_pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btn_confActionPerformed
   /**
    * Evento do botão de categoria
    * @param evt
    * @throws ClassNotFoundException
    * @throws SQLException 
    */
    private void btn_1(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {                                         
        DefaultListModel dlm = new DefaultListModel();
        int id;
        try {
            id = produto.verID("Categoria", evt.getActionCommand());
            String[] produtos = produto.nomeProdutosCategoria(id).split("\n");
            for (String n : produtos) {
                if (n.equals("")) {
                    dlm.addElement("Nao tem nenhum produto associado.");
                } else {
                    dlm.addElement(n);
            }
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pedir_pedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pedir_pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        lista_Pedidos.setModel(dlm);
    }
    
    public void setIDFuncionario(int idFuncionario){
        
        this.idFuncionario = idFuncionario;
        
    }
    
    public void setNumMesa(int numMesa){
        this.numMesa = numMesa;
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
            java.util.logging.Logger.getLogger(pedir_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedir_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedir_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedir_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pedir_pedido().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(pedir_pedido.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(pedir_pedido.class.getName()).log(Level.SEVERE, null, ex);
                }
                               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_conf;
    private javax.swing.JButton btn_remover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista_Pedidos;
    private javax.swing.JList<String> lista_ped;
    // End of variables declaration//GEN-END:variables
}
