package com.example.DSBEJava.models;
public class Product{
    int id;
    String name;
    double price;
    double weight;
    String code;
    String size;


    public Product(){
        this.id = 000;
        this.name = "";
        this.price = 0.00;
        this.weight = 0.0;
        this.code = "";
        this.size = "";
    }

    public Product(int id, String name , double price, double weight, String code, String size){
        this.id = id;
        this.name =name;
        this.price = price;
        this.weight = weight;
        this.code = code;
        this.size = size;
    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(final String size) {
        this.size = size;
    }

}

