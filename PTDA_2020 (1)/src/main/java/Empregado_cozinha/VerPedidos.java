package Empregado_cozinha;

import Adminstrador.Aplicacao;
import BD.*;
import Design.empregadoCozinha.DesignVerPedidos;
import Thread.MostrarInterface;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author HP
 */
public class VerPedidos extends javax.swing.JFrame {

    private final Pedidos pedido;
    private final Menu menu;
    private final DesignVerPedidos design;

    private int tempo;
    private final Timer temporizador;

    /**
     * Creates new form Ver_pedidos
     *
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public VerPedidos() throws ClassNotFoundException, SQLException {

        initComponents();
        this.pedido = new Pedidos();
        this.temporizador = new Timer("Timer");
        this.menu = new Menu();
        this.design = new DesignVerPedidos(this);

        timer.setVisible(false);
        erro.setVisible(false);

        //adicionar as mesas à lista
        pedidosLista();
        pedidosLista.setSelectedIndex(0);

        design.titulo(titulo);
        design.Jlist(pedidosLista, jScrollPane1, produtosPedidoLista, jScrollPane2, pedidoAlteradoLista, jScrollPane3);
        design.label(mesasText, produtosText, pedidoAlterado, timer);

        produtosPedidos();
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
        pedidosLista = new javax.swing.JList<>();
        prontoBotao = new javax.swing.JButton();
        sairBotao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        produtosPedidoLista = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        pedidoAlteradoLista = new javax.swing.JList<>();
        timer = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        mesasText = new javax.swing.JLabel();
        produtosText = new javax.swing.JLabel();
        pedidoAlterado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 550));

        pedidosLista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pedidosLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(pedidosLista);

        prontoBotao.setText("Pronto");
        prontoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prontoBotaoActionPerformed(evt);
            }
        });

        sairBotao.setText("Sair");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });

        produtosPedidoLista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        produtosPedidoLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        produtosPedidoLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosPedidoListaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                produtosPedidoListaMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(produtosPedidoLista);

        pedidoAlteradoLista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pedidoAlteradoLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(pedidoAlteradoLista);

        timer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        timer.setText("Temporizador");

        erro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        erro.setText("Aviso:");

        titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        titulo.setText("Pedidos");

        mesasText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        mesasText.setText("Mesas");

        produtosText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        produtosText.setText("Produtos");

        pedidoAlterado.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pedidoAlterado.setText("Pedido alterado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sairBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prontoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(mesasText)))
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(produtosText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(pedidoAlterado))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(titulo)
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(erro)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(304, 304, 304)))))
                        .addContainerGap(178, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesasText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sairBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prontoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(erro)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(produtosText)
                                .addGap(34, 34, 34)
                                .addComponent(pedidoAlterado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void produtosPedidoListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosPedidoListaMouseEntered


    }//GEN-LAST:event_produtosPedidoListaMouseEntered

    private void produtosPedidoListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosPedidoListaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_produtosPedidoListaMouseClicked

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
        MostrarInterface mi = new MostrarInterface(this, new Aplicacao());

        mi.start();
    }//GEN-LAST:event_sairBotaoActionPerformed

    private void prontoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prontoBotaoActionPerformed
        String[] mesa = pedidosLista.getSelectedValue().split(" ");
        
        try {
            int idPedido = pedido.verID(Integer.parseInt(mesa[1]));
            pedido.pedidoPronto(idPedido);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VerPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_prontoBotaoActionPerformed

    /**
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public void pedidosLista() throws ClassNotFoundException, SQLException {

        DefaultListModel dlm = new DefaultListModel();

        String nome = pedido.verPedido();
        if (nome.equals("")) {
            dlm.addElement("Não há pedidos.");
        } else {
            String[] personalizacao = nome.split(" ");
            for (String n : personalizacao) {
                dlm.addElement("Mesa: " + n);
            }

            pedidosLista.setModel(dlm);

        }

    }

    public void produtosPedidos() throws ClassNotFoundException, SQLException {

        DefaultListModel dlm = new DefaultListModel();
        String[] mesa = pedidosLista.getSelectedValue().split(" ");

        int idPedido = pedido.verID(Integer.parseInt(mesa[1]));

        String[] r = menu.verNomeProduto((menu.verIDProdutoDoMenu(menu.verMenu(idPedido))).split(" ")).split("\n");

        for (String i : r) {
            dlm.addElement(i);
        }

        produtosPedidoLista.setModel(dlm);
        timer.setVisible(true);
        this.tempo = menu.getTempo();
        timer.setText(tempo + ": mins");
        temporizador();

    }

    public void temporizador() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                tempo--;
                timer.setText((tempo) + ": mins");
                temporizador();
            }
        };

        if (tempo > 0) {
            long delay = 1000*3600;
            temporizador.schedule(task, delay);
        }
        if (tempo == 2) {
            erro.setVisible(true);
            erro.setText("Falta dois minutos para \n confecionar o pedido");
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new VerPedidos().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(VerPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel erro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mesasText;
    private javax.swing.JLabel pedidoAlterado;
    private javax.swing.JList<String> pedidoAlteradoLista;
    private javax.swing.JList<String> pedidosLista;
    private javax.swing.JList<String> produtosPedidoLista;
    private javax.swing.JLabel produtosText;
    private javax.swing.JButton prontoBotao;
    private javax.swing.JButton sairBotao;
    private javax.swing.JLabel timer;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
