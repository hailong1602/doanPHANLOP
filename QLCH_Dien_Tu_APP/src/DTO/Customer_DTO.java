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
public class Customer_DTO {
    private int id_customer;
    private String name_customer;
    private String sex_customer;
    private String adress_customer;
    private String phone_number_customer;

    public Customer_DTO() {
    }

    public Customer_DTO(int id_customer, String name_customer, String sex_customer, String adress_customer, String phone_number_customer) {
        this.id_customer = id_customer;
        this.name_customer = name_customer;
        this.sex_customer = sex_customer;
        this.adress_customer = adress_customer;
        this.phone_number_customer = phone_number_customer;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getSex_customer() {
        return sex_customer;
    }

    public void setSex_customer(String sex_customer) {
        this.sex_customer = sex_customer;
    }

    public String getAdress_customer() {
        return adress_customer;
    }

    public void setAdress_customer(String adress_customer) {
        this.adress_customer = adress_customer;
    }

    public String getPhone_number_customer() {
        return phone_number_customer;
    }

    public void setPhone_number_customer(String phone_number_customer) {
        this.phone_number_customer = phone_number_customer;
    }
    
    
}
