/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design.empregadoCozinha;

import Design.Design;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author sofia
 */
public class DesignVerPedidos extends Design{
    
    public DesignVerPedidos(JFrame frame) {
        super(frame);
    }
    
    public void Jlist(JList mesas, JScrollPane mesasScroll, JList produtos, JScrollPane produtosScroll, JList alterarPedido, JScrollPane pedidoScroll){
        getJFrame().setLayout(null);
        
        mesas.setBounds(150, 100, 200, 250);
        mesasScroll.setBounds(150, 100, 200, 250);
        
        produtos.setBounds(450, 100, 250, 150);
        produtosScroll.setBounds(450, 100, 250, 150);
        
        alterarPedido.setBounds(450, 300, 250, 150);
        pedidoScroll.setBounds(450, 300, 250, 150);
        
        
    }
    
      public void label (JLabel mesas, JLabel produtos, JLabel alterarPedido, JLabel temporizador){
        Dimension sizeMesas = mesas.getPreferredSize();
        Dimension sizeProdutos = produtos.getPreferredSize();
        Dimension sizeAlterarPedido = alterarPedido.getPreferredSize();
        Dimension sizeTemporizador = temporizador.getPreferredSize();
        getJFrame().setLayout(null);
        
        mesas.setBounds(170, 80 , sizeMesas.width, sizeMesas.height);
        produtos.setBounds(500, 80, sizeProdutos.width,sizeProdutos.height);
        alterarPedido.setBounds(500, 280, sizeAlterarPedido.width, sizeAlterarPedido.height);
        temporizador.setBounds(700, 80, sizeTemporizador.width, sizeTemporizador.height);
    }
    
}
