/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author nguye
 */
public class Catago_DTO {
    public int id_catago;
    public int id_product;
    public String name_combo_catago;
    public double price_combo_catago;
    public String status;

    public Catago_DTO() {
    }

    public Catago_DTO(int id_catago, int id_product, String name_combo_catago, double price_combo_catago, String status) {
        this.id_catago = id_catago;
        this.id_product = id_product;
        this.name_combo_catago = name_combo_catago;
        this.price_combo_catago = price_combo_catago;
        this.status = status;
    }

    public int getId_catago() {
        return id_catago;
    }

    public void setId_catago(int id_catago) {
        this.id_catago = id_catago;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName_combo_catago() {
        return name_combo_catago;
    }

    public void setName_combo_catago(String name_combo_catago) {
        this.name_combo_catago = name_combo_catago;
    }

    public double getPrice_combo_catago() {
        return price_combo_catago;
    }

    public void setPrice_combo_catago(double price_combo_catago) {
        this.price_combo_catago = price_combo_catago;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
