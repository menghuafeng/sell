package com.imooc.Enums;

import lombok.Getter;

/**
 * Created by 孟华锋
 * 2017/8/4.
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完成"),
    CANCEL(2,"已取消"),
    ;

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
