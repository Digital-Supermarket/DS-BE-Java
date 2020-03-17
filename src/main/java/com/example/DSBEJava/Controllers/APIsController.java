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
    

//////////////////Client APIs

    List<Client> clients = new ArrayList<Client>();


    @GetMapping("/hello/{name}")
public String sayHelloToName(@PathVariable("name") final String name) {
    return "Hello " + name + "this is a test";
}

    @GetMapping("/Client")
public List<Client> findAllClients() {
    return clients;
}

    @GetMapping("/Client/{id}")
public Client findClient(@PathVariable("id") final int id) {
    final Client returnedUser = findClientById(id);
    return returnedUser;
}

    @PostMapping("/Client")
public Client createClient(@RequestBody Client newClient) {
    this.clients.add(newClient);
    return newClient;
}

    @DeleteMapping("/Client")
public Client deleteClient(@RequestBody Client deletedClient) {
    this.clients.remove(deletedClient);
    return deletedClient;
}


// Helper methods for Client
public Client findClientById(final int id) {
    Client returnedClient = null;

    for (final Client u : this.clients) {
        if(u.getId() == id){
            returnedClient = u;
        }
    }
    return returnedClient;
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

