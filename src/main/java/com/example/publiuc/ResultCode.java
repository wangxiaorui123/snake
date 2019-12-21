package com.example.publiuc;

/**
 * @author:wangxiaorui
 * @create 2019年12月19日18:10:03
 */
public enum  ResultCode {

    SUCCESS(200),//成功
    FAIL(400),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    INTERNAL_SERVER_ERROR(500);//服务器内部错误

    private final int code;

    public int getCode() {
        return code;
    }

    public int code(){
        return code;
    }

    ResultCode(int code){
        this.code = code;
    }
}
