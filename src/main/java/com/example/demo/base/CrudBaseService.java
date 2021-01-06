package com.example.demo.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Description: 基础增删改查service实现
 * Author: sxx
 * Date: 2021/1/5
 */
@Service
@SuppressWarnings("all")
@Transactional(rollbackFor = Exception.class)
public abstract class CrudBaseService<T, ID extends Serializable> implements BaseService<T, ID> {
    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public int insertSelective(T entity) {
        return baseMapper.insertSelective(entity);
    }

    @Override
    public int insertList(List<T> entityList) {
        return baseMapper.insertList(entityList);
    }

    @Override
    public int deleteByPrimaryKey(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByExample(Object o) {
        return baseMapper.deleteByExample(o);
    }

    @Override
    public int updateByPrimaryKeySelective(T entity) {
        return baseMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int updateByExampleSelective(T entity, Object o) {
        return baseMapper.updateByExampleSelective(entity, o);
    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return (T) baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public T selectOneByExample(Object o) {
        return baseMapper.selectOneByExample(o);
    }

    @Override
    public List<T> selectByExample(Object o) {
        return baseMapper.selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return baseMapper.selectCountByExample(o);
    }

    @Override
    public List<T> selectAll() {
        return baseMapper.selectAll();
    }
}
