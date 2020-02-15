package com.example.DSBEJava.models;
import java.util.*;

public class ShoppingList{
    int Id;
    ArrayList<Item> items;

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}

