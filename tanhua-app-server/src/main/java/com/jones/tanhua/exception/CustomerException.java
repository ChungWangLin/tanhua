package com.jones.tanhua.exception;

/**
 * 用户端异常基类，后续有异常都继承这个类
 */
public class CustomerException extends RuntimeException{
    String code;

    public CustomerException(String message) {
        super(message);
    }

    public String getCode() {
        return code;
    }

    public String getMessage(){
        return super.getMessage();
    }
}
