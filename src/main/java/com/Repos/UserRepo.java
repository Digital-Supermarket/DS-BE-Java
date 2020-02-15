package com.Repos;
import org.springframework.data.repository.CrudRepository;
import com.example.DSBEJava.models.User;

public interface UserRepo extends CrudRepository<User,Integer>{

}