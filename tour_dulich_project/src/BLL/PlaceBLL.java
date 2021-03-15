/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.PlaceDAL;
import Entity.tour_diadiem;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class PlaceBLL {
    public  static  ArrayList<tour_diadiem> place_list = new ArrayList();
    public  void ReadPlaceBLL() throws Exception
    {
        PlaceDAL data = new PlaceDAL();
        if(place_list == null)
            place_list = new ArrayList<>();
        place_list = data.ReadPlaceDAL();
    }
    
    public static void AddPlaceDAL(tour_diadiem place)
    {
        PlaceDAL data = new PlaceDAL();
        data.AddPlaceDAL(place);//gọi hàm thêm bên DAO để thêm sách vào database
        place_list.add(place);//
    }
    public static void InformationUpdatePlaceDAL(tour_diadiem place)
    {
        PlaceDAL data = new PlaceDAL();
        data.InformationUpdatePlaceDAL(place);
        place_list.add(place);
    }
    public static void DeletePlaceDAL(tour_diadiem place)
    {
        PlaceDAL data = new PlaceDAL();
        data.DeletePlaceDAL(place);
        place_list.add(place);
    }
}
