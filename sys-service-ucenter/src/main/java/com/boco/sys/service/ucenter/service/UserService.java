package com.boco.sys.service.ucenter.service;

import com.boco.framework.model.ucenter.Menu;
import com.boco.framework.model.ucenter.User;
import com.boco.framework.model.ucenter.ext.UserExt;
import com.boco.sys.service.ucenter.dao.MenuMapper;
import com.boco.sys.service.ucenter.dao.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private UserMapper userMapper;

    //根据账号查询xcUser信息
    public User findXcUserByUsername(String username){
        return userMapper.findByUsername(username);
    }

    //根据账号查询用户信息
    public UserExt getUserExt(String username){
        //根据账号查询xcUser信息
        User xcUser = this.findXcUserByUsername(username);
        if(xcUser == null){
            return null;
        }
        //用户id
        String userId = xcUser.getId();
        //查询用户所有权限
        List<Menu> xcMenus = menuMapper.selectPermissionByUserId(userId);

        UserExt xcUserExt = new UserExt();
        BeanUtils.copyProperties(xcUser,xcUserExt);
        //xcUserExt.setCompanyId(companyId);
        //设置权限
        xcUserExt.setPermissions(xcMenus);
        return xcUserExt;
    }
}
