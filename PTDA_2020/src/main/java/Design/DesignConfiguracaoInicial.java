/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author sofia
 */
public class DesignConfiguracaoInicial extends Design{
    
    
    public void label(JLabel textoNumMesas, JFrame frame){
    
        Dimension sizeNumMesas = textoNumMesas.getPreferredSize();
        frame.setLayout(null);
        
        textoNumMesas.setBounds(((frame.getSize().width/2)-(textoNumMesas.getSize().width/2)), (frame.getSize().height/2)-125, sizeNumMesas.width, sizeNumMesas.height);
    }
    
     public void spinner(JSpinner numMesas, JFrame frame){
    
        Dimension sizeNumMesas = numMesas.getPreferredSize();
        frame.setLayout(null);
        
        numMesas.setBounds(((frame.getSize().width/2)-(numMesas.getSize().width/2)), (frame.getSize().height/2)-90, 70, sizeNumMesas.height);
    }
    
     public void textoErro(JLabel erro, JFrame frame){
        
        super.textoErro(erro);
        
        Dimension size = erro.getPreferredSize();
        frame.setLayout(null);
        
        erro.setBounds((frame.getSize().width/2)-(erro.getSize().width/2), (frame.getSize().height/2)-60, 469, size.height);
        
    }

}
