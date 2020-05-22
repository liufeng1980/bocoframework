package com.boco.sys.service.workflow.controller;

import com.boco.framework.model.response.ResponseResult;
import com.boco.framework.model.workflow.JkptTsglOrgrelation;
import com.boco.framework.model.workflow.request.Complaint;
import com.boco.framework.model.workflow.request.ComplaintPage;
import com.boco.framework.model.workflow.response.AddFormResponse;
import com.boco.framework.web.BaseController;
import com.boco.sys.service.api.workflow.ComplaintControllerApi;
import com.boco.utils.SysOauth2Util;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComplaintController extends BaseController implements ComplaintControllerApi {
    @PostMapping("/add_complaint")
    @Override
    public ResponseResult addComplaint(@RequestBody Complaint complaint) {
        return ResponseResult.SUCCESS();
    }

    @GetMapping("/init_add_complaint_page")
    @Override
    public ResponseResult<AddFormResponse> initAddComplaintPage() {
        SysOauth2Util sysOauth2Util = new SysOauth2Util();
        SysOauth2Util.UserJwt userJwt = sysOauth2Util.getUserJwtFromHeader(request);

        return null;
    }

    @PostMapping("/initDetailPage")
    @Override
    public ResponseResult initDetailPage(ComplaintPage complaintPage) {
        return null;
    }

    @PostMapping("/getPage")
    @Override
    public ResponseResult<List<Complaint>> getPage(@RequestBody ComplaintPage complaintListRequest) {
        return null;
    }

    @PostMapping("/getComplaintByPlateNumOrTel")
    @Override
    public ResponseResult<List<Complaint>> getComplaintByPlateNumOrTel(@RequestBody ComplaintPage page) {
        return null;
    }

    @GetMapping("/getReceiveOrgidList/{complaintParentType}")
    @Override
    public ResponseResult<List<JkptTsglOrgrelation>> getReceiveOrgidList(@PathVariable("complaintParentType") String complaintParentType) {
        return null;
    }


}
