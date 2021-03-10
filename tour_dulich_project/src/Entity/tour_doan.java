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
public class tour_doan {
    private int doan_id;
    private int tour_id;
    private String doan_name;
    private Date doan_ngaydi;
    private Date doan_ngayve;
    private String doan_chitietchuogtrinh;

    public tour_doan() {
    }

    public tour_doan(int doan_id, int tour_id, String doan_name, Date doan_ngaydi, Date doan_ngayve, String doan_chitietchuogtrinh) {
        this.doan_id = doan_id;
        this.tour_id = tour_id;
        this.doan_name = doan_name;
        this.doan_ngaydi = doan_ngaydi;
        this.doan_ngayve = doan_ngayve;
        this.doan_chitietchuogtrinh = doan_chitietchuogtrinh;
    }

    public int getDoan_id() {
        return doan_id;
    }

    public void setDoan_id(int doan_id) {
        this.doan_id = doan_id;
    }

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public String getDoan_name() {
        return doan_name;
    }

    public void setDoan_name(String doan_name) {
        this.doan_name = doan_name;
    }

    public Date getDoan_ngaydi() {
        return doan_ngaydi;
    }

    public void setDoan_ngaydi(Date doan_ngaydi) {
        this.doan_ngaydi = doan_ngaydi;
    }

    public Date getDoan_ngayve() {
        return doan_ngayve;
    }

    public void setDoan_ngayve(Date doan_ngayve) {
        this.doan_ngayve = doan_ngayve;
    }

    public String getDoan_chitietchuogtrinh() {
        return doan_chitietchuogtrinh;
    }

    public void setDoan_chitietchuogtrinh(String doan_chitietchuogtrinh) {
        this.doan_chitietchuogtrinh = doan_chitietchuogtrinh;
    }
    
    
}
