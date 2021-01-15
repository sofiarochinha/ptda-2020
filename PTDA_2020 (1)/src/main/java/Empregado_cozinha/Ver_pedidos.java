/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empregado_cozinha;
import BD.*;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author HP
 */
public class Ver_pedidos extends javax.swing.JFrame {
    Pedidos pedido = new Pedidos();
    Menu menu;
    /**
     * Creates new form Ver_pedidos
     */
    public Ver_pedidos() throws ClassNotFoundException, SQLException {
        initComponents();
        pedidosLista();
        PedidosLista.setSelectedIndex(0);
        String [] array = PedidosLista.getSelectedValue().split(" "); 
        menu = new Menu(parseInt(array[1]));
        produtosMenuPedido();
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
        PedidosLista = new javax.swing.JList<>();
        Pronto_Botao = new javax.swing.JButton();
        Logout_botao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProdutosPedidoLista = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        PedidoAlteradoLista = new javax.swing.JList<>();
        Timer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 550));

        PedidosLista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PedidosLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(PedidosLista);

        Pronto_Botao.setText("Pronto");

        Logout_botao.setText("Terminar sessão");

        ProdutosPedidoLista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ProdutosPedidoLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ProdutosPedidoLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdutosPedidoListaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProdutosPedidoListaMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(ProdutosPedidoLista);

        PedidoAlteradoLista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PedidoAlteradoLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(PedidoAlteradoLista);

        Timer.setText("Temporizador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logout_botao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                        .addComponent(Pronto_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Timer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logout_botao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pronto_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProdutosPedidoListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdutosPedidoListaMouseEntered
        String [] array = PedidosLista.getSelectedValue().split(" ");
        menu.setPedido(parseInt(array[1]));
        try {
            produtosMenuPedido();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ver_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Ver_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ProdutosPedidoListaMouseEntered

    private void ProdutosPedidoListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdutosPedidoListaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutosPedidoListaMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public void pedidosLista() throws ClassNotFoundException, SQLException {

        DefaultListModel dlm = new DefaultListModel();

        String nome = pedido.verPedido();
        String[] personalizacao = nome.split(" ");
        for (String n : personalizacao) {
            dlm.addElement("Mesa: " + n);
        }

        PedidosLista.setModel(dlm);
    }
    
    public void produtosMenuPedido() throws ClassNotFoundException, SQLException{
        DefaultListModel dlm = new DefaultListModel();

        String nome = menu.verNomeProduto();
        System.out.println(nome);
        String[] produto = nome.split(" ");
        for (String n : produto) {
            dlm.addElement(n);
        }
        
        ProdutosPedidoLista.setModel(dlm);
    }
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
            java.util.logging.Logger.getLogger(Ver_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ver_pedidos().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Ver_pedidos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Ver_pedidos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout_botao;
    private javax.swing.JList<String> PedidoAlteradoLista;
    private javax.swing.JList<String> PedidosLista;
    private javax.swing.JList<String> ProdutosPedidoLista;
    private javax.swing.JButton Pronto_Botao;
    private javax.swing.JLabel Timer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}