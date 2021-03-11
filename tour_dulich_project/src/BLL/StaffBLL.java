/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.StaffDAL;
import Entity.tour_nhanvien;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class StaffBLL {
    public  static  ArrayList<tour_nhanvien> staff_list = new ArrayList();
    public  void ReadStaffBLL() throws Exception
    {
        StaffDAL data = new StaffDAL();
        if(staff_list == null)
            staff_list = new ArrayList<>();
        staff_list = data.ReadStaffDAL();
    }
    
    public static void AddStaffDAL(tour_nhanvien staff)
    {
        StaffDAL data = new StaffDAL();
        data.AddStaffDAL(staff);//gọi hàm thêm bên DAO để thêm sách vào database
        staff_list.add(staff);//
    }
    public static void InformationUpdateStaffDAL(tour_nhanvien staff)
    {
        StaffDAL data=new StaffDAL();
        data.InformationUpdateStaffDAL(staff);
        staff_list.add(staff);
    }
    public static void DeleteStaffDAL(tour_nhanvien staff)
    {
        StaffDAL data=new StaffDAL();
        data.DeleteStaffDAL(staff);
        staff_list.add(staff);
    }
}
