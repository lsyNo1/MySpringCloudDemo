package com.lsy.springCloud.service;

import com.lsy.springCloud.entity.User;
import com.lsy.springCloud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getInfo(Integer id) {
        return userMapper.selectUser(id);
    }


}
