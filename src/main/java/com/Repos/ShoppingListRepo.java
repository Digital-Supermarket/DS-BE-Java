package com.Repos;
import org.springframework.data.repository.CrudRepository;
import com.example.DSBEJava.models.ShoppingList;

public interface ShoppingListRepo extends CrudRepository<ShoppingList,Integer>{

}