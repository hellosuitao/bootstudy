package com.ruixun.bootstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping("/redis")
    public String returnRedis(){
        redisTemplate.opsForValue().set("name","20");
        redisTemplate.expire("name",20, TimeUnit.SECONDS);
        redisTemplate.opsForValue().increment("name",-1);
        return (String) redisTemplate.opsForValue().get("name");
    }

    @RequestMapping("/hello")
    public void testEx(){
            int i = 1/0;
    }


}
