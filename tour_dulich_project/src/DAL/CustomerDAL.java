/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.tour_khachhang;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class CustomerDAL {
    MySQLConnect connect = new MySQLConnect("localhost", "root", "", "tour_dulich");
    public ArrayList<tour_khachhang> ReadCustomerDAL() throws Exception{
        ArrayList<tour_khachhang> customer_list = new ArrayList();
        String query = "SELECT * From tour_khachhang";
        Statement st = connect.getStatement();
        ResultSet rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                tour_khachhang customer = new tour_khachhang();
                customer.setKh_id(rs.getInt("kh_id"));
                customer.setKh_ten(rs.getString("kh_ten"));
                customer.setKh_sdt(rs.getString("kh_sdt"));
                customer.setKh_ngaysinh(rs.getDate("kh_ngaysinh"));
                customer.setKh_email(rs.getString("kh_email"));
                customer.setKh_nhiemvu(rs.getString("kh_nhiemvu"));
                customer_list.add(customer);     
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi đọc danh sách");
        }
        rs.close();
        return customer_list;
    }
    
    public void InformationUpdateCustomerDAL(tour_khachhang customer) {
        try{           
                
                Statement st = connect.getStatement();
                String sql = "UPDATE tour_khachhang "
                        + "kh_ten = \"" + customer.getKh_ten()+ "\" "
                        + "kh_sdt = \"" + customer.getKh_sdt()+ "\" "
                        + "kh_ngaysinh = \"" + customer.getKh_ngaysinh()+ "\" "
                        + "kh_email = \"" + customer.getKh_email()+ "\" "
                        + "kh_nhiemvu = \"" + customer.getKh_nhiemvu()+ "\" "
                        + "WHERE `kh_id`= \"" + customer.getKh_id()+ "\" ";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null,"Error");
                e.printStackTrace();
            }
    }

    public void AddCustomerDAL(tour_khachhang customer) {
        try {
                Statement st = connect.getStatement();
                String sql = "INSERT INTO tour_khachhang (kh_id, kh_ten, kh_sdt, kh_ngaysinh , kh_email, kh_nhiemvu) VALUES ("
                        + "\"" + customer.getKh_id() + "\""
                        + ",\"" + customer.getKh_ten() + "\""
                        + ",\"" + customer.getKh_sdt() + "\""
                        + ",\"" + customer.getKh_ngaysinh() + "\""
                        + ",\"" + customer.getKh_email() + "\""
                        + ",'" + customer.getKh_nhiemvu() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }

    public void DeleteCustomerDAL(tour_khachhang customer) {
        try {
                Statement st = connect.getStatement();
                String sql = "DELETE FROM tour_khachhang WHERE "
                        + "kh_id = \"" + customer.getKh_id() + "\"";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
    
    public void LookForAllCustomerDAL(String lookFor) {
        try {
                Statement st = connect.getStatement();
                String sql = "SELECT * FROM tour_khachhang WHERE"
                        + "kh_id LIKE '%" + lookFor + "%'"
                        + "OR kh_ten LIKE '%" + lookFor + "%'"
                        + "OR kh_sdt LIKE '%" + lookFor + "%'"
                        + "OR kh_email LIKE '%" + lookFor + "%'"
                        + "OR kh_nhiemvu LIKE '%" + lookFor + "%'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
            e.printStackTrace();
        }
    }
}
