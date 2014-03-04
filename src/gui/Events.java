/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Fernando Anzola
 */
public class Events implements ActionListener{

  

    
    
    
    public static String BUTTON_AFD="Automatas finitos deterministas";/// AFD automastas finitos deterministas
    
    @Override
    public void actionPerformed(ActionEvent ae) {
     String action= ae.getActionCommand();
     
     
     if (action.equalsIgnoreCase(BUTTON_AFD)){
         AFDWindow aFDWindow= new AFDWindow();
         aFDWindow.setVisible(true);
      
     }
     
     
     
    
    }
    
}
