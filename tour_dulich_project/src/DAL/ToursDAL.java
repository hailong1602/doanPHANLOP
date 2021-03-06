/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.tour_loai;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Entity.tours;
import Entity.tours_loai;
import java.sql.ResultSet;
import java.util.Vector;
/**
 *
 * @author nguye
 */
public class ToursDAL {
    MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
    public ArrayList<tours> ReadTourDAL() throws Exception{
        ArrayList<tours> tour_list = new ArrayList();
        String query = "SELECT * From tours";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tours tour = new tours();
                tour.setTour_id(rs.getInt("tour_id"));
                tour.setTour_ten(rs.getString("tour_ten"));
                tour.setTour_mota(rs.getString("tour_mota"));
                tour.setLoai_id(rs.getInt("loai_id"));
                tour.setGia_id(rs.getInt("gia_id"));
                tour_list.add(tour);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return tour_list;
    }
    // lay ten tour , ten loai , mo ta loai
    public ArrayList GetTourAndSpecieDAL() throws Exception{
        ArrayList<tours_loai> tour_specie_list = new ArrayList();
        String query =  "SELECT tour_ten, loai_ten, loai_mota"
                        + " FROM tours AS T, tour_loai AS L"
                        + " WHERE T.loai_id = L.loai_id";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tours_loai tour_specie = new tours_loai();
                tour_specie.setTour_ten(rs.getString("tour_ten"));
                tour_specie.setLoai_ten(rs.getString("loai_ten"));
                tour_specie.setLoai_mota(rs.getString("loai_mota"));
                tour_specie_list.add(tour_specie);    
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return tour_specie_list;
    }
    
    public void InformationUpdateTourDAL(tours tour) {
        try{           
            Statement st = connect.getStatement();
            String sql = "UPDATE tours "
                    + "tour_ten = \"" + tour.getTour_ten()+ "\" "
                    + "tour_mota = \"" + tour.getTour_mota()+ "\" "
                    + "loai_id = \"" + tour.getLoai_id()+ "\" "
                    + "gia_id = \"" + tour.getGia_id()+ "\" "
                    + "WHERE `tour_id`= \"" + tour.getTour_id()+ "\" ";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Success");
        }
        catch (Exception e){ 
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void AddTourDAL(tours tour) {
        try {
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tours (tours_id, tour_ten, tour_mota, loai_id , gia_id) VALUES ("
                        + "\"" + tour.getTour_id() + "\""
                        + ",\"" + tour.getTour_ten() + "\""
                        + ",\"" + tour.getTour_mota() + "\""
                        + ",\"" + tour.getLoai_id() + "\""
                        + ",'" + tour.getGia_id() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void DeleteTourDAL(tours tour) {
        try {
                Statement st = connect.getStatement();
                String sql = "DELETE FROM tours WHERE "
                        + "tour_id = \"" + tour.getTour_id() + "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
    
    public void LookForAllDAL(String lookFor) {
        try {
                Statement st = connect.getStatement();
                String sql = "SELECT * FROM tours WHERE tour_id LIKE '%" + lookFor + "%'"
                        + "OR tour_ten LIKE '%" + lookFor + "%'"
                        + "OR tour_mota LIKE '%" + lookFor + "%'"
                        + "OR loai_id LIKE '%" + lookFor + "%'"
                        + "OR gia_id LIKE '%" + lookFor + "%'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
