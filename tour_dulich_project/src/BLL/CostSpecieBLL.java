/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CostSpecieDAL;
import Entity.tour_loaichiphi;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class CostSpecieBLL {
    public  static  ArrayList<tour_loaichiphi> cost_specie_list = new ArrayList();
    public  void ReadCostBLL() throws Exception
    {
        CostSpecieDAL data = new CostSpecieDAL();
        if(cost_specie_list == null)
            cost_specie_list = new ArrayList<>();
        cost_specie_list = data.Readcost_specie_specie_listDAL();
    }
    
    public static void AddCostSpecieDAL(tour_loaichiphi cost_specie)
    {
        CostSpecieDAL data = new CostSpecieDAL();
        data.Addcost_specie_specie_listDAL(cost_specie);//gọi hàm thêm bên DAO để thêm sách vào database
        cost_specie_list.add(cost_specie);//
    }
    public static void InformationUpdateCostSpecieDAL(tour_loaichiphi cost_specie)
    {
        CostSpecieDAL data = new CostSpecieDAL();
        data.InformationUpdatecost_specie_specie_listDAL(cost_specie);
        cost_specie_list.add(cost_specie);
    }
    public static void DeleteCostSpecieDAL(tour_loaichiphi cost_specie)
    {
        CostSpecieDAL data = new CostSpecieDAL();
        data.Deletecost_specie_specie_listDAL(cost_specie);
        cost_specie_list.add(cost_specie);
    }
}
