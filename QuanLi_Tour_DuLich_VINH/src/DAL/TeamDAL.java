/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.tour_doan;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class TeamDAL {
    MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
    public ArrayList<tour_doan> ReadStaffDAL() throws Exception{
        ArrayList<tour_doan> team_list = new ArrayList();
        String query = "SELECT * From tour_doan";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tour_doan team = new tour_doan();
                team.setDoan_id(rs.getInt("nv_id"));
                team.setTour_id(rs.getInt("nv_ten"));
                team.setDoan_name(rs.getString("nv_sdt"));
                team.setDoan_ngaydi(rs.getDate("nv_ngaysinh"));
                team.setDoan_ngayve(rs.getDate("nv_email"));
                team.setDoan_chitietchuogtrinh(rs.getString("nv_cmnd"));
                team_list.add(team);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return team_list;
    }
    
    public void InformationUpdateStaffDAL(tour_doan team) {
        try{           
                
                Statement st = connect.getStatement();
                String sql = "UPDATE tour_doan "
                        + "nv_ten = \"" + team.getNv_ten() + "\" "
                        + "nv_sdt = \"" + team.getNv_sdt() + "\" "
                        + "nv_ngaysinh = \"" + team.getNv_ngaysinh() + "\" "
                        + "nv_email = \"" + team.getNv_email() + "\" "
                        + "nv_cmnd = \"" + team.getNv_cmnd() + "\" "
                        + "WHERE `nv_id`= \"" + team.getNv_id() + "\" ";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null,"Error");
                e.printStackTrace();
            }
    }

    public void AddStaffDAL(tour_doan team) {
        try {
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tour_doan (nv_id, nv_ten, nv_sdt, nv_ngaysinh , nv_email, nv_cmnd) VALUES ("
                        + "\"" + team.getNv_id() + "\""
                        + ",\"" + team.getNv_ten() + "\""
                        + ",\"" + team.getNv_sdt() + "\""
                        + ",\"" + team.getNv_ngaysinh() + "\""
                        + ",\"" + team.getNv_email() + "\""
                        + ",'" + team.getNv_cmnd() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void DeleteStaffDAL(tour_doan team) {
        try {
                Statement st = connect.getStatement();
                String sql = "DELETE FROM toul_nhanvien WHERE "
                        + "nv_id = \"" + team.getNv_id() + "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
