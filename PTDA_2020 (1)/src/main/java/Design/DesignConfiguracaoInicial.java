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

/**
 *
 * @author sofia
 */
public class DesignConfiguracaoInicial extends Design{

    private JFrame frame;
    
    public DesignConfiguracaoInicial(JFrame frame) {
        super(frame);
        this.frame = frame;
    }
    
    
    
    public void label(JLabel textoNumMesas){
    
        Dimension sizeNumMesas = textoNumMesas.getPreferredSize();
        frame.setLayout(null);
        
        textoNumMesas.setBounds(((frame.getSize().width/2)-(textoNumMesas.getSize().width/2)), (frame.getSize().height/2)-125, sizeNumMesas.width, sizeNumMesas.height);
    }
    
     public void spinner(JSpinner numMesas){
    
        Dimension sizeNumMesas = numMesas.getPreferredSize();
        frame.setLayout(null);
        
        numMesas.setBounds(((frame.getSize().width/2)-(numMesas.getSize().width/2)), (frame.getSize().height/2)-90, 70, sizeNumMesas.height);
    }
    
     public void textoErro(JLabel erro){
        
        super.textoErro(erro);
        
        Dimension size = erro.getPreferredSize();
        frame.setLayout(null);
        
        erro.setBounds((frame.getSize().width/2)-(erro.getSize().width/2), (frame.getSize().height/2)-60, 469, size.height);
        
    }

}
