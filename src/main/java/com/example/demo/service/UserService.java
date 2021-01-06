package com.example.demo.service;


import com.example.demo.base.BaseService;
import com.example.demo.entity.User;

/**
* @description: Service业务接口
* @date: 2021-01-05 10:42:02
*/
public interface UserService extends BaseService<User, Integer> {
    public User aJoinB();
}