package com.example.DSBEJava.models;
import java.util.*;
public class Client{
    int clientId;
    String name;
    String phone;
    String email;
    String password;
    ArrayList<ShoppingList> shoppingLists;

    public Client(){
        this.clientId = 0;
        this.name = "";
        this.phone = "";
        this.email = "";
        this.password = "";
        this.shoppingLists = null;
    }
    public Client(int id , String name , String phone , String email , String password, ArrayList<ShoppingList> shoppingList){
        this.clientId = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.shoppingLists = shoppingList;
    }
    public Client(String name){
        this.clientId = 0;
        this.name = name;
        this.phone = "";
        this.email = "";
        this.password = "";
    }

    public int getId() {
        return this.clientId;
    }

    public void setId(int Id) {
        this.clientId = Id;
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


    public ArrayList<ShoppingList> getShoppingList(){
        return this.shoppingLists;
    }

    public void setShoppingList(ArrayList<ShoppingList>shoppingList){
        this.shoppingLists = shoppingList;
    }

}

