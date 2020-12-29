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
public class DesignAdicionarProdutos extends Design{
    
    /**
     * Organizar todos os espaços para preencher na interface de Adiconar Produto
     * @param nome
     * @param descricao
     * @param frame 
     */
    public void textField(JTextField nome, JTextField descricao, JFrame frame){
     
        frame.setLayout(null);
        
        nome.setBounds(((frame.getSize().width/2)-(nome.getSize().width)*2-50), (frame.getSize().height/2)-162, 100, 30);
        descricao.setBounds((frame.getSize().width/2)-(descricao.getSize().width/2), (frame.getSize().height/2)-140, 150, 200);
        
    }
    
     public void spinner(JSpinner tempo, JSpinner preco, JFrame frame){
        Dimension sizeTempo = tempo.getPreferredSize();
        Dimension sizePreco = preco.getPreferredSize();
        
        frame.setLayout(null);
        
        tempo.setBounds((frame.getSize().width/2)-(tempo.getSize().width*5), (frame.getSize().height/2)-102, sizeTempo.width, sizeTempo.height);
        preco.setBounds((frame.getSize().width/2)-(preco.getSize().width*3), (frame.getSize().height/2)-40, sizePreco.width, sizePreco.height);
        
    }
    
    public void textoLabel(JLabel nome, JLabel descricao, JLabel personalizacao, JLabel tempo, JLabel mins, JLabel preco, JFrame frame){
    
        Dimension sizeNome = nome.getPreferredSize();
        Dimension sizeDescricao = descricao.getPreferredSize();
        Dimension sizePersonalizacao = personalizacao.getPreferredSize();
        Dimension sizeTempo = tempo.getPreferredSize();
        Dimension sizeMins = mins.getPreferredSize();
        Dimension sizePreco = preco.getPreferredSize();
        frame.setLayout(null);
        
        
        nome.setBounds(((frame.getSize().width/2)-(nome.getSize().width*6+31)), (frame.getSize().height/2)-160, sizeNome.width, sizeNome.height);
        descricao.setBounds((frame.getSize().width/2)-(descricao.getSize().width/2), (frame.getSize().height/2)-160, sizeDescricao.width, sizeDescricao.height);
        personalizacao.setBounds((frame.getSize().width)-(personalizacao.getSize().width)-140, (frame.getSize().height/2)-160, sizePersonalizacao.width, sizePersonalizacao.height);
        
        
        
        tempo.setBounds(((frame.getSize().width/2)-(nome.getSize().width*6+31)), (frame.getSize().height/2)-100, sizeTempo.width, sizeTempo.height);
        preco.setBounds(((frame.getSize().width/2)-(nome.getSize().width*6+31)), (frame.getSize().height/2)-40, sizePreco.width, sizePreco.height);
        //mins.setBounds((frame.getSize().width/2)-(textoRepetirPasse.getSize().width)-35, (frame.getSize().height)-265, sizeRepetirPasseLabel.width, sizeRepetirPasseLabel.height);
    
        
    }
    
    
    
}
