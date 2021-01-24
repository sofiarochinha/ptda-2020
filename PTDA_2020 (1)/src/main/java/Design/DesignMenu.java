package Design;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author sofia
 */
public class DesignMenu extends Design{
    
    public DesignMenu(JFrame frame) {
        super(frame);
    }
    
    public void Jlabel (JLabel menus, JLabel produtos){
        Dimension sizeCategoria = menus.getPreferredSize();
        Dimension sizeProdutos = produtos.getPreferredSize();
       
        getJFrame().setLayout(null);
        
        menus.setBounds(180, (getJFrame().getSize().height/2)-160, sizeCategoria.width, sizeCategoria.height);
        produtos.setBounds(580, (getJFrame().getSize().height/2)-160, sizeProdutos.width, sizeProdutos.height);
    }
    
    public void JList (JList menuLista, JScrollPane menu, JList produtoLista, JScrollPane produto){
       
        getJFrame().setLayout(null);
        
        menuLista.setBounds(100, (getJFrame().getSize().height/2)-100, 200, 250);
        menu.setBounds(100, (getJFrame().getSize().height/2)-100, 200, 250);
        produtoLista.setBounds(600, (getJFrame().getSize().height/2)-100, 200, 250);
        produto.setBounds(600, (getJFrame().getSize().height/2)-100, 200, 250);
    }
    
    public void pesquisa (JTextField escreverPesquisaMenu, JButton pesquisaMenu, JTextField escreverPesquisaProduto, JButton pesquisaProduto){
        Dimension sizeEscreverPesquisaMenu = escreverPesquisaMenu.getPreferredSize();
        Dimension sizePesquisaMenu = pesquisaMenu.getPreferredSize();
        Dimension sizeEscreverPesquisaProduto = escreverPesquisaMenu.getPreferredSize();
        Dimension sizePesquisaProduto = pesquisaMenu.getPreferredSize();
        getJFrame().setLayout(null);
        
        escreverPesquisaMenu.setBounds(100, (getJFrame().getSize().height/2)-130, 160, sizeEscreverPesquisaMenu.height);
        pesquisaMenu.setBounds(260, (getJFrame().getSize().height/2)-130, 40, sizePesquisaMenu.height);
        escreverPesquisaProduto.setBounds(600, (getJFrame().getSize().height/2)-130, 160, sizeEscreverPesquisaMenu.height);
        pesquisaProduto.setBounds(760, (getJFrame().getSize().height/2)-130, 40, sizePesquisaMenu.height);
    }
    
    
    public void jButton (JButton criarNovo, JButton adicionar, JButton remover){
        getJFrame().setLayout(null);
        
        criarNovo.setBounds(400, (getJFrame().getSize().height/2)-130, 110, 34);
        adicionar.setBounds(400, (getJFrame().getSize().height/2)-80, 110, 34);
        remover.setBounds(400, (getJFrame().getSize().height/2)-30, 110, 34);
    }
    
    
    public void criarMenu(JLabel nome, JLabel preco, JTextField escreverNome, JSpinner definirPreco ){
        Dimension sizeNome = nome.getPreferredSize();
        Dimension sizePreco = preco.getPreferredSize();
        
        getJFrame().setLayout(null);
        
        nome.setBounds(400, 190, sizeNome.width, sizeNome.height);
        escreverNome.setBounds(400, 220, 110, 34);
        preco.setBounds(400, 270, sizePreco.width, sizePreco.height);
        definirPreco.setBounds(400, 300, 110, 34);
        
        
    }
}
