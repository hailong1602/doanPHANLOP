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
public class tours {
    private int tour_id;
    private String tour_ten;
    private String tour_mota;
    private int loai_id;
    private int gia_id;

    public tours() {
    }

    public tours(int tour_id, String tour_ten, String tour_mota, int loai_id, int gia_id) {
        this.tour_id = tour_id;
        this.tour_ten = tour_ten;
        this.tour_mota = tour_mota;
        this.loai_id = loai_id;
        this.gia_id = gia_id;
    }

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public String getTour_ten() {
        return tour_ten;
    }

    public void setTour_ten(String tour_ten) {
        this.tour_ten = tour_ten;
    }

    public String getTour_mota() {
        return tour_mota;
    }

    public void setTour_mota(String tour_mota) {
        this.tour_mota = tour_mota;
    }

    public int getLoai_id() {
        return loai_id;
    }

    public void setLoai_id(int loai_id) {
        this.loai_id = loai_id;
    }

    public int getGia_id() {
        return gia_id;
    }

    public void setGia_id(int gia_id) {
        this.gia_id = gia_id;
    }
    
    
}
