package com.ruixun.bootstudy.test;

import com.ruixun.bootstudy.bean.HUser;
import com.ruixun.bootstudy.bean.User;
import com.ruixun.bootstudy.service.HUserService;
import com.ruixun.bootstudy.service.UserService;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.ruixun.bootstudy.mapper")
public class Test {
//    private static final Logger log = LoggerFactory.getLogger(Test.class);
    @Resource
    private UserService userService;
//    @Resource(name = "hUserService")
//    private HUserService hUserService;
    @org.junit.Test
    public void test1(){
        User user = new User();
        user.setId(1);
        User user1 = userService.findById(user);
        System.out.println(user1);
    }

    @org.junit.Test
    public void test2(){
        List<User> update = userService.update();
        for (User user : update) {
            System.out.println(user);
        }
    }
}
