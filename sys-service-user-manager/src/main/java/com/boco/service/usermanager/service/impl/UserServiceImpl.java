package com.boco.service.usermanager.service.impl;

import com.boco.framework.model.user.User;
import com.boco.service.usermanager.dao.UserMapper;
import com.boco.service.usermanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }
}
