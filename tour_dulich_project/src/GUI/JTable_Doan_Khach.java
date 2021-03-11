/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dangh
 */
public class JTable_Doan_Khach extends javax.swing.JPanel {

    /**
     * Creates new form Doan_Khach_Panel
     */
    public JTable_Doan_Khach() {
        initComponents();
    }
    public JPanel Doan_Khach_TableCreate(){
        JPanel panel = new JPanel();
        Vector vctHeader = new Vector();
        Vector vctData = new Vector();
        String[] strHeader = {"ID","Tên KH","SĐT","Ngày sinh","Email","CMND"};
        for (int i = 0; i< strHeader.length ; i++)
        {
            vctHeader.add(strHeader[i]);
        }
        JTable table = new JTable(strHeader.length,6);
        table.setModel(new DefaultTableModel(vctData,vctHeader));
        JScrollPane sp = new JScrollPane(table);
        sp.setPreferredSize(new Dimension(1100, 900));
        
        table.getTableHeader().setFont(new Font("Arial", BOLD, 18)); //set font cho vector header
        table.getTableHeader().setForeground(Color.black); //set màu chữ cho header
        table.getTableHeader().setPreferredSize(new Dimension(30, 40));//set độ dài độ rộng của header
        table.setRowHeight(40);
        table.setGridColor(Color.GREEN);
        table.setFillsViewportHeight(true);//hiển thị table     
        table.setShowGrid(true);
        table.setDefaultEditor(Object.class, null);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);
        table.getColumnModel().getColumn(5).setPreferredWidth(150);
        
        panel.setPreferredSize(new Dimension(1200,1000));
        panel.add(sp);
        panel.setVisible(true);
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
