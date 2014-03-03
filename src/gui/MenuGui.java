/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Usuario
 */
public class MenuGui extends JMenuBar{

    
    private JMenu menuFile;
    private JMenu menuAbout;
    private JMenuItem itemFile;
    private JMenuItem itemAbout;
    
    public MenuGui() {
    
        setSize(500, 30);
        setLocation(0, 0);
      
        
        menuFile = new JMenu("File");
        menuAbout= new JMenu("About");
        
        itemFile=new JMenuItem("File");
        itemAbout=new JMenuItem("About");
               
        menuFile.add(itemFile);
        menuAbout.add(itemAbout);
        
        this.add(menuFile);
        this.add(menuAbout);
        
        
    
    }
    
    
    
    
    
}
