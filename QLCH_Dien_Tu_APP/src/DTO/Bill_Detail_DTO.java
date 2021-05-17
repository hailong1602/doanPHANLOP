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
public class Bill_Detail_DTO {
    public int id_bill;
    public int id_product;
    public int amount_bill;
    public double price_bill;
    public double total_discount_bill;

    public Bill_Detail_DTO() {
    }

    public Bill_Detail_DTO(int id_bill, int id_product, int amount_bill, double price_bill, double total_discount_bill) {
        this.id_bill = id_bill;
        this.id_product = id_product;
        this.amount_bill = amount_bill;
        this.price_bill = price_bill;
        this.total_discount_bill = total_discount_bill;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getAmount_bill() {
        return amount_bill;
    }

    public void setAmount_bill(int amount_bill) {
        this.amount_bill = amount_bill;
    }

    public double getPrice_bill() {
        return price_bill;
    }

    public void setPrice_bill(double price_bill) {
        this.price_bill = price_bill;
    }

    public double getTotal_discount_bill() {
        return total_discount_bill;
    }

    public void setTotal_discount_bill(double total_discount_bill) {
        this.total_discount_bill = total_discount_bill;
    }
    
    
}
