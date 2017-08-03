package com.imooc.Enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by 孟华锋
 * 2017/7/27.
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
