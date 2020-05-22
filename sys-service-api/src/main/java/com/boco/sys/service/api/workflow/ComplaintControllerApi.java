package com.boco.sys.service.api.workflow;

import com.boco.framework.model.response.ResponseResult;
import com.boco.framework.model.workflow.JkptTsglOrgrelation;
import com.boco.framework.model.workflow.request.Complaint;
import com.boco.framework.model.workflow.request.ComplaintPage;
import com.boco.framework.model.workflow.response.AddFormResponse;
import io.swagger.annotations.*;

import java.util.List;

@Api(value = "投诉模块", description = "投诉模块相关接口")
public interface ComplaintControllerApi {
    @ApiOperation("添加投诉单")
    ResponseResult addComplaint(Complaint complaint);

    @ApiOperation("初始化界面参数")
    ResponseResult<AddFormResponse> initAddComplaintPage();

    @ApiOperation("初始化详情界面参数")
    ResponseResult initDetailPage(ComplaintPage complaintPage);

    @ApiOperation("获取分页信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "complaintListRequest",value = "参数",required = true,paramType = "path",dataType = "String")
            }
    )
    ResponseResult<List<Complaint>> getPage(ComplaintPage complaintListRequest);

    @ApiOperation("根据车牌号获取呼叫流转列表")
    ResponseResult<List<Complaint>> getComplaintByPlateNumOrTel(@ApiParam(value = "参数",required = true) ComplaintPage page);

    @ApiOperation("获取可以选择的机构列表")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "complaintParentType",value = "投诉父类型",required = true,paramType = "path",dataType = "String")
            }
    )
    ResponseResult<List<JkptTsglOrgrelation>> getReceiveOrgidList(String complaintParentType);


}
