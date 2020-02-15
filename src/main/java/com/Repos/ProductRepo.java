package com.Repos;
import org.springframework.data.repository.CrudRepository;
import com.example.DSBEJava.models.Product;

public interface ProductRepo extends CrudRepository<Product,Integer>{

}