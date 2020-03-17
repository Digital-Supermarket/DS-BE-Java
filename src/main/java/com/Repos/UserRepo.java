package com.Repos;
import org.springframework.data.repository.CrudRepository;
import com.example.DSBEJava.models.Client;

public interface UserRepo extends CrudRepository<Client,Integer>{

}