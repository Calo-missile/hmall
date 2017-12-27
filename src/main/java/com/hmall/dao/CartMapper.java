package com.hmall.dao;

import com.hmall.pojo.Cart;

public interface CartMapper{
    int deleteByPrimaryKey(Integer id);//根据主键去删除

    int insert(Cart record);//插入购物车   将对象完全插入表中

    int insertSelective(Cart record);//根据选举进行插入

    Cart selectByPrimaryKey(Integer id);//根据主键去查询

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);


}