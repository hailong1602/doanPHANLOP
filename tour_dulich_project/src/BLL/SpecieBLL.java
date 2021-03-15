/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.SpecieDAL;
import Entity.tour_loai;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class SpecieBLL {
    public  static  ArrayList<tour_loai> specie_list = new ArrayList();
    public  void ReadSpecieBLL() throws Exception
    {
        SpecieDAL data = new SpecieDAL();
        if(specie_list == null)
            specie_list = new ArrayList<>();
        specie_list = data.ReadSpecieDAL();
    }
    
    public static void AddSpecieDAL(tour_loai specie)
    {
        SpecieDAL data = new SpecieDAL();
        data.AddSpecieDAL(specie);//gọi hàm thêm bên DAO để thêm sách vào database
        specie_list.add(specie);//
    }
    public static void InformationUpdateSpecieDAL(tour_loai specie)
    {
        SpecieDAL data = new SpecieDAL();
        data.InformationUpdateSpecieDAL(specie);
        specie_list.add(specie);
    }
    public static void DeleteSpecieDAL(tour_loai specie)
    {
        SpecieDAL data = new SpecieDAL();
        data.DeleteSpecieDAL(specie);
        specie_list.add(specie);
    }
}
