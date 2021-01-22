/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author sofia
 */
public class DesignEquipa extends Design{
   
    public DesignEquipa(JFrame frame) {
        super(frame);
    }
    
    
    public void JButton(JButton adicionar, JButton alterar,  JButton remover){
        
        getJFrame().setLayout(null);
              
        //centrar o titulo
        adicionar.setBounds(700, 210, 110, 34);
        alterar.setBounds(700, 280, 110, 34);
        remover.setBounds(700, 350, 110, 34);
        
    }
    
    public void menuTab(JTabbedPane menu){
        Dimension size = menu.getPreferredSize();
        menu.setLayout(null);
        
        menu.setBounds(100, 120, 500, 300);
         
    }
    
}
