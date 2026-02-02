package com.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //this annotation creates a rest controller for rest api
//this means that when the application is run, it will start a TomcatWebServer on port 8080 to be interacted with
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping //this annotation makes the method a rest endpoint
    public String helloWorld() {
        return "Hello World Spring Boot";
    }


}
