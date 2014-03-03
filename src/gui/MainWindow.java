/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Fernando Anzola
 */
public class MainWindow extends JFrame{

   private MenuGui menuGui;
    
    public MainWindow() {
        
        setTitle("Teoria de automatas y lenguajes formales");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        
        
        menuGui= new MenuGui();
        setJMenuBar(menuGui);
        
    }
    
    
    
    
    
    
    
    
}
