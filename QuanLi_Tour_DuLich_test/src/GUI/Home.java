/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nguye
 */
public class Home extends JFrame{
    JPanel menuPanel,headerPanel,contentPanel;
    
    public void init()
    {
        Font font = new Font("Segoe UI",Font.BOLD,14);
        setSize(1280,700);
        setLayout(new BorderLayout(3,3));
        
   
        menuPanel=JPanel_Menu.CreateJPanel_Menu();
        menuPanel.setPreferredSize(new Dimension(200, 1000));

        headerPanel= JPanel_Header.CreateJPanel_Header();
        headerPanel.setPreferredSize(new Dimension(0,50));
        
        contentPanel = JPanel_TrangChu.CreateJPanel_TrangChu();
        
        add(menuPanel,BorderLayout.WEST);
        add(headerPanel,BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
  
    public static void main(String[] args) {
       Home home = new Home();
       home.init();
    }
    
}
