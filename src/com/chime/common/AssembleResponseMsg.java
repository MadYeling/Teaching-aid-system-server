package com.chime.common;


public class AssembleResponseMsg {
    /**
     * 成功返回内容
     *
     * @return com.wzz.model.ResponseBody
     * @Author AZhen
     * @Param [data]
     **/
    public <T> MyResponse success(T data) {
        MyResponse<T> resp = new MyResponse<T>();
        resp.setData(data);
        return resp;
    }

    /**
     * 失败/异常返回内容
     *
     * @return com.wzz.model.ResponseBody
     * @Author AZhen
     * @Param [status, errorCode, message]
     **/
    public <T> MyResponse failure(int status, String errorCode, String message) {
        MyResponse<T> resp = new MyResponse<T>();
        resp.setMessage(message);
        resp.setCode(status);
        return resp;
    }
}
