/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JProgressBar;
/**
 *
 * @author sofia
 */
public class Design {
    
    private final JFrame frame;
    private final int larguraBotao;
    private final int alturaBotao;
    
    public Design(JFrame frame){
        this.frame = frame;
        larguraBotao = 110;
        alturaBotao = 34;
    }
    /**
     * Coloca todos os textos de erro a vermelho e com uma fonte pré-definida
     * @param nome 
     */
    public void textoErro(JLabel nome){
        nome.setFont(new Font("SansSerif", Font.PLAIN, 15));
        nome.setForeground(Color.RED); 
    }
    /**
     * Coloca o titulo das interfaces no centro e com uma fonte pré-definida
     * @param nome
     * @param o 
     */
    public void titulo(JLabel nome){
        
        Dimension size = nome.getPreferredSize();
        frame.setLayout(null);
              
        //centrar o titulo
        nome.setBounds((frame.getSize().width/2)-(nome.getSize().width/2), (frame.getSize().height/2)-250, size.width, size.height);
       
    }
    
    
    public void BotaoProximo(JButton botao){
         
        Dimension size = botao.getPreferredSize();
        frame.setLayout(null);
        
        botao.setBounds(700, (frame.getSize().height/2)+150, larguraBotao, alturaBotao);
         
        Botao(botao);
    }
    
     public void BotaoCancelar(JButton botao){
         
        Dimension size = botao.getPreferredSize();
        botao.setLayout(null);
        
        
        botao.setBounds(90, (frame.getSize().height/2)+150, larguraBotao, alturaBotao);
         
        Botao(botao);
    }
    
     public void BotaoAnterior(JButton anterior){
         
         frame.setLayout(null);
         anterior.setBounds(220, (frame.getSize().height/2)+150, larguraBotao, alturaBotao);
         
     }
    public void BotaoCentro(JButton botao){
        Dimension size = botao.getPreferredSize();
        frame.setLayout(null);
        
        botao.setBounds((frame.getSize().width/2)-(botao.getSize().width/3), (frame.getSize().height/2)+150, larguraBotao, alturaBotao);
         
        Botao(botao);
    }
    
    /**
     * Coloca os botoes a azul e arredondados
     * @param botao 
     */
    public void Botao(JButton botao){
        
        botao.setForeground(Color.BLUE);
        botao.setFont(new Font("SansSerif", Font.PLAIN, 18));
    
    }
    
    public void progressBar(JProgressBar pb){
        
        frame.setLayout(null);
        
        int larguraPb = 200;
        int alturaPb = 20;
        
        pb.setBounds((frame.getSize().width/2)-(pb.getSize().width/2), (frame.getSize().height/2)+160, larguraPb, alturaPb);
        
        pb.setStringPainted(true);
        pb.setValue(0);
        pb.setString(0 + "%");
    }

    public JFrame getJFrame(){
        return frame;
    }
    
    
}

