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
        setTitle("PHẦN MỀM QUẢN LÝ TOUR DU LỊCH NHÓM 4");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setLayout(new BorderLayout(3,3));
        menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(0,60));
        add(menuPanel,BorderLayout.NORTH);
        Font font = new Font("Calibri Light", Font.CENTER_BASELINE, 22);
//------------------------------------------------------------------------------
        Font defaultFont = new Font("Arial",Font.BOLD,18);
        Color textColor = Color.decode("#ffffff");
        Color backgroundColor = Color.decode("#000000");
        Color hoverColor = Color.decode("#00aced");
        
        JButton bt0 = new JButton("TRANG CHỦ");
        bt0.setPreferredSize(new Dimension(200, 60));
        bt0.setFocusPainted(false);
        bt0.setForeground(textColor);
        bt0.setBackground(backgroundColor);
        bt0.setFont(defaultFont);
        bt0.setOpaque(true);
        MouseListener bt0_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                tablePanel.removeAll();
                tablePanel.updateUI();

                functionPanel.removeAll();
                functionPanel.updateUI();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bt0.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bt0.setBackground(backgroundColor);
            }
        };
        bt0.addMouseListener(bt0_mouse);
        
        JButton bt1 = new JButton("QUẢN LÝ TOUR");
        bt1.setPreferredSize(new Dimension(200, 60));
        bt1.setFocusPainted(false);
        bt1.setForeground(textColor);
        bt1.setBackground(backgroundColor);
        bt1.setFont(defaultFont);
        bt1.setOpaque(true);
        MouseListener bt1_mouse = new MouseAdapter() {
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
                bt1.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bt1.setBackground(backgroundColor);
            }
        };
        bt1.addMouseListener(bt1_mouse);
        
        JButton bt2 = new JButton("QUẢN LÝ ĐOÀN KHÁCH");
        bt2.setPreferredSize(new Dimension(300, 60));
        bt2.setFocusPainted(false);
        bt2.setForeground(textColor);
        bt2.setBackground(backgroundColor);
        bt2.setFont(defaultFont);
        bt2.setOpaque(true);
        MouseListener bt2_mouse = new MouseAdapter() {
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
                bt2.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bt2.setBackground(backgroundColor);
            }  
        };
        bt2.addMouseListener(bt2_mouse);
        JButton bt3 = new JButton("THỐNG KÊ");
        bt3.setPreferredSize(new Dimension(200, 60));
        bt3.setFocusPainted(false);
        bt3.setForeground(textColor);
        bt3.setBackground(backgroundColor);
        bt3.setFont(defaultFont);
        bt3.setOpaque(true);
        MouseListener bt3_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JOptionPane.showInputDialog("Hello");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bt3.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bt3.setBackground(backgroundColor);
            }
        };
        bt3.addMouseListener(bt3_mouse);
        menuPanel.add(bt0);
        menuPanel.add(bt1);
        menuPanel.add(bt2);
        menuPanel.add(bt3);
//------------------------------------------------------------------------------      
        tablePanel = new JPanel();
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
