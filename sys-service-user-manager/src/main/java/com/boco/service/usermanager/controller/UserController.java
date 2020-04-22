package com.boco.service.usermanager.controller;

import com.boco.framework.model.ucenter.ext.UserExt;
import com.boco.framework.model.user.User;
import com.boco.service.usermanager.service.UserService;
import com.boco.sys.service.api.usermanager.UserControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserControllerApi {
    @Autowired
    UserService userService;

    @GetMapping("/getUserByName")
    @Override
    public UserExt getUserByName(String userName) {
        return new UserExt();
    }
}
