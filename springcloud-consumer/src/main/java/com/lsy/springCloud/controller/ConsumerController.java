package com.lsy.springCloud.controller;

import com.lsy.springCloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    private static final String HOST_PREFIX = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getConsumer/{id}")
    public User getConsumer(@PathVariable Integer id) {
        return restTemplate.getForObject(HOST_PREFIX + "/getInfo/" + id, User.class);
    }


}
