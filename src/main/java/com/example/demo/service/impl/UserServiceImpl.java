package com.example.demo.service.impl;

import com.example.demo.base.CrudBaseService;
import com.example.demo.entity.User;
import com.example.demo.dao.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


/**
* @description: Service业务接口实现
* @date: 2021-01-05 10:42:02
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends CrudBaseService<User, Integer> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User aJoinB() {
        return userMapper.aJoinB();
    }
}