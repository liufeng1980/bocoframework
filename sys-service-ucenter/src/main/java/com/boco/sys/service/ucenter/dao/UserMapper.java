package com.boco.sys.service.ucenter.dao;

import com.boco.framework.model.ucenter.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //根据账号查询用户信息
    User findByUsername(String username);
}
