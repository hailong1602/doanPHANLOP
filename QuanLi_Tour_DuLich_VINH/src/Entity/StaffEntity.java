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
public class StaffEntity {
        private int nv_id;
        private String nv_ten;
        private String nv_sdt;
        private Date nv_ngaysinh;
        private String nv_email;
        private String nv_cmnd;

    public StaffEntity() {
    }

    public StaffEntity(int nv_id, String nv_ten, String nv_sdt, Date nv_ngaysinh, String nv_email, String nv_cmnd) {
        this.nv_id = nv_id;
        this.nv_ten = nv_ten;
        this.nv_sdt = nv_sdt;
        this.nv_ngaysinh = nv_ngaysinh;
        this.nv_email = nv_email;
        this.nv_cmnd = nv_cmnd;
    }

    public int getNv_id() {
        return nv_id;
    }

    public void setNv_id(int nv_id) {
        this.nv_id = nv_id;
    }

    public String getNv_ten() {
        return nv_ten;
    }

    public void setNv_ten(String nv_ten) {
        this.nv_ten = nv_ten;
    }

    public String getNv_sdt() {
        return nv_sdt;
    }

    public void setNv_sdt(String nv_sdt) {
        this.nv_sdt = nv_sdt;
    }

    public Date getNv_ngaysinh() {
        return nv_ngaysinh;
    }

    public void setNv_ngaysinh(Date nv_ngaysinh) {
        this.nv_ngaysinh = nv_ngaysinh;
    }

    public String getNv_email() {
        return nv_email;
    }

    public void setNv_email(String nv_email) {
        this.nv_email = nv_email;
    }

    public String getNv_cmnd() {
        return nv_cmnd;
    }

    public void setNv_cmnd(String nv_cmnd) {
        this.nv_cmnd = nv_cmnd;
    }
        
    
}
