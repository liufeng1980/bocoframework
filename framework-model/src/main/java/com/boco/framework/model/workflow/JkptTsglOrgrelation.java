package com.boco.framework.model.workflow;

import lombok.Data;

import java.io.Serializable;

@Data
public class JkptTsglOrgrelation implements Serializable {
    /**
     * 分配权限机构
     */
    private String orgid;

    /**
     * 描述:ORGID可以选择权限的机构是ALLOTORGID
     */
    private String remark;

    /**
     * 被分配权限机构
     */
    private String allotorgid;

    /**
     * 机构类型
     */
    private String grouptype;

    /**
     * 排序,默认升序
     */
    private Integer orderext;

    /**
     * 已使用：是否流程转向机构，1-是，0-其他
     */
    private String remark11;

    private String remark2;

    /**
     * 投诉父类型
     */
    private String complaintparenttype;

    /**
     * 是否可以添加投诉 1=是 0=不是
     */
    private Integer canadd;

}