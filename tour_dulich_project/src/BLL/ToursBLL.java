/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ToursDAL;
import java.util.ArrayList;
import Entity.tours;

/**
 *
 * @author nguye
 */
public class ToursBLL {
    public  static  ArrayList<tours> tour_list = new ArrayList();
    public  void ReadStaffBLL() throws Exception
    {
        ToursDAL data = new ToursDAL();
        if(tour_list == null)
            tour_list = new ArrayList<>();
        tour_list = data.ReadStaffDAL();
    }
    
    public static void AddToursDAL(tours tour)
    {
        ToursDAL data = new ToursDAL();
        data.AddTourfDAL(tour);//gọi hàm thêm bên DAO để thêm sách vào database
        tour_list.add(tour);//
    }
    public static void InformationUpdateToursDAL(tours tour)
    {
        ToursDAL data=new ToursDAL();
        data.InformationUpdateTourDAL(tour);
        tour_list.add(tour);
    }
    public static void DeleteToursDAL(tours tour)
    {
        ToursDAL data=new ToursDAL();
        data.DeleteTourDAL(tour);
        tour_list.add(tour);
    }
}
