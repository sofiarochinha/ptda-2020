/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author sofia
 */
public class DesignMenuInicial extends Design{
    
    private final int altura;
    private final int largura;

    public DesignMenuInicial(JFrame frame) {
        super(frame);
        altura = 100;
        largura = 140;
    }
    
    public void JButton(JButton produtos, JButton menus, JButton categorias, JButton equipa, JButton faturacao){
        
        getJFrame().setLayout(null);
        
        produtos.setBounds(80, 150,largura, altura);
        menus.setBounds(230, 150, largura, altura);
        categorias.setBounds(380, 150, largura, altura);
        equipa.setBounds(530, 150, largura, altura);
        faturacao.setBounds(680, 150, largura, altura);
    }
        
    
        
    
    
    
    
    
    
    
    
    
}
