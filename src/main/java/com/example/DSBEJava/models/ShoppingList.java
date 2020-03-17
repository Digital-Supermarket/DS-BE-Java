package com.example.DSBEJava.models;
import java.util.*;

public class ShoppingList{
    int shoppingListId;
    ArrayList<Item> items;

    public ShoppingList(){
        this.shoppingListId = 000;
        this.items = null;
    }

    public ShoppingList(int id, ArrayList<Item> items){
        this.shoppingListId = id;
        this.items = items;
    }

    public int getId() {
        return this.shoppingListId;
    }

    public void setId(int id) {
        this.shoppingListId = id;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}

