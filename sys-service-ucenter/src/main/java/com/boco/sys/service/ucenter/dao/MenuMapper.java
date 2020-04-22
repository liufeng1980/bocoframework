package com.boco.sys.service.ucenter.dao;

import com.boco.framework.model.ucenter.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    //根据用户id查询用户的权限
    public List<Menu> selectPermissionByUserId(String userid);
}
