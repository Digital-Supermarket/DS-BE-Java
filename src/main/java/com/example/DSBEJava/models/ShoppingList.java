package com.example.DSBEJava.models;
import java.util.*;

public class ShoppingList{
    int id;
    ArrayList<Item> items;

    public ShoppingList(){
        this.id = 000;
        this.items = null;
    }

    public ShoppingList(int id, ArrayList<Item> items){
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}

