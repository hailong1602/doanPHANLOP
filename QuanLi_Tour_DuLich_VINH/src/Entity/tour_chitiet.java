/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author nguye
 */
public class tour_chitiet {
    private int ct_id;
    private int tour_id;
    private int dd_id;
    private int ct_thutu;

    public tour_chitiet() {
    }

    public tour_chitiet(int ct_id, int tour_id, int dd_id, int ct_thutu) {
        this.ct_id = ct_id;
        this.tour_id = tour_id;
        this.dd_id = dd_id;
        this.ct_thutu = ct_thutu;
    }

    public int getCt_id() {
        return ct_id;
    }

    public void setCt_id(int ct_id) {
        this.ct_id = ct_id;
    }

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public int getDd_id() {
        return dd_id;
    }

    public void setDd_id(int dd_id) {
        this.dd_id = dd_id;
    }

    public int getCt_thutu() {
        return ct_thutu;
    }

    public void setCt_thutu(int ct_thutu) {
        this.ct_thutu = ct_thutu;
    }
    
    
}
