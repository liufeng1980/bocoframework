package com.boco.sys.service.api.workflow;

import com.boco.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "工作流模块", description = "工作流模块相关接口")
public interface WorkFlowControllerApi {
    @ApiOperation("启动流程")
    ResponseResult startWorkFlow();
}
