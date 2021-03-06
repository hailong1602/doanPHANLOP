package DAL;


import DAL.MySQLConnect;
import Entity.tour_nhanvien;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class StaffDAL  {
    
    public ArrayList<tour_nhanvien> ReadStaffDAL() throws Exception{
        ArrayList<tour_nhanvien> staff_list = new ArrayList();
        MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
        String query = "SELECT * From tour_nhanvien";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tour_nhanvien staff = new tour_nhanvien();
                staff.setNv_id(rs.getInt("nv_id"));
                staff.setNv_ten(rs.getString("nv_ten"));
                staff.setNv_sdt(rs.getString("nv_sdt"));
                staff.setNv_ngaysinh(rs.getDate("nv_ngaysinh"));
                staff.setNv_email(rs.getString("nv_email"));
                staff.setNv_cmnd(rs.getString("nv_cmnd"));
                staff_list.add(staff);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return staff_list;
    }
    
    public void InformationUpdateStaffDAL(tour_nhanvien staff) {
        try{           
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "UPDATE tour_nhanvien "
                        + "nv_ten = \"" + staff.getNv_ten() + "\" "
                        + "nv_sdt = \"" + staff.getNv_sdt() + "\" "
                        + "nv_ngaysinh = \"" + staff.getNv_ngaysinh() + "\" "
                        + "nv_email = \"" + staff.getNv_email() + "\" "
                        + "nv_cmnd = \"" + staff.getNv_cmnd() + "\" "
                        + "WHERE `nv_id`= \"" + staff.getNv_id() + "\" ";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null,"Error");
                e.printStackTrace();
            }
    }

    public void AddStaffDAL(tour_nhanvien staff) {
        try {
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tour_nhanvien (nv_id, nv_ten, nv_sdt, nv_ngaysinh , nv_email, nv_cmnd) VALUES ("
                        + "\"" + staff.getNv_id() + "\""
                        + ",\"" + staff.getNv_ten() + "\""
                        + ",\"" + staff.getNv_sdt() + "\""
                        + ",\"" + staff.getNv_ngaysinh() + "\""
                        + ",\"" + staff.getNv_email() + "\""
                        + ",'" + staff.getNv_cmnd() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void DeleteStaffDAL(tour_nhanvien staff) {
        try {
                MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
                Statement st = connect.getStatement();
                String sql = "DELETE FROM toul_nhanvien WHERE "
                        + "nv_id = \"" + staff.getNv_id() + "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
