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
public class tour_nguoidi {
    private int nguoidi_id;
    private int doan_id;
    private String nguoidi_dsnhanvien;
    private String nguoidi_dskhach;

    public tour_nguoidi() {
    }

    public tour_nguoidi(int nguoidi_id, int doan_id, String nguoidi_dsnhanvien, String nguoidi_dskhach) {
        this.nguoidi_id = nguoidi_id;
        this.doan_id = doan_id;
        this.nguoidi_dsnhanvien = nguoidi_dsnhanvien;
        this.nguoidi_dskhach = nguoidi_dskhach;
    }

    
    
    public int getNguoidi_id() {
        return nguoidi_id;
    }

    public void setNguoidi_id(int nguoidi_id) {
        this.nguoidi_id = nguoidi_id;
    }

    public int getDoan_id() {
        return doan_id;
    }

    public void setDoan_id(int doan_id) {
        this.doan_id = doan_id;
    }

    public String getNguoidi_dsnhanvien() {
        return nguoidi_dsnhanvien;
    }

    public void setNguoidi_dsnhanvien(String nguoidi_dsnhanvien) {
        this.nguoidi_dsnhanvien = nguoidi_dsnhanvien;
    }

    public String getNguoidi_dskhach() {
        return nguoidi_dskhach;
    }

    public void setNguoidi_dskhach(String nguoidi_dskhach) {
        this.nguoidi_dskhach = nguoidi_dskhach;
    }
    
    
}
