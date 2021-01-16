package Design;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author sofia
 */
public class DesignAdicionarCategoria extends Design{
    
    private JFrame frame;
    
    public DesignAdicionarCategoria(JFrame frame) {
        super(frame);
        this.frame = frame;
    }
    
    public void botao(JButton adicionar, JButton remover, JButton cancelar){
        
        frame.setLayout(null);
        
        adicionar.setBounds(272, 40, 110, 34);
        remover.setBounds(272, 153, 110, 34);
        cancelar.setBounds(272, 203, 110, 34);
        
        super.Botao(cancelar);
    }
    
    @Override
    public void titulo(JLabel nome){
        
        Dimension size = nome.getPreferredSize();
        frame.setLayout(null);
           
        //centrar o titulo
        nome.setBounds((frame.getSize().width/2)-(nome.getSize().width/2), 6, size.width, size.height);
        
       
    }
    
     public void escrever(JTextField nome){
        
        Dimension size = nome.getPreferredSize();
        frame.setLayout(null);
        
        nome.setBounds(272, 92, size.width, size.height);
        
    }
     
    
    @Override
    public void textoErro(JLabel erro){
        
        Dimension sizeErro = erro.getPreferredSize();
        frame.setLayout(null);
        
        erro.setBounds(272, 132, 200, sizeErro.height);
        
        super.textoErro(erro);
       
    }
    
    
}
