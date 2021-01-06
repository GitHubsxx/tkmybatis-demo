package com.example.demo.entity;

import lombok.*;
import lombok.experimental.Accessors;
import javax.persistence.*;
import java.io.Serializable;

/**
* @description: 实体类
* @author: Jess MybatisGenerator
* @date: 2021-01-05 10:42:02
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "USER_0")
public class User implements Serializable{
        /**
        * 
        */
        @Id
        @Column(name = "id")
        private Integer id;

        /**
        * 
        */
        @Column(name = "name")
        private String name;

        /**
        * 
        */
        @Column(name = "age")
        private Integer age;

}