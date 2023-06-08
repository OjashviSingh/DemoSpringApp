package com.example.demo.controller;

import com.example.demo.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping(value = {"", "/", "/hello"})
    public String getApi1(){
        return "Hello SpringBoot";
    }
    @RequestMapping(value = {"", "/", "/hello"})
    public String getApi2(){
        return "Hello Spring Boot";
    }
    @PostMapping("/add-person")
    public String addPerson(@RequestBody Person person){
        return "Hi Spring Boot";
    }
    @GetMapping(value = {"/api2/{name}"})
    public String getApi3(@PathVariable(name = "name") String name){
        if(name.equals("ojashvi")){
            return "Hi Ojashvi";
        }  else {
            return "nothing";
        }
    }
}
