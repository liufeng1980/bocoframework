package com.boco.framework.model.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
@ApiModel(value = "结果",description = "结果desc")
public class ResponseResult<T> implements Response {
    //操作是否成功
    @ApiModelProperty(value = "操作是否成功 value",notes = "操作是否成功 note")
    boolean success = SUCCESS;

    //操作代码
    @ApiModelProperty("操作代码")
    int code = SUCCESS_CODE;

    //提示信息
    @ApiModelProperty("提示信息")
    String message;

    /**
     * 成功后的结果
     */
    @ApiModelProperty("成功后的结果")
    T resultData;


    public ResponseResult(ResultCode resultCode){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public static ResponseResult SUCCESS(){
        return new ResponseResult(CommonCode.SUCCESS);
    }

    public static<T> ResponseResult SUCCESS(T data){
        ResponseResult responseResult = new ResponseResult(CommonCode.SUCCESS);
        responseResult.resultData = data;
        return responseResult;
    }
    public static ResponseResult FAIL(){
        return new ResponseResult(CommonCode.FAIL);
    }
}
