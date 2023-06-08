package com.example.demo.controller;

import com.example.demo.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = {"", "/", "/hello"})
    public String getApi1() {
        return "Hello Spring Boot";
    }

    @GetMapping(value = {"", "/", "/hello"})
    public String getApi2() {
        return "Hello SpringBoot";
    }

    @PostMapping("/add-person")
    public String addPerson(@RequestBody Person person) {
        return person.getfName() + " " + person.getlName();
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody Person person2) {

        return "User updated successfully";
    }

    @GetMapping(value = {"/api2/{name}"})
    public String getApi3(@RequestParam String fName, String lName) {
        return "Hello " + fName + " " + lName;
    }

    @GetMapping(value = {"/api2/{name}"})
    public String getApi4(@PathVariable String fName, String lName) {
        return "Hello " + fName + " " + lName;
    }
}
