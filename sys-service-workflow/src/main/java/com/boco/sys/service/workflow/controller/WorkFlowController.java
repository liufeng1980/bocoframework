package com.boco.sys.service.workflow.controller;

import com.boco.framework.model.response.ResponseResult;
import com.boco.framework.web.BaseController;
import com.boco.sys.service.api.workflow.WorkFlowControllerApi;


import com.boco.sys.service.workflow.service.CallFlowService;
import org.activiti.api.task.runtime.TaskRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flow")
public class WorkFlowController extends BaseController implements WorkFlowControllerApi {

    @Autowired
    CallFlowService callFlowService;
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


    @RequestMapping(value = "/deploy", produces = "text/html; charset=utf-8")
    public String deploy(){
        //callFlowService.deploy();
        return "流程部署";
    }



    /**
     * 呼叫中心提交订单
     * @return
     */
    @RequestMapping(value = "/submitBill", produces = "text/html; charset=utf-8")
    public String submitBill(){
        callFlowService.submitBill();
        return "呼叫中心提交订单";
    }



    /**
     * 2.运营科审核
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/YunYingKeAudit", produces = "text/html; charset=utf-8")
    public String YunYingKeAudit(){
        callFlowService.YunYingKeAudit();
        return "运营科审核";
    }

    /**
     * 3.高路公司审核
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/gaoLuAudit", produces = "text/html; charset=utf-8")
    public String gaoLuAudit(){
        callFlowService.gaoLuAudit();
        return "高路公司审核";
    }

    /**
     * 4.分公司审核
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/fenZhongXinAudit",produces = "text/html; charset=utf-8")
    public String fenZhongXinAudit(){
        callFlowService.fenZhongXinAudit();
        return "高路公司审核";
    }

    /**
     * 5.高路公司的反馈
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/gaoluFeedbackAudit", produces = "text/html; charset=utf-8")
    public String gaoluFeedbackAudit(){
        callFlowService.gaoluFeedbackAudit();
        return "高路公司审核";
    }
}
