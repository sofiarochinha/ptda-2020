/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author sofia
 */
public class MostrarInterface extends Thread{
    
    JFrame atual;
    JFrame posterior;

    public MostrarInterface(JFrame atual, JFrame posterior) {
        this.atual = atual;
        this.posterior = posterior;
    }
    
    
    
    public void Interface(JFrame atual, JFrame posterior) throws InterruptedException{
        
        //obtem dados dos ecrãs
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        DisplayMode dm = gs[0].getDisplayMode();
        
        posterior.setLocation(dm.getWidth()/2-atual.getSize().width/2, dm.getHeight()/2-atual.getSize().height/2);
        
        Thread.sleep(500);
        posterior.setVisible(true);
               
        if(!posterior.getName().equals("Login") && !posterior.getName().equals("personalizacao")
                && !posterior.getName().equals("categoria")){ 
            atual.setVisible(false);
            atual.setDefaultCloseOperation(atual.EXIT_ON_CLOSE);
            atual.dispose();
        }
   }
    
     @Override
     public void run() {
        
        try {
            Interface(atual, posterior);
        } catch (InterruptedException ex) {
            Logger.getLogger(MostrarInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
}
