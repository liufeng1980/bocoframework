package com.boco.framework.model.ucenter;

import lombok.Data;

import java.util.Date;

@Data
public class Menu {
    private String id;
    private String code;
    private String pCode;
    private String pId;
    private String menuName;
    private String url;
    private String isMenu;
    private Integer level;
    private Integer sort;
    private String status;
    private String icon;
    private Date createTime;
    private Date updateTime;
}
