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
                team.setDoan_id(rs.getInt("doan_id"));
                team.setTour_id(rs.getInt("tour_id"));
                team.setDoan_name(rs.getString("doan_name"));
                team.setDoan_ngaydi(rs.getDate("doan_ngaydi"));
                team.setDoan_ngayve(rs.getDate("doan_ngayve"));
                team.setDoan_chitietchuogtrinh(rs.getString("doan_chitietchuongtrinh"));
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
                        + "tour_id = \"" + team.getTour_id() + "\" "
                        + "doan_name = \"" + team.getDoan_name() + "\" "
                        + "doan_ngaydi = \"" + team.getDoan_ngaydi() + "\" "
                        + "doan_ngayve = \"" + team.getDoan_ngayve() + "\" "
                        + "doan_chitietchuongtrinh = \"" + team.getDoan_chitietchuogtrinh() + "\" "
                        + "WHERE `doan_id`= \"" + team.getDoan_id() + "\" ";
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
                String sql = "INSERT INTO tour_doan (doan_id, tour_id, doan_name, doan_ngaydi , doan_ngayve, doan_chitietchuongtrinh) VALUES ("
                        + "\"" + team.getDoan_id() + "\""
                        + ",\"" + team.getTour_id() + "\""
                        + ",\"" + team.getDoan_name() + "\""
                        + ",\"" + team.getDoan_ngaydi() + "\""
                        + ",\"" + team.getDoan_ngayve() + "\""
                        + ",'" + team.getDoan_chitietchuogtrinh() + "')";
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
                String sql = "DELETE FROM tour_doan WHERE "
                        + "doan_id = \"" + team.getDoan_id() + "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
