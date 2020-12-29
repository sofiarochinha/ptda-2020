/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
/**
 *
 * @author sofia
 */
public class Design {
    
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
    public void titulo(JLabel nome, JFrame o){
        
        Dimension size = nome.getPreferredSize();
        o.setLayout(null);
              
        //centrar o titulo
        nome.setBounds((o.getSize().width/2)-(nome.getSize().width/2), (o.getSize().height/2)-250, size.width, size.height);
        nome.setFont(new Font("SansSerif", Font.PLAIN, 36));
       
    }
    
    
    public void BotaoProximo(JButton botao, JFrame o){
         
        Dimension size = botao.getPreferredSize();
        botao.setLayout(null);
        
        botao.setBounds((o.getSize().width)-(botao.getSize().width*2-20), (o.getSize().height/2)+150, size.width, size.height);
         
        Botao(botao);
    }
    
     public void BotaoCancelar(JButton botao, JFrame o){
         
        Dimension size = botao.getPreferredSize();
        botao.setLayout(null);
                 
        botao.setBounds((o.getSize().width/2)-(botao.getSize().width*3+31), (o.getSize().height/2)+150, size.width, size.height);
         
        Botao(botao);
    }
    
    public void BotaoCentro(JButton botao, JFrame o){
        Dimension size = botao.getPreferredSize();
        botao.setLayout(null);
        
        botao.setBounds((o.getSize().width/2)-(botao.getSize().width/3), (o.getSize().height/2)+150, size.width, size.height);
         
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
    
    public void progressBar(JProgressBar pb, JFrame frame){
        
        frame.setLayout(null);
        
        int larguraPb = 200;
        int alturaPb = 20;
        
        pb.setBounds((frame.getSize().width/2)-(pb.getSize().width/2), (frame.getSize().height/2)+160, larguraPb, alturaPb);
        
    }

    
    
    
}

