package com.example.springboot;

import com.example.springboot.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Demo {

    @GetMapping(value = "/home")
    public String hello(){
        return "Hello BridgeLabz";
    }
    @GetMapping(value = "/query")
    public String hello(@RequestParam(value = "name") String name){
        return "Hello " + name ;
    }
    @GetMapping(value = "/param/{name}")
    public String helloParam(@PathVariable String name){
        return "Hello " + name;
    }
    @PostMapping("/post")
    public String hello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }
    @PutMapping("/put/{firstName}")
    public String hello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + "!";
    }
}
