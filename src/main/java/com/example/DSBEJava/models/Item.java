package com.example.DSBEJava.models;
public class Item{
    int id;
    Product product;
    String expiryDate;


    public Item(){
        this.id = 00000;
        this.product = null;
        this.expiryDate = "";
    }

    public Item(int id, Product product, String expiryDate){
        this.id = id;
        this.product = product;
        this.expiryDate = expiryDate;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }



}

