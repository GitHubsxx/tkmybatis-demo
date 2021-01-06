package com.example.demo.base;

import java.io.Serializable;
import java.util.List;

/**
 * Description: 基础增删改查service
 * Author: sxx
 * Date: 2021/1/5
 */
public interface BaseService<T, ID extends Serializable> {
    /**
     * 插入非空实体
     *
     * @param entity
     * @return
     */
    int insertSelective(T entity);

    /**
     * 批量插入非空实体
     *
     * @param entityList
     * @return
     */
    int insertList(List<T> entityList);

    /**
     * 通过主键删除实体
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(ID id);

    /**
     * 通过条件删除实体
     *
     * @param o
     * @return
     */
    int deleteByExample(Object o);

    /**
     * 更新非空字段实体
     *
     * @param entity
     * @return
     */
    int updateByPrimaryKeySelective(T entity);

    /**
     * 通过条件更新非空字段实体
     *
     * @param entity
     * @param o
     * @return
     */
    int updateByExampleSelective(T entity, Object o);

    /**
     * 通过主键查询单个实体
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(ID id);

    /**
     * 查询单个实体
     *
     * @param o
     * @return
     */
    T selectOneByExample(Object o);

    /**
     * 查询多个实体
     *
     * @param o
     * @return
     */
    List<T> selectByExample(Object o);

    /**
     * 通过条件查询数量
     *
     * @param o
     * @return
     */
    int selectCountByExample(Object o);

    /**
     * 查询所有实体
     *
     * @return
     */
    List<T> selectAll();
}
