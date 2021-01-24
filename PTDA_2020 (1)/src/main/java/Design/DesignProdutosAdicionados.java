package Design;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author sofia
 */
public class DesignProdutosAdicionados extends Design{
    
    public DesignProdutosAdicionados(JFrame frame) {
        super(frame);
    }
    
    /**
     * 
     * @param categoria
     * @param produtos 
     */
    public void jLabel(JLabel categoria, JLabel produtos){
        Dimension sizeCategoria = categoria.getPreferredSize();
        Dimension sizeProdutos = produtos.getPreferredSize();
       
        getJFrame().setLayout(null);
        
        categoria.setBounds(132, (getJFrame().getSize().height/2)-160, sizeCategoria.width, sizeCategoria.height);
        produtos.setBounds((getJFrame().getSize().width/2)-(produtos.getSize().width/2), (getJFrame().getSize().height/2)-160, sizeProdutos.width, sizeProdutos.height);
    }
    
     public void listas(JList list, JScrollPane scroll, JList listCategoria, JScrollPane scrollCategoria){
      
        getJFrame().setLayout(null);
        
        list.setBounds(400, 150, 200, 200);
        scroll.setBounds(400, 150,  200, 200);
        
        listCategoria.setBounds(110, 150, 200, 200);
        scrollCategoria.setBounds(110, 150, 200, 200);
     
     }
    
     public void botoes(JButton adicionar, JButton remover, JButton anterior, JButton alterar){
          getJFrame().setLayout(null);
          
          adicionar.setBounds(700, 180, 110, 34);
          alterar.setBounds(700, 250, 110, 34);
          remover.setBounds(700, 320, 110, 34);
          anterior.setBounds((getJFrame().getSize().width/2)-(anterior.getSize().width*2+10), (getJFrame().getSize().height/2)+150, 110, 34);
          
          super.Botao(anterior);
     }
     
    
    
}
