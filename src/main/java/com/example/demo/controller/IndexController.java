package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IndexController {
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public String index(){
        //1.tk基本常规查询
        List<User> users = userService.selectAll();
        System.out.println(users.size());
        /*User user =new User();
        user.setId(2);
        user.setAge(2);
        user.setName("shang");
        userService.insertSelective(user);*/
        //2.传统mybatis查询
        User user = userService.aJoinB();
        System.out.println(user);
        //3.tk条件查询
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("id",1).andLike("age","%2%");
        List<User> users1 = userService.selectByExample(example);

        Example example2 = Example.builder(User.class)
                .select("id","age")
                .where(Sqls.custom().andEqualTo("id", 1)
                        .andLike("age", "%2%"))
                .orderByDesc("id","age")
                .build();
        List<User> demos = userService.selectByExample(example);

        return "";
    }
}
