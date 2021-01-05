/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sofia
 */
public class DesignConfigurarConta extends Design{

    JFrame frame;
    
    public DesignConfigurarConta(JFrame frame) {
        super(frame);
        this.frame = frame;
    }
    
    
    public void textField( JTextField nomeUtilizador, JPasswordField novaPasse, JPasswordField repetirPasse){
     
         frame.setLayout(null);
         
        //organizar os textField
        int largura = frame.getSize().width/2-235; // coloca o jTextfiedl no centro
        int alturaFrame = frame.getSize().height;
        int larguraTextField = 469;
        int alturaTextField = 39;
        
        nomeUtilizador.setBounds(largura, alturaFrame-425, larguraTextField, alturaTextField);
        novaPasse.setBounds(largura, alturaFrame-335, larguraTextField, alturaTextField);
        repetirPasse.setBounds(largura, alturaFrame-245, larguraTextField, alturaTextField);
    
    }
    
    public void label(JLabel textoNomeUtilizador, JLabel textoPasse, JLabel textoRepetirPasse){
    
        Dimension sizeNome = textoNomeUtilizador.getPreferredSize();
        Dimension sizePasse = textoNomeUtilizador.getPreferredSize();
        Dimension sizeRepetirPasse = textoNomeUtilizador.getPreferredSize();
        frame.setLayout(null);
        
        
        textoNomeUtilizador.setBounds((frame.getSize().width/2)-(textoNomeUtilizador.getSize().width)-15, (frame.getSize().height/2)-170, sizeNome.width, sizeNome.height);
        textoPasse.setBounds((frame.getSize().width/2)-(textoPasse.getSize().width)-60, (frame.getSize().height/2)-80, sizePasse.width, sizePasse.height);
        
        textoRepetirPasse.setBounds((frame.getSize().width/2)-(textoRepetirPasse.getSize().width)-35, (frame.getSize().height)-265, sizeRepetirPasse.width, sizeRepetirPasse.height);
    }
    
    public void textoErro(JLabel erro){
        
        super.textoErro(erro);
        
        Dimension size = erro.getPreferredSize();
        frame.setLayout(null);
        
        erro.setBounds((frame.getSize().width/2)-(erro.getSize().width/2), (frame.getSize().height)-210, 469, size.height);
        
    }
}
