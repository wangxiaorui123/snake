package com.example.publiuc;

import com.alibaba.fastjson.JSON;

/**
 * @author:wangxiaorui
 * @create 2019年12月19日18:07:46
 */
public class RestResult {

    private boolean isSuccess;
    private int code;
    private String message;
    private Object data;

    public boolean isSuccess() {
        return isSuccess;
    }

    public RestResult setSuccess(boolean success) {
        this.isSuccess = success;
        return this;
    }

    public int getCode() {
        return code;
    }

    public RestResult setCode(ResultCode code) {
        this.code = code.code();
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RestResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public RestResult setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
