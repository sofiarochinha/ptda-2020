package Adminstrador;

import Design.*;
import Thread.*;
import BD.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author sofia
 */
public class AdicionarProduto extends javax.swing.JFrame {

    private final DesignAdicionarProdutos design;
    private final Produtos_Categorias produto;

    //popup menu
    private final JMenuItem m1;
    private final JMenuItem m2;

    private short selecao;
    private int id;
    private boolean menu, adicionar = true;

    public AdicionarProduto() throws ClassNotFoundException, SQLException {
        initComponents();

        this.design = new DesignAdicionarProdutos(this);
        this.produto = new Produtos_Categorias();
        this.m1 = new JMenuItem("Categoria");
        this.m2 = new JMenuItem("Personalizacao");

        design.titulo(titulo);
        design.BotaoCancelar(botaoCancelar);
        design.BotaoProximo(BotaoProximo);
        design.textoLabel(nomeProduto, descricaoProduto, personalizacaoProduto, tempoProduto, minsProduto, precoProduto, ivaProduto, catergoriaProduto);
        design.textField(escreverNome, escreverDescricao);
        design.spinner(spinnerTempo, spinnerPreco);
        design.botaoAdicionarProduto(adicionarCategoria);
        design.comboBox(comboboxCategoria, comboboxPersonalizacao, comboboxIva);
        design.erro(erro);

        //limitar a escrita a 40 caracteres e também às bordas do componente
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        escreverDescricao.setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        escreverDescricao.setLineWrap(true);
        escreverDescricao.setDocument(new JTextFieldLimit(40));

        //atualizar as comboboxsS
        comboxCategoria();
        comboxPersonalizacao();

        //coloca invisivel a label do erro
        erro.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jDialog2 = new javax.swing.JDialog();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        titulo = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JLabel();
        tempoProduto = new javax.swing.JLabel();
        precoProduto = new javax.swing.JLabel();
        descricaoProduto = new javax.swing.JLabel();
        personalizacaoProduto = new javax.swing.JLabel();
        escreverNome = new javax.swing.JTextField();
        spinnerTempo = new javax.swing.JSpinner();
        minsProduto = new javax.swing.JLabel();
        comboboxCategoria = new javax.swing.JComboBox<>();
        botaoCancelar = new javax.swing.JButton();
        BotaoProximo = new javax.swing.JButton();
        spinnerPreco = new javax.swing.JSpinner();
        ivaProduto = new javax.swing.JLabel();
        comboboxIva = new javax.swing.JComboBox<>();
        catergoriaProduto = new javax.swing.JLabel();
        comboboxPersonalizacao = new javax.swing.JComboBox<>();
        adicionarCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        escreverDescricao = new javax.swing.JTextArea();
        erro = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("AdicionarProduto"); // NOI18N

        titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        titulo.setText("Adicionar Produto");

        nomeProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nomeProduto.setText("Nome:");

        tempoProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tempoProduto.setText("Tempo:");

        precoProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        precoProduto.setText("Preço:");

        descricaoProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        descricaoProduto.setText("Descrição:");

        personalizacaoProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        personalizacaoProduto.setText("Personalização:");

        escreverNome.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        escreverNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escreverNomeActionPerformed(evt);
            }
        });

        spinnerTempo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        spinnerTempo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 90, 1));

        minsProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        minsProduto.setText("mins");

        comboboxCategoria.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comboboxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboboxCategoriaMouseEntered(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        botaoCancelar.setText("Cancelar");

        BotaoProximo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotaoProximo.setText("Adicionar");
        BotaoProximo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoActionPerformed(evt);
            }
        });

        spinnerPreco.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        spinnerPreco.setModel(new javax.swing.SpinnerNumberModel(0.01d, 0.01d, null, 0.1d));

        ivaProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ivaProduto.setText("Iva:");

        comboboxIva.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comboboxIva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6%", "13%", "23%" }));
        comboboxIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxIvaActionPerformed(evt);
            }
        });

        catergoriaProduto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        catergoriaProduto.setText("Categoria:");

        comboboxPersonalizacao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comboboxPersonalizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "oi" }));
        comboboxPersonalizacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboboxPersonalizacaoMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboboxPersonalizacaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboboxPersonalizacaoMouseEntered(evt);
            }
        });
        comboboxPersonalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxPersonalizacaoActionPerformed(evt);
            }
        });

        adicionarCategoria.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adicionarCategoria.setText("Alterar");
        adicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCategoriaActionPerformed(evt);
            }
        });

        escreverDescricao.setColumns(20);
        escreverDescricao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        escreverDescricao.setRows(5);
        jScrollPane1.setViewportView(escreverDescricao);

        erro.setText("Tem de adicionar um nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tempoProduto)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(minsProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoProximo)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(precoProduto)
                                                .addGap(30, 30, 30)
                                                .addComponent(spinnerPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ivaProduto))
                                        .addGap(35, 35, 35))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(erro, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(titulo)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(descricaoProduto)))
                                        .addGap(105, 105, 105))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboboxIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(comboboxCategoria, 0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(catergoriaProduto)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escreverNome, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(personalizacaoProduto)))
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adicionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(573, 573, 573)
                    .addComponent(comboboxPersonalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(titulo)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeProduto)
                            .addComponent(escreverNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(descricaoProduto)
                                    .addComponent(personalizacaoProduto))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(catergoriaProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(erro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tempoProduto)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(spinnerTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(minsProduto)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precoProduto)
                                    .addComponent(spinnerPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ivaProduto)
                                    .addComponent(comboboxIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(adicionarCategoria)
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(BotaoProximo))
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(comboboxPersonalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(349, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escreverNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escreverNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escreverNomeActionPerformed

    private void BotaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoActionPerformed
        try {

            MostrarInterface mi;
            comboxCategoria();

            if (escreverNome.getText().equals("")) {
                erro.setVisible(true);
                erro.setText("Tem adicionar um nome.");
            } else if (!produto.nomeRepetido("Produto", escreverNome.getText()) && adicionar) {
                erro.setVisible(true);
                erro.setText("Esse nome já existe");
            } else if (adicionar) {
                produto.adicionarProduto(escreverNome.getText(), (Integer) spinnerTempo.getValue(),
                        (String) comboboxIva.getSelectedItem(), escreverDescricao.getText(), (double) spinnerPreco.getValue(),
                        (String) comboboxCategoria.getSelectedItem(), (String) comboboxPersonalizacao.getSelectedItem());

            } else {
                System.out.println(id);
                System.out.println(escreverNome.getText());
                produto.updateProduto(id, escreverNome.getText(), (String) comboboxCategoria.getSelectedItem(),
                        (double) spinnerPreco.getValue(), escreverDescricao.getText(), (String) comboboxIva.getSelectedItem(),
                        (String) comboboxPersonalizacao.getSelectedItem(), (Integer) spinnerTempo.getValue());
            }

            ProdutosAdicionados ap = new ProdutosAdicionados();

            if (menu) {
                ap.interfaceMenu();
                mi = new MostrarInterface(this, ap);
                mi.start();
            } else {
                mi = new MostrarInterface(this, ap);
                mi.start();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdicionarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoProximoActionPerformed

    private void comboboxIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxIvaActionPerformed

    private void adicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCategoriaActionPerformed

        jPopupMenu1.add(m1);
        jPopupMenu1.add(m2);

        jPopupMenu1.show(this, adicionarCategoria.getX(), adicionarCategoria.getY());

        ActionListener reviewsListener = (ActionEvent event) -> {
            if (event.getSource() == m1) {
                MostrarInterface mi;
                try {
                    mi = new MostrarInterface(this, new AdicionarCategoria());
                    mi.start();

                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(AdicionarProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (event.getSource() == m2) {
                MostrarInterface mi;
                try {
                    mi = new MostrarInterface(this, new Personalizacao());
                    mi.start();

                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(AdicionarProduto.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };

        m1.addActionListener(reviewsListener);
        m2.addActionListener(reviewsListener);

        selecao += 1;

        if (selecao == 2) {
            m1.removeActionListener(reviewsListener);
            m2.removeActionListener(reviewsListener);
            selecao = 1;
        }


    }//GEN-LAST:event_adicionarCategoriaActionPerformed

    private void comboboxPersonalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxPersonalizacaoActionPerformed

    }//GEN-LAST:event_comboboxPersonalizacaoActionPerformed

    private void comboboxPersonalizacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxPersonalizacaoMouseClicked

    }//GEN-LAST:event_comboboxPersonalizacaoMouseClicked

    private void comboboxPersonalizacaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxPersonalizacaoMousePressed

    }//GEN-LAST:event_comboboxPersonalizacaoMousePressed

    private void comboboxPersonalizacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxPersonalizacaoMouseEntered

        try {
            comboxPersonalizacao();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdicionarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_comboboxPersonalizacaoMouseEntered

    private void comboboxCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxCategoriaMouseEntered

        try {
            comboxCategoria();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdicionarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_comboboxCategoriaMouseEntered

    /**
     * Class para limitar o numero de caracteres escritos num determinado
     * textField
     */
    public class JTextFieldLimit extends PlainDocument {

        private int limit;

        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }

        JTextFieldLimit(int limit, boolean upper) {
            super();
            this.limit = limit;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str == null) {
                return;
            }
            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }

    public void comboxCategoria() throws ClassNotFoundException, SQLException {
        Object o = comboboxCategoria.getSelectedItem();
        comboboxCategoria.removeAllItems();

        String[] categorias = produto.verNome("Categoria").split("\n");
        for (String n : categorias) {
            comboboxCategoria.addItem(n);
        }

        comboboxCategoria.setSelectedItem(o);
    }

    public void comboxPersonalizacao() throws ClassNotFoundException, SQLException {
        Object o = comboboxPersonalizacao.getSelectedItem();

        comboboxPersonalizacao.removeAllItems();
        String[] personalizacao = produto.verNome("Personalizacao").split("\n");
        for (String n : personalizacao) {
            comboboxPersonalizacao.addItem(n);
        }

        comboboxPersonalizacao.setSelectedItem(o);
    }

    public void setEscreverNome(String escreverNome) {
        this.escreverNome.setText(escreverNome);
    }

    public void setDescricao(String descricao) {
        if ((!descricao.equals("null"))) {
            this.escreverDescricao.append(descricao);
        }
    }

    public void setSpinnerTempo(int tempo) {
        spinnerTempo.setValue(tempo);
    }

    public void setSpinnerPreco(double preco) {

        spinnerPreco.setValue(preco);
    }

    public void setComboboxCategoria(String categoria) {
        int n = 0;
        while (!comboboxCategoria.getItemAt(n).equals(categoria)) {
            n++;
        }

        comboboxCategoria.setSelectedIndex(n);
    }

    public void setComboboxPersonalizacao(String personalizacao) {
        int n = 0;
        while (!comboboxPersonalizacao.getItemAt(n).equals(personalizacao)) {
            n++;
        }

        comboboxPersonalizacao.setSelectedIndex(n);
    }

    public void setComboboxIva(Object iva) {
        int n = 0;
        while (!comboboxIva.getItemAt(n).equals(iva)) {
            n++;
        }

        comboboxIva.setSelectedIndex(n);
    }

    public void interfaceMenu() {
        menu = true;
    }

    public void setBotao() {
        BotaoProximo.setText("Alterar");
        adicionar = false;
    }

    public void setId(int id) {
        this.id = id;
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
            java.util.logging.Logger.getLogger(AdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AdicionarProduto().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdicionarProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoProximo;
    private javax.swing.JButton adicionarCategoria;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JLabel catergoriaProduto;
    private javax.swing.JComboBox<String> comboboxCategoria;
    private javax.swing.JComboBox<String> comboboxIva;
    private javax.swing.JComboBox<String> comboboxPersonalizacao;
    private javax.swing.JLabel descricaoProduto;
    private javax.swing.JLabel erro;
    private javax.swing.JTextArea escreverDescricao;
    private javax.swing.JTextField escreverNome;
    private javax.swing.JLabel ivaProduto;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel minsProduto;
    private javax.swing.JLabel nomeProduto;
    private javax.swing.JLabel personalizacaoProduto;
    private javax.swing.JLabel precoProduto;
    private javax.swing.JSpinner spinnerPreco;
    private javax.swing.JSpinner spinnerTempo;
    private javax.swing.JLabel tempoProduto;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
