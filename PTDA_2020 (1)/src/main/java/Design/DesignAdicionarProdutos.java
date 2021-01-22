/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author sofia
 */
public class DesignAdicionarProdutos extends Design{

    private JFrame frame;
    //AdicionarProduto produto = new AdicionarProduto();
    
    public DesignAdicionarProdutos(JFrame frame) throws ClassNotFoundException, SQLException {
        super(frame);
        this.frame = frame;
        
    }
    
    /**
     * Organizar todos os espaços para preencher na interface de Adiconar Produto
     * @param nome
     * @param descricao
     *  
     */
    public void textField(JTextField nome, JTextArea descricao){
     
        frame.setLayout(null);
        
        nome.setBounds(((frame.getSize().width/2)-(nome.getSize().width)*2-50), (frame.getSize().height/2)-162, 100, 30);
        descricao.setBounds((frame.getSize().width/2)-(descricao.getSize().width/2), (frame.getSize().height/2)-140, 150, 200);
        
       
    }
    
   
    
     public void spinner(JSpinner tempo, JSpinner preco){
        Dimension sizeTempo = tempo.getPreferredSize();
        Dimension sizePreco = preco.getPreferredSize();
        
        frame.setLayout(null);
        
        tempo.setBounds(132, (frame.getSize().height/2)-102, sizeTempo.width, sizeTempo.height);
        preco.setBounds(132, (frame.getSize().height/2)-40, sizePreco.width, sizePreco.height);
        
    }
    
    public void textoLabel(JLabel nome, JLabel descricao, JLabel personalizacao, JLabel tempo, JLabel mins, JLabel preco, JLabel iva, JLabel categoria){
    
        Dimension sizeNome = nome.getPreferredSize();
        Dimension sizeDescricao = descricao.getPreferredSize();
        Dimension sizePersonalizacao = personalizacao.getPreferredSize();
        Dimension sizeTempo = tempo.getPreferredSize();
        Dimension sizeMins = mins.getPreferredSize();
        Dimension sizePreco = preco.getPreferredSize();
        Dimension sizeIva = iva.getPreferredSize();
        Dimension sizeCategoria = categoria.getPreferredSize();
        
        frame.setLayout(null);
        
        nome.setBounds(65, 130, sizeNome.width, sizeNome.height);
        descricao.setBounds((frame.getSize().width/2)-(descricao.getSize().width/2), 130, sizeDescricao.width, sizeDescricao.height);
        personalizacao.setBounds(625, 130, sizePersonalizacao.width, sizePersonalizacao.height);
        categoria.setBounds(625, 230, sizeCategoria.width, sizeCategoria.height);
        
        tempo.setBounds(65, (frame.getSize().height/2)-100, sizeTempo.width, sizeTempo.height);
        preco.setBounds(65, (frame.getSize().height/2)-40, sizePreco.width, sizePreco.height);
        iva.setBounds(65, (frame.getSize().height-255), sizeIva.width, sizeIva.height);
        mins.setBounds(200, (frame.getSize().height/2)-95, sizeMins.width, sizeMins.height);
    
        
    }
    
    public void botaoAdicionarProduto(JButton adicionarCategoria){
    
        Dimension sizeBotao = adicionarCategoria.getPreferredSize();
        frame.setLayout(null);
        
        adicionarCategoria.setBounds(625, 300, 110, 34);
        
    }
    
    public void comboBox(JComboBox categoria, JComboBox personalizacao, JComboBox iva){
        
        Dimension sizeCategoria = categoria.getPreferredSize();
        Dimension sizePersonalizacao = personalizacao.getPreferredSize();
        Dimension sizeIva = iva.getPreferredSize();
        frame.setLayout(null);
        
        categoria.setBounds(625, 260, 200, sizeCategoria.height);
        personalizacao.setBounds(625, 160, 200, sizePersonalizacao.height);
        
        //iva
        iva.setBounds(132, frame.getSize().height-255, sizeIva.width, sizeIva.height);
    }
    
    public void erro(JLabel erro){
        super.textoErro(erro);
        
        Dimension sizeErro = erro.getPreferredSize();
        frame.setLayout(null);
        
        erro.setBounds(65, 160, sizeErro.width, sizeErro.height);
        
    }
}
