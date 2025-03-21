package com.college.shre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.college.shre.entity.User;
import com.college.shre.service.UserServiceImpl;
import java.util.List;

@RestController
@RequestMapping("/user") // Base path for all user-related endpoints
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody User user) {
        return userServiceImpl.updateUser(user);
    }

    @DeleteMapping("/delete/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return userServiceImpl.deleteUser(userId);
    }

    @GetMapping("/details")
    public List<User> getUsers() {
        return userServiceImpl.getUser();
    }
}
