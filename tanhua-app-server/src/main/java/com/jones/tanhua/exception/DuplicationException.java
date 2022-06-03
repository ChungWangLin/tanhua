package com.jones.tanhua.exception;

/**
 * 关键字重复异常
 */
public class DuplicationException extends CustomerException{
    public DuplicationException(String message){
        super(message);
        this.code="11111";
    }
}
