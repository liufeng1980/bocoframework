package com.boco.sys.service.workflow.controller;

import com.boco.framework.model.response.ResponseResult;
import com.boco.framework.web.BaseController;
import com.boco.sys.service.api.workflow.WorkFlowControllerApi;


import org.activiti.api.task.runtime.TaskRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flow")
public class WorkFlowController extends BaseController implements WorkFlowControllerApi {

    @Autowired
    TaskRuntime taskRuntime;

    @PreAuthorize("hasAuthority('startWorkFlow')")
    @RequestMapping("/startworkflow")
    @Override
    public ResponseResult startWorkFlow() {
        //SysOauth2Util sysOauth2Util = new SysOauth2Util();
        //SysOauth2Util.UserJwt userJwt = sysOauth2Util.getUserJwtFromHeader(request);
        return ResponseResult.SUCCESS();
    }

    @RequestMapping("/start")
    public String start(){
        return "aaa";
    }
}
