package com.example.DSBEJava.Controllers;

import java.util.*;
import com.example.DSBEJava.models.*;
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
    

//////////////////User APIs

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


// Helper methods for User
public User findUserById(final int id) {
    User returnedUser = null;

    for (final User u : this.users) {
        if(u.getId() == id){
            returnedUser = u;
        }
    }
    return returnedUser;
}

////////////////////Item APIs

List<Item> items = new ArrayList<Item>();


@GetMapping("/Item")
public List<Item> findAllItems() {
return items;
}
@GetMapping("/Item/{id}")
public Item findItem(@PathVariable("id") final int id) {
    final Item returnedItem = findItemById(id);
    return returnedItem;
}

    @PostMapping("/Item")
public Item createItem(@RequestBody Item newItem) {
    this.items.add(newItem);
    return newItem;
}

    @DeleteMapping("/Item")
public Item deleteUser(@RequestBody Item deletedItem) {
    this.items.remove(deletedItem);
    return deletedItem;
}


// Helper methods for Item
public Item findItemById(final int id) {
    Item returnedItem = null;

    for (final Item i : this.items) {
        if(i.getId() == id){
            returnedItem = i;
        }
    }
    return returnedItem;
}



////////////////////Product APIs

List<Product> products = new ArrayList<Product>();


@GetMapping("/Product")
public List<Item> findAllProducts() {
return items;
}
@GetMapping("/Product/{id}")
public Product findProduct(@PathVariable("id") final int id) {
    final Product returnedProduct = findProductById(id);
    return returnedProduct;
}

    @PostMapping("/Product")
public Product createProduct(@RequestBody Product newProduct) {
    this.products.add(newProduct);
    return newProduct;
}

    @DeleteMapping("/Product")
public Product deleteProduct(@RequestBody Product deletedProduct) {
    this.products.remove(deletedProduct);
    return deletedProduct;
}


// Helper methods for Product
public Product findProductById(final int id) {
    Product returnedProduct = null;

    for (final Product p : this.products) {
        if(p.getId() == id){
            returnedProduct = p;
        }
    }
    return returnedProduct;
}

///////////////////ShoppingList APIs

List<ShoppingList> shoppingLists = new ArrayList<ShoppingList>();


@GetMapping("/ShoppingList")
public List<ShoppingList> findAllShoppingLists() {
return shoppingLists;
}
@GetMapping("/ShoppingList/{id}")
public ShoppingList findShoppingList(@PathVariable("id") final int id) {
    final ShoppingList returnedShoppingList = findShoppingListById(id);
    return returnedShoppingList;
}

    @PostMapping("/ShoppingList")
public ShoppingList createShoppingList(@RequestBody ShoppingList newShoppingList) {
    this.shoppingLists.add(newShoppingList);
    return newShoppingList;
}

    @DeleteMapping("/ShoppingList")
public ShoppingList deleteShoppingList(@RequestBody ShoppingList deletedShoppingList) {
    this.shoppingLists.remove(deletedShoppingList);
    return deletedShoppingList;
}


// Helper methods for ShoppingList
public ShoppingList findShoppingListById(final int id) {
    ShoppingList returnedShoppingList = null;

    for (final ShoppingList s : this.shoppingLists) {
        if(s.getId() == id){
            returnedShoppingList = s;
        }
    }
    return returnedShoppingList;
}

}

