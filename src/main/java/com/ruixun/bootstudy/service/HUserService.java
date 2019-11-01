package com.ruixun.bootstudy.service;

import com.ruixun.bootstudy.bean.HUser;
import com.ruixun.bootstudy.mapper.HUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Transactional
@Service(value = "hUserService")
public class HUserService {
    @Resource(name = "hUserMapper")
    private HUserMapper hUserMapper;

    public HUser findById(Integer id){
        return hUserMapper.findById(id);
    }

    public void addHUser(HUser hUser){
        hUserMapper.addHUser(hUser);
    }
}
