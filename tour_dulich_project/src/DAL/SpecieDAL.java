/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.tour_loai;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class SpecieDAL {
    MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
    public ArrayList<tour_loai> ReadSpecieDAL() throws Exception{
        ArrayList<tour_loai> specie_list = new ArrayList();
        String query = "SELECT * From tour_loai";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tour_loai specie = new tour_loai();
                specie.setLoai_id(rs.getInt("loai_id"));
                specie.setLoai_ten(rs.getString("loai_ten"));
                specie.setLoai_mota(rs.getString("loai_mota"));
                specie_list.add(specie);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return specie_list;
    }
    
    public void InformationUpdateSpecieDAL(tour_loai specie) {
        try{           
                
                Statement st = connect.getStatement();
                String sql = "UPDATE tour_loai "
                        + "loai_ten = \"" + specie.getLoai_ten()+ "\" "
                        + "loai_mota = \"" + specie.getLoai_mota()+ "\" "
                        + "WHERE `loai_id`= \"" + specie.getLoai_id()+ "\" ";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null,"Error");
                e.printStackTrace();
            }
    }

    public void AddSpecieDAL(tour_loai specie) {
        try {
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tour_loai (loai_id, loai_ten, loai_mota) VALUES ("
                        + "\"" + specie.getLoai_id() + "\""
                        + ",\"" + specie.getLoai_ten() + "\""
                        + ",'" + specie.getLoai_mota() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void DeleteSpecieDAL(tour_loai specie) {
        try {
                Statement st = connect.getStatement();
                String sql = "DELETE FROM tour_loai WHERE "
                        + "loai_id = \"" + specie.getLoai_id() + "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
