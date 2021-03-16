/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ToursDAL;
import java.util.ArrayList;
import Entity.tours;
import Entity.tours_loai;
import java.util.Vector;

/**
 *
 * @author nguye
 */
public class ToursBLL {
    public  static  ArrayList<tours> tour_list = new ArrayList();
    public  static  ArrayList<tours_loai> tour_specie_list = new ArrayList();
    public  void ReadToursBLL() throws Exception
    {
        ToursDAL data = new ToursDAL();
        if(tour_list == null)
            tour_list = new ArrayList<>();
        tour_list = data.ReadTourDAL();
    }
    
    public  void GetTour_SpecieBLL() throws Exception
    {
        ToursDAL data = new ToursDAL();
        if(tour_specie_list == null)
            tour_specie_list = new ArrayList();
        tour_specie_list = data.GetTourAndSpecieDAL();
    }
    
    public static void AddToursDAL(tours tour)
    {
        ToursDAL data = new ToursDAL();
        data.AddTourDAL(tour);//gọi hàm thêm bên DAO để thêm sách vào database
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
    
    public static ArrayList LookForToursBLL(tours tour, String lookFor)
    {
        ArrayList<tours> kq = new ArrayList<tours>();
        ToursDAL data=new ToursDAL();
        data.LookForAllDAL(lookFor);
        kq.add(tour);
        return kq;
    }
}
