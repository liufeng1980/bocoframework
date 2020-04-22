package com.boco.framework.model.ucenter.ext;

import com.boco.framework.model.ucenter.Menu;
import com.boco.framework.model.ucenter.User;
import lombok.Data;

import java.util.List;
@Data
public class UserExt extends User {
    //权限信息
    private List<Menu> permissions;

    //企业信息
    private String companyId;
}
