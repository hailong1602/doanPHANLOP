/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TeamDAL;
import Entity.tour_doan;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class TeamBLL {
    public  static  ArrayList<tour_doan> team_list = new ArrayList();
    public  void ReadStaffBLL() throws Exception
    {
        TeamDAL data = new TeamDAL();
        if(team_list == null)
            team_list = new ArrayList<>();
        team_list = data.ReadTeamDAL();
    }
    
    public static void AddTeamDAL(tour_doan team)
    {
        TeamDAL data = new TeamDAL();
        data.AddTeamDAL(team);//gọi hàm thêm bên DAO để thêm sách vào database
        team_list.add(team);//
    }
    public static void InformationUpdateTeamDAL(tour_doan team)
    {
        TeamDAL data=new TeamDAL();
        data.InformationUpdateDTeamAL(team);
        team_list.add(team);
    }
    public static void DeleteTeamDAL(tour_doan team)
    {
        TeamDAL data=new TeamDAL();
        data.DeleteTeamDAL(team);
        team_list.add(team);
    }

}
