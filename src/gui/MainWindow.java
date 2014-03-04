/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Fernando Anzola
 */
public class MainWindow extends JFrame{
    
   private JButton buttonAFD;
   private Events events;
    
    public MainWindow() {
        
        setTitle("Teoria de automatas y lenguajes formales");
        setSize(300,200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        events= new Events();
        
        
        buttonAFD= new JButton("Automatas Finitos Deterministas");
        buttonAFD.setBounds(0, 0, 300, 30);
        buttonAFD.setActionCommand(Events.BUTTON_AFD);
        buttonAFD.addActionListener(events);
        this.add(buttonAFD);
        
  
}
}