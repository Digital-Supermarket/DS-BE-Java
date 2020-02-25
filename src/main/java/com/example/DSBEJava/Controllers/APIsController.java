package com.example.DSBEJava.Controllers;

import java.util.*;
import com.example.DSBEJava.models.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class APIsController {
    List<User> users = new ArrayList<User>();


    @GetMapping("/hello/{name}")
public String sayHelloToName(@PathVariable("name") final String name) {
    return "Hello " + name + "this is a test";
}

    @GetMapping("/User")
public List<User> findAllUsers() {
    return users;
}

    @GetMapping("/User/{id}")
public User findUser(@PathVariable("id") final int id) {
    final User returnedUser = findUserById(id);
    return returnedUser;
}

    @PostMapping("/User")
public User createUser(@RequestBody User newUser) {
    this.users.add(newUser);
    return newUser;
}

    @DeleteMapping("/User")
public User deleteUser(@RequestBody User deletedUser) {
    this.users.remove(deletedUser);
    return deletedUser;
}


// helper methods
public User findUserById(final int id) {
    User returnedUser = null;

    for (final User u : this.users) {
        if(u.getId() == id){
            returnedUser = u;
        }
    }
    return returnedUser;
}





}

