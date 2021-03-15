/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.Year;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dangh
 */
public class Function_Nhan_Vien extends javax.swing.JPanel {

    /**
     * Creates new form Function_Nhan_Vien
     */
    public Function_Nhan_Vien() {
        initComponents();
    }
    public JPanel Nhan_Vien_FunctionCreate(){
        Font defaultFont = new Font("Arial",Font.BOLD,22);
        Color textColor = Color.decode("#ffffff");
        Color backgroundColor = Color.decode("#000000");
        Color hoverColor = Color.decode("#00aced");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2));
        JLabel bt1 = new JLabel("THÔNG TIN NHÂN VIÊN");
        String[] name = {"ID NHÂN VIÊN:","TÊN NHÂN VIÊN:","SỐ ĐIỆN THOẠI:","NGÀY SINH:","EMAIL:","CHỨC VỤ:"};
        JLabel[] label = new JLabel[name.length];
        JTextField[] textfield = new JTextField[name.length];

        for (int i = 0 ; i < label.length ; i++){
            label[i] = new JLabel(name[i]);
            textfield[i] = new JTextField();
            textfield[i].setPreferredSize(new Dimension(300, 50));
            label[i].setFont(defaultFont);
            textfield[i].setFont(defaultFont);       
            panel.add(label[i]);
            panel.add(textfield[i]);
        }
        
        return panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
