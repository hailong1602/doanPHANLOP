/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CostDAL;
import Entity.tour_chiphi;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class CostBLL {
    public  static  ArrayList<tour_chiphi> cost_list = new ArrayList();
    public  void ReadCostBLL() throws Exception
    {
        CostDAL data = new CostDAL();
        if(cost_list == null)
            cost_list = new ArrayList<>();
        cost_list = data.ReadCostDAL();
    }
    
    public static void AddCostDAL(tour_chiphi cost)
    {
        CostDAL data = new CostDAL();
        data.AddCostDAL(cost);//gọi hàm thêm bên DAO để thêm sách vào database
        cost_list.add(cost);//
    }
    public static void InformationUpdateCostDAL(tour_chiphi cost)
    {
        CostDAL data = new CostDAL();
        data.InformationUpdateCostDAL(cost);
        cost_list.add(cost);
    }
    public static void DeleteCostDAL(tour_chiphi cost)
    {
        CostDAL data = new CostDAL();
        data.DeleteCostDAL(cost);
        cost_list.add(cost);
    }
}
