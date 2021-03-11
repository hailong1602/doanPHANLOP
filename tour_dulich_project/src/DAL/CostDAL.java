/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.tour_chiphi;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class CostDAL {
    MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
    public ArrayList<tour_chiphi> ReadCostDAL() throws Exception{
        ArrayList<tour_chiphi> cost_list = new ArrayList();
        String query = "SELECT * From tour_chiphi";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tour_chiphi cost = new tour_chiphi();
                cost.setChiphi_id(rs.getInt("chiphi_id"));
                cost.setDoan_id(rs.getInt("doan_id"));
                cost.setChiphi_total(rs.getDouble("chiphi_total"));
                cost.setChiphi_chitiet(rs.getString("chiphi_chitiet"));
                cost_list.add(cost);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return cost_list;
    }
    
    public void InformationUpdateCostDAL(tour_chiphi cost) {
        try{           
                
                Statement st = connect.getStatement();
                String sql = "UPDATE tour_chiphi "
                        + "doan_id = \"" + cost.getDoan_id()+ "\" "
                        + "chiphi_total = \"" + cost.getChiphi_total()+ "\" "
                        + "chiphi_chitiet = \"" + cost.getChiphi_chitiet()+ "\" "
                        + "WHERE `chiphi_id`= \"" + cost.getChiphi_id()+ "\" ";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null,"Error");
                e.printStackTrace();
            }
    }

    public void AddCostDAL(tour_chiphi cost) {
        try {
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tour_chiphi (chiphi_id, doan_id, chiphi_total, chiphi_chitiet) VALUES ("
                        + "\"" + cost.getChiphi_id() + "\""
                        + ",\"" + cost.getDoan_id() + "\""
                        + ",\"" + cost.getChiphi_total() + "\""
                        + ",'" + cost.getChiphi_chitiet() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void DeleteCostDAL(tour_chiphi cost) {
        try {
                Statement st = connect.getStatement();
                String sql = "DELETE FROM tour_chiphi WHERE "
                        + "chiphi_id = \"" + cost.getChiphi_id() + "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
