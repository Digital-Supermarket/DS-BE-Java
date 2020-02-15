package com.example.DSBEJava.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIsController {


    @GetMapping("/hello/{name}")
public String sayHelloToName
       (@PathVariable("name") String nameVariable) {
   return "Hello " + nameVariable;
}



}

