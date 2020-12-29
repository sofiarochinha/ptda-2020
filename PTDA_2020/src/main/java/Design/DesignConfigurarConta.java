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

    public DesignConfigurarConta() {
    
        super();
    }
    
    
    public void textField( JTextField nomeUtilizador, JPasswordField novaPasse, JPasswordField repetirPasse, JFrame frame){
     
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
    
    public void label(JLabel textoNomeUtilizador, JLabel textoPasse, JLabel textoRepetirPasse, JFrame frame){
    
        Dimension sizeNomeLabel = textoNomeUtilizador.getPreferredSize();
        Dimension sizePasseLabel = textoNomeUtilizador.getPreferredSize();
        Dimension sizeRepetirPasseLabel = textoNomeUtilizador.getPreferredSize();
        frame.setLayout(null);
        
        
        textoNomeUtilizador.setBounds((frame.getSize().width/2)-(textoNomeUtilizador.getSize().width)-15, (frame.getSize().height/2)-170, sizeNomeLabel.width, sizeNomeLabel.height);
        textoPasse.setBounds((frame.getSize().width/2)-(textoPasse.getSize().width)-60, (frame.getSize().height/2)-80, sizePasseLabel.width, sizePasseLabel.height);
        
        textoRepetirPasse.setBounds((frame.getSize().width/2)-(textoRepetirPasse.getSize().width)-35, (frame.getSize().height)-265, sizeRepetirPasseLabel.width, sizeRepetirPasseLabel.height);
    }
    
    public void textoErro(JLabel erro, JFrame frame){
        
        super.textoErro(erro);
        
        Dimension size = erro.getPreferredSize();
        frame.setLayout(null);
        
        erro.setBounds((frame.getSize().width/2)-(erro.getSize().width/2), (frame.getSize().height)-210, 469, size.height);
        
    }
}
