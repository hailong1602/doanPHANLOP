/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.StaffBLL;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class JFrame_Home extends JFrame{

    
    JPanel tablePanel,menuPanel;
    static JPanel functionPanel;
    
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
        
        Create_Menu_Panel();
        
//------------------------------------------------------------------------------      
        tablePanel = new JPanel();
        tablePanel.setPreferredSize(new Dimension(1200,1000));
        add(tablePanel,BorderLayout.WEST);
//------------------------------------------------------------------------------   
        functionPanel = new JPanel();
        add(functionPanel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void Create_Menu_Panel(){
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
                JTable_Tour_Dulich tmp = new JTable_Tour_Dulich();
                JPanel temp = tmp.Tour_Dulich_TableCreate();
                tablePanel.removeAll();
                tablePanel.add(temp);
                tablePanel.updateUI();
                
                Function_Tour_Dulich tmp1 = new Function_Tour_Dulich();
                JPanel temp1 = tmp1.Tour_Dulich_ImageCreate();
                JPanel temp2 = tmp1.Tour_Dulich_FunctionCreate();
                functionPanel.removeAll();
                functionPanel.add(temp1);
                functionPanel.add(temp2);
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
        
        JButton bt2 = new JButton("QUẢN LÝ KHÁCH HÀNG");
        bt2.setPreferredSize(new Dimension(300, 60));
        bt2.setFocusPainted(false);
        bt2.setForeground(textColor);
        bt2.setBackground(backgroundColor);
        bt2.setFont(defaultFont);
        bt2.setOpaque(true);
        MouseListener bt2_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                bt2.setBackground(hoverColor);
                menuPanel.updateUI();
                
                JTable_Khach_Hang tmp = new JTable_Khach_Hang();
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
        
        JButton bt3 = new JButton("QUẢN LÝ NHÂN VIÊN");
        bt3.setPreferredSize(new Dimension(300, 60));
        bt3.setFocusPainted(false);
        bt3.setForeground(textColor);
        bt3.setBackground(backgroundColor);
        bt3.setFont(defaultFont);
        bt3.setOpaque(true);
        MouseListener bt3_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JTable_Nhan_Vien tmp = new JTable_Nhan_Vien();
                JPanel temp = tmp.Nhan_Vien_TableCreate();
                tablePanel.removeAll();
                tablePanel.add(temp);
                tablePanel.updateUI();     
                
                functionPanel.removeAll();
                functionPanel.updateUI();
                
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
        
        JButton bt4 = new JButton("THỐNG KÊ");
        bt4.setPreferredSize(new Dimension(200, 60));
        bt4.setFocusPainted(false);
        bt4.setForeground(textColor);
        bt4.setBackground(backgroundColor);
        bt4.setFont(defaultFont);
        bt4.setOpaque(true);
        MouseListener bt4_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JOptionPane.showInputDialog("Hello");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bt4.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bt4.setBackground(backgroundColor);
            }
        };
        bt4.addMouseListener(bt4_mouse);
        
        JButton bt5 = new JButton("TÌM KIẾM");
        bt5.setPreferredSize(new Dimension(200, 60));
        bt5.setFocusPainted(false);
        bt5.setForeground(textColor);
        bt5.setBackground(backgroundColor);
        bt5.setFont(defaultFont);
        bt5.setOpaque(true);
        MouseListener bt5_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JTable_Tim_Kiem tmp = new JTable_Tim_Kiem();
                JPanel temp = tmp.Tim_Kiem_TableCreate();
                tablePanel.removeAll();
                tablePanel.add(temp);
                tablePanel.updateUI();
                
                Function_Tim_Kiem tmp1 = new Function_Tim_Kiem();
                JPanel temp1 = tmp1.Tim_Kiem_FunctionCreate();
                JPanel temp2 = tmp1.Tim_Kiem_NC_FunctionCreate();
                functionPanel.removeAll();
                functionPanel.add(temp1);
                functionPanel.add(temp2);
                functionPanel.updateUI();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bt5.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bt5.setBackground(backgroundColor);
            }
        };
        bt5.addMouseListener(bt5_mouse);
        
        menuPanel.add(bt0);
        menuPanel.add(bt1);
        menuPanel.add(bt2);
        menuPanel.add(bt3);
        menuPanel.add(bt4);
        menuPanel.add(bt5);
    }
    static void update_nhanvien_function(String[] array) {
        Function_Nhan_Vien tmp1 = new Function_Nhan_Vien();
        JPanel temp1 = tmp1.Nhan_Vien_FunctionCreate(array);
        functionPanel.removeAll();
        functionPanel.add(temp1);
        functionPanel.updateUI();
    }

  
    public static void main(String[] args) {
       JFrame_Home home = new JFrame_Home();
       home.init();
    }
    
}
