/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CustomerDAL;
import Entity.tour_khachhang;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class CustomerBLL {
    public  static  ArrayList<tour_khachhang> customer_list = new ArrayList();
    public  void ReadCustomerBLL() throws Exception
    {
        CustomerDAL data = new CustomerDAL();
        if(customer_list == null)
            customer_list = new ArrayList<>();
        customer_list = data.ReadCustomerDAL();
    }
    
    public static void AddCustomerDAL(tour_khachhang customer)
    {
        CustomerDAL data = new CustomerDAL();
        data.AddCustomerDAL(customer);//gọi hàm thêm bên DAO để thêm sách vào database
        customer_list.add(customer);//
    }
    public static void InformationUpdateCustomerDAL(tour_khachhang customer)
    {
        CustomerDAL data = new CustomerDAL();
        data.InformationUpdateCustomerDAL(customer);
        customer_list.add(customer);
    }
    public static void DeleteCustomerDAL(tour_khachhang customer)
    {
        CustomerDAL data = new CustomerDAL();
        data.DeleteCustomerDAL(customer);
        customer_list.add(customer);
    }
    
    public static ArrayList LookForCustomerBLL(tour_khachhang customer, String lookFor)
    {
        ArrayList<tour_khachhang> kq = new ArrayList<tour_khachhang>();
        CustomerDAL data=new CustomerDAL();
        data.LookForAllCustomerDAL(lookFor);
        kq.add(customer);
        return kq;
    }
}
