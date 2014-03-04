/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.JFrame;

/**
 *
 * @author Fernando Anzola
 * 
 * esta clase permite visulizar la ventana 
 * en la cual se emplea los Automatas Finitos Deterministas AFD
 * 
 */
public final class AFDWindow extends JFrame{

   private MenuGui menuGui;
   private MainWindow mainWindow;
   private PanelAFD panelAFD;
   
    public AFDWindow() {
        
        setTitle("Automatas Finitas Deterministas");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        
        setLocationRelativeTo(null);
    
        
        panelAFD= new PanelAFD();
        panelAFD.setBounds(0, 30, 500, 470);
        this.add(panelAFD);
    
        menuGui= new MenuGui();
        menuGui.setBounds(0, 0, 500, 30);
        
         this.add(menuGui);

   
    }
    
  
    
    
    
    
    
}
