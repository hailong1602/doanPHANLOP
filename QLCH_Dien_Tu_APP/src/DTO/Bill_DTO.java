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
public class Bill_DTO {
    public int id_bill;
    public int id_customer;
    public int id_catago;
    public double price_bill;
    public String day_bill;
    public double total_discount_bill;

    public Bill_DTO() {
    }

    public Bill_DTO(int id_bill, int id_customer, int id_catago, double price_bill, String day_bill, double total_discount_bill) {
        this.id_bill = id_bill;
        this.id_customer = id_customer;
        this.id_catago = id_catago;
        this.price_bill = price_bill;
        this.day_bill = day_bill;
        this.total_discount_bill = total_discount_bill;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_catago() {
        return id_catago;
    }

    public void setId_catago(int id_catago) {
        this.id_catago = id_catago;
    }

    public double getPrice_bill() {
        return price_bill;
    }

    public void setPrice_bill(double price_bill) {
        this.price_bill = price_bill;
    }

    public String getDay_bill() {
        return day_bill;
    }

    public void setDay_bill(String day_bill) {
        this.day_bill = day_bill;
    }

    public double getTotal_discount_bill() {
        return total_discount_bill;
    }

    public void setTotal_discount_bill(double total_discount_bill) {
        this.total_discount_bill = total_discount_bill;
    }
    
    
}
