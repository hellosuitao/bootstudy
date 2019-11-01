package com.ruixun.bootstudy.service;

import com.ruixun.bootstudy.bean.User;
import com.ruixun.bootstudy.mapper.UserMapper;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User findById(User user){
        return userMapper.selectByPrimaryKey(user);
    }

    public void addUser(User user){
        userMapper.insert(user);
    }

    public List<User> update(){
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username","ls");
        return userMapper.selectByExample(example);
    }
}
