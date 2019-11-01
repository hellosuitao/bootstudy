package com.ruixun.bootstudy.mapper;

import com.ruixun.bootstudy.bean.HUser;

public interface HUserMapper {
    HUser findById(Integer id);
    void addHUser(HUser hUser);
}
