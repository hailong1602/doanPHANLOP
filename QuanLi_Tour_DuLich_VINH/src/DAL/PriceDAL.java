/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.tour_gia;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class PriceDAL {
    
    public ArrayList<tour_gia> ReadStaffDAL() throws Exception{
        ArrayList<tour_gia> price_list = new ArrayList<tour_gia>();
        MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
        String query = "SELECT * From tour_gia";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tour_gia price_tour = new tour_gia();
                price_tour.setGia_id(rs.getInt("gia_id"));
                price_tour.setGia_sotien(rs.getDouble("gia_sotien"));
                price_tour.setTour_id(rs.getInt("tour_id"));
                price_tour.setGia_tungay(rs.getDate("gia_tungay"));
                price_tour.setGia_denngay(rs.getDate("gia_denngay"));
                price_list.add(price_tour);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return price_list;
    }
    
    public void InformationUpdateStaffDAL(tour_gia price_tour) {
        try{           
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "UPDATE tour_gia "
                        + "gia_sotien = \"" + price_tour.getGia_sotien()+ "\" "
                        + "tour_id = \"" + price_tour.getTour_id()+ "\" "
                        + "gia_tungay = \"" + price_tour.getGia_tungay()+ "\" "
                        + "gia_denngay = \"" + price_tour.getGia_denngay()+ "\" "
                        + "WHERE `gia_id`= \"" + price_tour.getGia_id()+ "\" ";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null,"Error");
                e.printStackTrace();
            }
    }

    public void AddStaffDAL(tour_gia price_tour) {
        try {
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tour_gia (nv_id, nv_ten, nv_sdt, nv_ngaysinh , nv_email, nv_cmnd) VALUES ("
                        + "\"" + price_tour.getGia_id() + "\""
                        + ",\"" + price_tour.getGia_sotien() + "\""
                        + ",\"" + price_tour.getTour_id() + "\""
                        + ",\"" + price_tour.getGia_tungay() + "\""
                        + ",'" + price_tour.getGia_denngay() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void DeleteStaffDAL(tour_gia price_tour) {
        try {
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "DELETE FROM tour_gia WHERE "
                        + "gia_id = \"" + price_tour.getGia_id() + "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
