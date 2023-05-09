package com.lsy.springCloud.controller;

import com.lsy.springCloud.UserServiceSpi;
import com.lsy.springCloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerFeignController {

    @Autowired
    private UserServiceSpi userServiceSpi;

    @GetMapping("/getFeignConsumer/{id}")
    public User getConsumer(@PathVariable(value = "id") Integer id) {
        return userServiceSpi.getInfo(id);
    }


}
