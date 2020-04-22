package com.boco.service.usermanager.dao;


import com.boco.framework.model.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserByName(String userName);
}
