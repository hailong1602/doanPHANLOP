/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import GUI.*;

/**
 *
 * @author nguye
 */
public class JFrame_Home extends JFrame{
    JPanel tablePanel,menuPanel,functionPanel;
    
    public void init()
    {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setLayout(new BorderLayout(3,3));
        menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(0,60));
        add(menuPanel,BorderLayout.NORTH);
        Font font = new Font("Calibri Light", Font.CENTER_BASELINE, 22);
//------------------------------------------------------------------------------         
        JButton lb1 = new JButton("QUẢN LÝ TOUR");
        lb1.setPreferredSize(new Dimension(200, 60));
        lb1.setBackground(Color.green);
        lb1.setFont(font);
        MouseListener lb1_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Tour_Dulich_Table tmp = new Tour_Dulich_Table();
                JPanel temp = tmp.Tour_Dulich_TableCreate();
                tablePanel.removeAll();
                tablePanel.add(temp);
                tablePanel.updateUI();
                
                Tour_Dulich_Function tmp1 = new Tour_Dulich_Function();
                JPanel temp1 = tmp1.Tour_Dulich_FunctionCreate();
                functionPanel.removeAll();
                functionPanel.add(temp1);
                functionPanel.updateUI();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                lb1.setBackground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                lb1.setBackground(Color.green);
            }
        };
        lb1.addMouseListener(lb1_mouse);
        
        JButton lb2 = new JButton("QUẢN LÝ ĐOÀN KHÁCH");
        lb2.setPreferredSize(new Dimension(200, 60));
        lb2.setBackground(Color.green);
        lb2.setFont(font);
        MouseListener lb2_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Doan_Khach_Panel tmp = new Doan_Khach_Panel();
                JPanel temp = tmp.Doan_Khach_TableCreate();
                tablePanel.removeAll();
                tablePanel.add(temp);
                tablePanel.updateUI();     
                
                functionPanel.removeAll();
                functionPanel.updateUI();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                lb2.setBackground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                lb2.setBackground(Color.green);
            }  
        };
        lb2.addMouseListener(lb2_mouse);
        JButton lb3 = new JButton("THỐNG KÊ");
        lb3.setPreferredSize(new Dimension(200, 60));
        lb3.setBackground(Color.green);
        lb3.setFont(font);
        MouseListener lb3_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JOptionPane.showInputDialog("Hello");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                lb3.setBackground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                lb3.setBackground(Color.green);
            }
        };
        lb3.addMouseListener(lb3_mouse);
        menuPanel.add(lb1);
        menuPanel.add(lb2);
        menuPanel.add(lb3);
//------------------------------------------------------------------------------      
        tablePanel = new JPanel();
        tablePanel.setBackground(Color.yellow);
        tablePanel.setPreferredSize(new Dimension(1200,1000));
        add(tablePanel,BorderLayout.WEST);
//------------------------------------------------------------------------------   
        functionPanel = new JPanel();
        functionPanel.setBackground(Color.green);
        add(functionPanel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    

  
    public static void main(String[] args) {
       JFrame_Home home = new JFrame_Home();
       home.init();
    }
    
}
