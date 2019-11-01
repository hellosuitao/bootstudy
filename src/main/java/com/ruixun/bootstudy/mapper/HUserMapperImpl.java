package com.ruixun.bootstudy.mapper;

import com.ruixun.bootstudy.bean.HUser;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository(value = "hUserMapper")
public class HUserMapperImpl implements HUserMapper {
    /*是JPA中用于增删改查的接口，它的作用相当于一座桥梁，连接内存中的java对象和数据库的数据存储。*/
    /*1、entityManager.persist(Object entity);　　新增数据；
    * 2、entityManager.find(Class<T> entityClass, Object primaryKey);　　根据主键查找数据；
    * entityManager.remove(Object entity);　　删除数据；*/
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public HUser findById(Integer id) {
        return entityManager.find(HUser.class,id);
    }

    @Override
    public void addHUser(HUser hUser) {
        entityManager.persist(hUser);
    }
}
