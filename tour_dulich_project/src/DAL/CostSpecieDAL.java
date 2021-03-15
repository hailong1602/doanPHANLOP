/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.tour_loaichiphi;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class CostSpecieDAL {
    MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
    public ArrayList<tour_loaichiphi> Readcost_specie_specie_listDAL() throws Exception{
        ArrayList<tour_loaichiphi> cost_specie_list = new ArrayList();
        String query = "SELECT * From tour_loaichiphi";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tour_loaichiphi cost_specie = new tour_loaichiphi();
                cost_specie.setCp_id(rs.getInt("cp_id"));
                cost_specie.setCp_ten(rs.getString("cp_ten"));
                cost_specie.setCp_mota(rs.getString("cp_mota"));
                cost_specie_list.add(cost_specie);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return cost_specie_list;
    }
    
    public void InformationUpdatecost_specie_specie_listDAL(tour_loaichiphi cost_specie) {
        try{           
                
                Statement st = connect.getStatement();
                String sql = "UPDATE tour_loaichiphi "
                        + "cp_ten = \"" + cost_specie.getCp_ten()+ "\" "
                        + "cp_mota = \"" + cost_specie.getCp_mota()+ "\" "
                        + "WHERE `cp_id`= \"" + cost_specie.getCp_id()+ "\" ";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null,"Error");
                e.printStackTrace();
            }
    }

    public void Addcost_specie_specie_listDAL(tour_loaichiphi cost_specie) {
        try {
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tour_loaichiphi (cp_id, cp_ten, cp_mota) VALUES ("
                        + "\"" + cost_specie.getCp_id()+ "\""
                        + ",\"" + cost_specie.getCp_ten()+ "\""
                        + ",'" + cost_specie.getCp_mota()+ "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void Deletecost_specie_specie_listDAL(tour_loaichiphi cost_specie) {
        try {
                Statement st = connect.getStatement();
                String sql = "DELETE FROM tour_loaichiphi WHERE "
                        + "cp_id = \"" + cost_specie.getCp_id()+ "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
