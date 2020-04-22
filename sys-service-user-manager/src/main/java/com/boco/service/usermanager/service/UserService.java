package com.boco.service.usermanager.service;

import com.boco.framework.model.user.User;

public interface UserService {
    User getUserByName(String userName);
}
