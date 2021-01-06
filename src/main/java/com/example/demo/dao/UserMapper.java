package com.example.demo.dao;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.User;

/**
* @description: 数据访问接口
* @date: 2021-01-05 10:42:02
*/
public interface UserMapper extends BaseMapper<User> {
    public User aJoinB();
}