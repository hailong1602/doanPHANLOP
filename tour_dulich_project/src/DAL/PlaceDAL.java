/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.tour_diadiem;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class PlaceDAL {
    public ArrayList<tour_diadiem> ReadPlaceDAL() throws Exception{
        ArrayList<tour_diadiem> place_list = new ArrayList<tour_diadiem>();
        MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
        String query = "SELECT * From tour_diadiem";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tour_diadiem place = new tour_diadiem();
                place.setDd_id(rs.getInt("dd_id"));
                place.setDd_thanhpho(rs.getString("dd_thanhpho"));
                place.setDd_ten(rs.getString("dd_ten"));
                place.setDd_mota(rs.getString("dd_mota"));
                place_list.add(place);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return place_list;
    }
    
    public void InformationUpdatePlaceDAL(tour_diadiem place) {
        try{           
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "UPDATE tour_diadiem "
                        + "dd_thanhpho = \"" + place.getDd_thanhpho()+ "\" "
                        + "dd_ten = \"" + place.getDd_ten()+ "\" "
                        + "dd_mota = \"" + place.getDd_mota()+ "\" "
                        + "WHERE `dd_id`= \"" + place.getDd_id()+ "\" ";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null,"Error");
                e.printStackTrace();
            }
    }

    public void AddPlaceDAL(tour_diadiem place) {
        try {
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tour_diadiem (dd_id, dd_thanhpho, dd_ten, dd_mota) VALUES ("
                        + "\"" + place.getDd_id()+ "\""
                        + ",\"" + place.getDd_thanhpho()+ "\""
                        + ",\"" + place.getDd_ten()+ "\""
                        + ",'" + place.getDd_mota()+ "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void DeletePlaceDAL(tour_diadiem place) {
        try {
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "DELETE FROM tour_diadiem WHERE "
                        + "dd_id = \"" + place.getDd_id()+ "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
