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
public class tour_khachhang {
    private int kh_id;
    private String kh_ten;
    private String kh_sdt;
    private Date kh_ngaysinh;
    private String kh_email;
    private String kh_nhiemvu;

    public tour_khachhang() {
    }

    public tour_khachhang(int kh_id, String kh_ten, String kh_sdt, Date kh_ngaysinh, String kh_email, String kh_nhiemvu) {
        this.kh_id = kh_id;
        this.kh_ten = kh_ten;
        this.kh_sdt = kh_sdt;
        this.kh_ngaysinh = kh_ngaysinh;
        this.kh_email = kh_email;
        this.kh_nhiemvu = kh_nhiemvu;
    }

    public int getKh_id() {
        return kh_id;
    }

    public void setKh_id(int kh_id) {
        this.kh_id = kh_id;
    }

    public String getKh_ten() {
        return kh_ten;
    }

    public void setKh_ten(String kh_ten) {
        this.kh_ten = kh_ten;
    }

    public String getKh_sdt() {
        return kh_sdt;
    }

    public void setKh_sdt(String kh_sdt) {
        this.kh_sdt = kh_sdt;
    }

    public Date getKh_ngaysinh() {
        return kh_ngaysinh;
    }

    public void setKh_ngaysinh(Date kh_ngaysinh) {
        this.kh_ngaysinh = kh_ngaysinh;
    }

    public String getKh_email() {
        return kh_email;
    }

    public void setKh_email(String kh_email) {
        this.kh_email = kh_email;
    }

    public String getKh_nhiemvu() {
        return kh_nhiemvu;
    }

    public void setKh_nhiemvu(String kh_nhiemvu) {
        this.kh_nhiemvu = kh_nhiemvu;
    }
    
    
}
