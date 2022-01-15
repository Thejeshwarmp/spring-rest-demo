package com.example.controller;

import com.example.domain.entity.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.String.format;

@RestController
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String welcome() {
        return "<h1><centre> Welcome To User Rest Service API Demo</centre></h1>" +
                "<a href='http://localhost:8080/swagger-ui.html?baseUrl=/api-docs'> API Doc</a>";
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.findUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.findAll();
    }

    @PutMapping("/saveUsers")
    public String save(@RequestBody User user) {
        userService.saveUserInfo(user);
        return "User Updated Success";
    }

    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable Integer id) {
        userService.deleteById(id);
        return "Deleted User"+ id;
    }


    @DeleteMapping("/users")
    public String deleteAll() {
        userService.deleteAll();
        return "Deleted All Users";
    }

}
