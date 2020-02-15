package com.Repos;
import org.springframework.data.repository.CrudRepository;
import com.example.DSBEJava.models.Item;

public interface ItemRepo extends CrudRepository<Item,Integer>{

}