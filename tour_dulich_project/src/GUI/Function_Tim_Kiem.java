/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author dangh
 */
public class Function_Tim_Kiem extends javax.swing.JPanel {

    /**
     * Creates new form Function_Tim_Kiem
     */
    public Function_Tim_Kiem() {
        initComponents();
    }
    public JPanel Tim_Kiem_FunctionCreate(){
        Font defaultFont = new Font("Arial",Font.BOLD,22);
        Color textColor = Color.decode("#ffffff");
        Color backgroundColor = Color.decode("#000000");
        Color hoverColor = Color.decode("#00aced");
        
        JPanel panel = new JPanel();
        JTextField timkiem_text = new JTextField();
        timkiem_text.setPreferredSize(new Dimension(400, 40));
        timkiem_text.setFont(defaultFont);
        panel.add(timkiem_text);
        JButton timkiem_button = new JButton();
        timkiem_button.setPreferredSize(new Dimension(100, 40));
        timkiem_button.setBackground(backgroundColor);
        timkiem_button.setFont(defaultFont);
        timkiem_button.setForeground(textColor);
        timkiem_button.setIcon(new ImageIcon("D:\\doanPHANLOP\\tour_dulich_project\\src\\Images\\search.png"));
        panel.add(timkiem_button);
        
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
