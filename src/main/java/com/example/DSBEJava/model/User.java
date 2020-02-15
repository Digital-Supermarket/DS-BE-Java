package com.example.DSBEJava.model;
public class User{
    int Id;
    String name;
    String phone;
    String email;
    String password;

    public User(){
        this.Id = 0;
        this.name = "";
        this.phone = "";
        this.email = "";
        this.password = "";
    }
    public User(int id , String name , String phone , String email , String password){
        this.Id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
    public User(String name){
        this.Id = 0;
        this.name = name;
        this.phone = "";
        this.email = "";
        this.password = "";
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

