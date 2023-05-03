package com.lsy.springCloud.controller;


import com.lsy.springCloud.entity.User;
import com.lsy.springCloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getInfo/{id}")
    public User getInfo(@PathVariable Integer id) {
        return userService.getInfo(id);
    }

}
