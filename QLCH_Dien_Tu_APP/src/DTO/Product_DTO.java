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
public class Product_DTO {
    private int id_product;
    private String name_product;
    private Double price_product;
    private String description_product;
    private int Amount_product;
    private String img_path;

    public Product_DTO() {
    }

    public Product_DTO(int id_product, String name_product, Double price_product, String description_product, int Amount_product, String img_path) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.price_product = price_product;
        this.description_product = description_product;
        this.Amount_product = Amount_product;
        this.img_path = img_path;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public Double getPrice_product() {
        return price_product;
    }

    public void setPrice_product(Double price_product) {
        this.price_product = price_product;
    }

    public String getDescription_product() {
        return description_product;
    }

    public void setDescription_product(String description_product) {
        this.description_product = description_product;
    }

    public int getAmount_product() {
        return Amount_product;
    }

    public void setAmount_product(int Amount_product) {
        this.Amount_product = Amount_product;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    
    
}
