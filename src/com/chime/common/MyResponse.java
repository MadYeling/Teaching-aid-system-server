package com.chime.common;

import com.chime.bean.ResultStatus;
import com.google.gson.Gson;

public class MyResponse<T> {
    //返回错误码
    private Integer code;
    //返回信息
    private String message;
    //返回对象
    private T data;

    public MyResponse(){
        this.code = ResultStatus.SUCCESS.value();
        this.message = ResultStatus.SUCCESS.getReasonPhrase();
    }

    public MyResponse( ResultStatus resultStatus, T data){
        this.data = data;
        this.code = resultStatus.value ();
        this.message = resultStatus.getReasonPhrase ();

    }
    public MyResponse(ResultStatus resultStatus){
        this(resultStatus,null);
    }

    public void setResult(ResultStatus resultStatus){
        this.code = resultStatus.value();
        this.message = resultStatus.getReasonPhrase();
    }

    public Integer getCode ( ) {
        return code;
    }

    public void setCode ( Integer code ) {
        this.code = code;
    }

    public String getMessage ( ) {
        return message;
    }

    public void setMessage ( String message ) {
        this.message = message;
    }

    public T getData ( ) {
        return data;
    }

    public void setData ( T data ) {
        this.data = data;
    }

    public String toJson(){
        return new Gson().toJson(this);
    }
}
