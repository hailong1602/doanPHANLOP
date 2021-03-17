/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.tour_nhanvien;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import GUI.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dangh
 */
public class Function_Nhan_Vien extends javax.swing.JPanel {
    String[] name = {"ID NHÂN VIÊN:","TÊN NHÂN VIÊN:","SỐ ĐIỆN THOẠI:","NGÀY SINH:","EMAIL:","CHỨC VỤ:"};
    JLabel[] label = new JLabel[name.length];
    JTextField[] textfield = new JTextField[name.length];
   
    public Function_Nhan_Vien() {
        initComponents();
    }
    public JPanel Nhan_Vien_FunctionCreate(String[] array){
        Font defaultFont = new Font("Arial",Font.BOLD,18);
        Color textColor = Color.decode("#ffffff");
        Color backgroundColor = Color.decode("#000000");
        Color hoverColor = Color.decode("#00aced");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9,2,10,10));
        JLabel bt1 = new JLabel("THÔNG TIN NHÂN VIÊN");
        for (int i = 0 ; i < label.length ; i++){
            label[i] = new JLabel(name[i]);
            textfield[i] = new JTextField();
            textfield[i].setPreferredSize(new Dimension(300, 50));
            label[i].setFont(defaultFont);
            textfield[i].setFont(defaultFont);
            textfield[i].setText(array[i]);
            panel.add(label[i]);
            panel.add(textfield[i]);
        }
        JButton them = new JButton("THÊM");
        JButton sua = new JButton("SỬA");
        JButton xoa = new JButton("XOÁ");
        them.setForeground(textColor);
        them.setBackground(backgroundColor);
        them.setFont(defaultFont);
//------------------------------------------------------------------------------        
        MouseListener them_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (JOptionPane.showConfirmDialog(null, "BẠN CÓ CHẮC CHẮN THỰC HIỆN KHÔNG?", "THÔNG BÁO",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    tour_nhanvien temp = new tour_nhanvien();
                temp.setNv_id(Integer.parseInt(textfield[0].getText()));
                temp.setNv_ten(textfield[1].getText());
                temp.setNv_sdt(textfield[2].getText());
                String ngaysinh = textfield[3].getText();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Date ns = null;
                try {
                    ns = (Date) df.parse(ngaysinh);
                } catch (ParseException ex) {
                    System.out.println("Error");
                }
                temp.setNv_ngaysinh(ns);
                temp.setNv_email(textfield[4].getText());
                temp.setNv_cmnd(textfield[5].getText());
                BLL.StaffBLL.AddStaffDAL(temp);
                } else {
                }
                
            }
            @Override
            public void mouseEntered(MouseEvent me) {
                them.setBackground(hoverColor);
            }
            @Override
            public void mouseExited(MouseEvent me) {
                them.setBackground(backgroundColor);
            }
            
        };
        them.addMouseListener(them_mouse);
        them.setFocusPainted(false);
        panel.add(them);
//------------------------------------------------------------------------------          
        sua.setForeground(textColor);
        sua.setBackground(backgroundColor);
        sua.setFont(defaultFont);
        MouseListener sua_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (JOptionPane.showConfirmDialog(null, "BẠN CÓ CHẮC CHẮN THỰC HIỆN KHÔNG?", "THÔNG BÁO",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                } else {
                    
                }
                
            }
            @Override
            public void mouseEntered(MouseEvent me) {
                sua.setBackground(hoverColor);
            }
            @Override
            public void mouseExited(MouseEvent me) {
                sua.setBackground(backgroundColor);
            }
            
        };
        sua.addMouseListener(sua_mouse);
        sua.setFocusPainted(false);
        panel.add(sua);
//------------------------------------------------------------------------------
        xoa.setForeground(textColor);
        xoa.setBackground(backgroundColor);
        xoa.setFont(defaultFont);
        MouseListener xoa_mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (JOptionPane.showConfirmDialog(null, "BẠN CÓ CHẮC CHẮN THỰC HIỆN KHÔNG?", "THÔNG BÁO",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                } else {
                    
                }
                
            }
            @Override
            public void mouseEntered(MouseEvent me) {
                xoa.setBackground(hoverColor);
            }
            @Override
            public void mouseExited(MouseEvent me) {
                xoa.setBackground(backgroundColor);
            }
            
        };
        xoa.addMouseListener(xoa_mouse);
        xoa.setFocusPainted(false);
        panel.add(xoa);
        return panel;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
