/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author nguye
 */
public class tour_gia {
    private int gia_id;
    private Double gia_sotien;
    private int tour_id;
    private Date gia_tungay;
    private Date gia_denngay;

    public tour_gia() {
    }

    public tour_gia(int gia_id, Double gia_sotien, int tour_id, Date gia_tungay, Date gia_denngay) {
        this.gia_id = gia_id;
        this.gia_sotien = gia_sotien;
        this.tour_id = tour_id;
        this.gia_tungay = gia_tungay;
        this.gia_denngay = gia_denngay;
    }

    public int getGia_id() {
        return gia_id;
    }

    public void setGia_id(int gia_id) {
        this.gia_id = gia_id;
    }

    public Double getGia_sotien() {
        return gia_sotien;
    }

    public void setGia_sotien(Double gia_sotien) {
        this.gia_sotien = gia_sotien;
    }

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public Date getGia_tungay() {
        return gia_tungay;
    }

    public void setGia_tungay(Date gia_tungay) {
        this.gia_tungay = gia_tungay;
    }

    public Date getGia_denngay() {
        return gia_denngay;
    }

    public void setGia_denngay(Date gia_denngay) {
        this.gia_denngay = gia_denngay;
    }
    
    
}
