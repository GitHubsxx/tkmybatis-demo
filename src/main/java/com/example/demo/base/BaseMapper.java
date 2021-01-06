package com.example.demo.base;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Description: 自定义通用Mapper基类
 * Author: sxx
 * Date: 2021/1/5
 */
@Repository
@Primary
public interface
BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
