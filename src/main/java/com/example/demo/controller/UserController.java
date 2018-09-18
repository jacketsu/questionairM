package com.example.demo.controller;

import java.util.List;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.User;

/**
 * Created by xjw on 9/16/18.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> userList() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping(value = "/users")
    public User userAdd(@RequestParam("uname") String uname,
                         @RequestParam("password") String password,
                         @RequestParam("email") String email) {
        User user = new User();
        user.setUname(uname);
        user.setPassword(password);
        user.setEmail(email);

        return userRepository.save(user);
    }

    @GetMapping(value = "/users/{id}")
    public User usersFindOne(@PathVariable("id") Integer id) {
        return userRepository.findById(id).get();
    }

    @PostMapping(value = "/users/{id}")
    public User usersUpdate(@PathVariable("id") Integer id,
                            @RequestParam("uname") String uname,
                            @RequestParam("password") String password,
                            @RequestParam("email") String email) {
        User user = userRepository.findById(id).get();
        user.setUname(uname);
        user.setPassword(password);

        return userRepository.save(user);
    }

    @DeleteMapping(value = "/users/{id}")
    public void usersDelete(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

}
