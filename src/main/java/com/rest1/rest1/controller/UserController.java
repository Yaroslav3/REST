package com.rest1.rest1.controller;

import com.rest1.rest1.model.User;
import com.rest1.rest1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/api/users/one/{id}")
    public User getOneUser(@PathVariable(value = "id") Long id) {
        return userService.getOne(id);
    }

    @RequestMapping("/api/users/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping("/api/users/create")
    public User create(User user) {
        User user1 = new User();
        user1.setName("Yarik");
        user1.setAge(35);
        user1.setSurname("jdciubvbv");
        return userService.create(user1);
    }

    @RequestMapping("/api/users/delete")
    public void delete(Long id) {
        userService.delete(7L);
    }

    @RequestMapping("/api/users/update")
    public User update(User user) {
        User user1 = new User();
        user1.setName("Yarikkkk");
        user1.setAge(36);
        user1.setSurname("jdciubvbvfvfvf");
        user1.setId(5L);
        return userService.update(user1);
    }

    @RequestMapping("/api/users/deleteUser")
    public void delete() {
        User user1 = new User();
        user1.setAge(0);
        userService.delete(user1);
    }
}
