/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adminstrador;

import BD.*;
import Design.DesignProdutosAdicionados;
import Thread.MostrarInterface;
import Thread.ProgressBar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author sofia
 */
public class ProdutosAdicionados extends javax.swing.JFrame {

    private final DesignProdutosAdicionados design;
    private final Produtos_Categorias produto;
    private boolean menu;
    
    /**
     * Ve todos produtos adicionados à base de dados consoante as categorias
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public ProdutosAdicionados() throws ClassNotFoundException, SQLException {
        initComponents();

        this.design = new DesignProdutosAdicionados(this);
        this.produto = new Produtos_Categorias();
        this.menu = false;
        
        design.titulo(titulo);
        design.jLabel(categoriasText, produtosText);
        design.BotaoProximo(botaoProximo);
        design.BotaoCancelar(botaoCancelar);
        design.progressBar(progressBar);
        design.botoes(botaoAdicionar, botaoRemover, botaoAnterior, botaoAlterar);
        design.listas(listaProdutos, jScrollPane4, listaCategoria, jScrollPane3);
        listaCategorias();

        //selecionar um item por default
        listaCategoria.setSelectedIndex(0);

        int id = produto.verID("Categoria", listaCategoria.getSelectedValue());
        String[] produtos = produto.nomeProdutosCategoria(id).split("\n");

        listaProdutos(produtos);

        progressBar.setVisible(true);
        listaProdutos.setSelectedIndex(0);
        
        erro.setVisible(false);
        
        progressBar.setVisible(true);
        progressBar.setStringPainted(true);
        progressBar.setValue(0);
        progressBar.setString(0 + "%");

    }

    /**
     * Descrição: Coloca na lista de categorias todas categorias que estam na BD
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void listaCategorias() throws ClassNotFoundException, SQLException {
        DefaultListModel dlm = new DefaultListModel();

        String[] categorias = produto.verNome("Categoria").split("\n");

        for (String n : categorias) {
            dlm.addElement(n);
        }

        listaCategoria.setModel(dlm);
    }

    public void listaProdutos(String[] arrayProdutos) throws ClassNotFoundException, SQLException {
        DefaultListModel dlm = new DefaultListModel();

        for (String n : arrayProdutos) {
            if (n.equals("")) 
                dlm.addElement("Nao tem nenhum produto associado.");
            else 
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

        jMenu1 = new javax.swing.JMenu();
        titulo = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaCategoria = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JList<>();
        categoriasText = new javax.swing.JLabel();
        produtosText = new javax.swing.JLabel();
        botaoProximo = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        botaoAlterar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 550));

        titulo.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        titulo.setText("Os seus produtos");

        erro.setText("jLabel1");

        listaCategoria.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        listaCategoria.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCategoriaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaCategoria);

        listaProdutos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        listaProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaProdutos);
        listaProdutos.getAccessibleContext().setAccessibleDescription("");

        categoriasText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        categoriasText.setText("Categorias");

        produtosText.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        produtosText.setText("Produtos");

        botaoProximo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoProximo.setText("Próximo");
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        botaoAnterior.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoAnterior.setText("Anterior");
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });

        botaoAdicionar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoRemover.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoAlterar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoriasText)
                        .addGap(134, 134, 134)
                        .addComponent(produtosText)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(botaoCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoAnterior))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoProximo)
                                    .addComponent(botaoAdicionar)
                                    .addComponent(botaoRemover))
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoAlterar)
                                .addGap(59, 59, 59))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriasText)
                    .addComponent(produtosText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAdicionar)
                        .addGap(28, 28, 28)
                        .addComponent(botaoAlterar)
                        .addGap(50, 50, 50)
                        .addComponent(botaoRemover)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(erro)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoProximo)
                    .addComponent(botaoAnterior)
                    .addComponent(botaoCancelar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCategoriaMouseClicked
        try {
            ProgressBar pb = new ProgressBar(progressBar);
            pb.start();
            String[] produtos = produto.nomeProdutosCategoria(
                    produto.verID("Categoria", listaCategoria.getSelectedValue())).split("\n");
            listaProdutos(produtos);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutosAdicionados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaCategoriaMouseClicked

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        MostrarInterface mi;
        try {
            AdicionarProduto ap = new AdicionarProduto();

            if (menu) {
                ap.interfaceMenu();
                mi = new MostrarInterface(this, ap);
                mi.start();
            } else {
                mi = new MostrarInterface(this, ap);
                mi.start();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutosAdicionados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        MostrarInterface mi;
        
        if (menu) {
            mi = new MostrarInterface(this, new MenuInicial());
            mi.start();

        } else {
            mi = new MostrarInterface(this, new CadastrarEquipa());
            mi.start();
        }

        ProgressBar pb = new ProgressBar(progressBar);
        pb.start();
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed

        try {
            ProgressBar pb = new ProgressBar(progressBar);
            pb.start();

            //remove o produto do menu e da base de dados
            int idProduto = produto.verID("Produto", listaProdutos.getSelectedValue());

            produto.removerDado("Menu_Produto", null, idProduto, "ID_Produto");
            produto.removerDado("Produto", null, idProduto, "ID");

            //atualiza a lista
            int idCategoria = produto.verID("Categoria", listaCategoria.getSelectedValue());
            String[] produtos = produto.nomeProdutosCategoria(idCategoria).split("\n");

            listaProdutos(produtos);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutosAdicionados.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        MostrarInterface mi;
        
        try {
            String[] dados = produto.dadosCadaProduto(listaProdutos.getSelectedValue()).split("\n");
            AdicionarProduto ap = new AdicionarProduto();
            
            //insere os dados do produto na interface
            ap.setComboboxCategoria(produto.dadosID(Integer.parseInt(dados[0]), "Categoria"));
            ap.setSpinnerPreco(Double.parseDouble(dados[1]));
            ap.setDescricao(dados[2]);
            ap.setComboboxIva(produto.dadosID(Integer.parseInt(dados[3]), "Iva") + "%");
            ap.setComboboxPersonalizacao(produto.dadosID(Integer.parseInt(dados[4]), "Personalizacao"));
            ap.setSpinnerTempo(Integer.parseInt(dados[5]));
            ap.setEscreverNome(dados[6]);
            
            if (menu) {
                ap.interfaceMenu();
                mi = new MostrarInterface(this, ap);
                mi.start();
            } else {
                ap.setBotao();
                ap.setId(produto.verID("Produto", dados[6]));
                mi = new MostrarInterface(this, ap);
                mi.start();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutosAdicionados.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed

    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
        MostrarInterface mi;
        try {
            mi = new MostrarInterface(this, new AdicionarProduto());
            mi.start();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutosAdicionados.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        ProgressBar pb = new ProgressBar(progressBar);
        pb.start();

    }//GEN-LAST:event_botaoAnteriorActionPerformed

    public void interfaceMenu() {

        botaoAnterior.setVisible(false);
        botaoProximo.setText("Menu");
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
            java.util.logging.Logger.getLogger(ProdutosAdicionados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosAdicionados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosAdicionados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosAdicionados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ProdutosAdicionados().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ProdutosAdicionados.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JLabel categoriasText;
    private javax.swing.JLabel erro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listaCategoria;
    private javax.swing.JList<String> listaProdutos;
    private javax.swing.JLabel produtosText;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
