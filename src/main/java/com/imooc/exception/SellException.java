package com.imooc.exception;

import com.imooc.Enums.ResultEnum;

/**
 * Created by 孟华锋
 * 2017/8/7.
 */
public class SellException extends RuntimeException {

    private Integer code;

    private String message;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code , String message){
        this.code = code;
        this.message = message;
    }
}
