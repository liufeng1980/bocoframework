package com.boco.framework.model.workflow.response;

import com.boco.framework.model.common.JkptCommParamdic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel("添加表单相关参数")
public class AddFormResponse implements Serializable {
    @ApiModelProperty("投诉类型")
    private List<JkptCommParamdic> complaintLevels;

    //TODO 获取投诉管理查询排序


    @ApiModelProperty("投诉类型")
    private List<JkptCommParamdic> complaintTypes;

    @ApiModelProperty("是否能添加")
    private Boolean canAdd;
}
