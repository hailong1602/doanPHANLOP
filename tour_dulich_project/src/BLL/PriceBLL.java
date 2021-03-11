/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.PriceDAL;
import Entity.tour_gia;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class PriceBLL {
    public  static  ArrayList<tour_gia> price_list = new ArrayList();
    public  void ReadSPriceDAL() throws Exception
    {
        PriceDAL price = new PriceDAL();
        if(price_list == null)
            price_list = new ArrayList<>();
        price_list = price.ReadPriceDAL();
    }
    
    public static void AddPriceDAL(tour_gia price)
    {
        PriceDAL data = new PriceDAL();
        data.AddPriceDAL(price);//gọi hàm thêm bên DAO để thêm sách vào database
        price_list.add(price);//
    }
    public static void InformationUpdatePriceDAL(tour_gia price)
    {
        PriceDAL data=new PriceDAL();
        data.InformationUpdatePriceDAL(price);
        price_list.add(price);
    }
    public static void DeletePriceDAL(tour_gia price)
    {
        PriceDAL data=new PriceDAL();
        data.DeletePriceDAL(price);
        price_list.add(price);
    }
}
