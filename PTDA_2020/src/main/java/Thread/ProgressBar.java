/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import Adminstrador.*;
import javax.swing.JProgressBar;
/**
 *
 * @author sofia
 */
public class ProgressBar extends Thread {

    JProgressBar nome;
    
    public ProgressBar(JProgressBar nome) {
        this.nome = nome;
        
    }
  
  
  @Override
  public void run() {
        
       for (int x = 0; x<100; x++){
           
           nome.setValue(x);
           nome.setString(x + "%");
       }
  }
}
