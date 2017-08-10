package com.imooc.Enums;

import lombok.Getter;

/**
 * Created by 孟华锋
 * 2017/8/7.
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1 ,"参数不正确"),

    PRODUCT_NO_EXIST(10 , "无此类商品"),

    PRODUCT_STOCK_ERROR(11 , "商品库存不正确"),

    ORDER_NOT_EXIST(12 , "订单不存在"),

    ORDERDETAIL_NOT_EXIST(13 , "订单详情不存在"),

    ORDER_STATUS_ERROR(14 , "订单状态不正确"),

    ORDER_UPDATE_FAIL(15 , "更新订单失败"),

    ORDER_DETAIL_EMPTY(16 , "订单详情为空"),

    ORDER_PAY_STATUS_ERROR(17 , "订单支付状态不正确"),

    CART_EMPTY(18 , "购物车不能为空"),

    ORDER_OWNER_ERROR(19 , "该订单不属于当前用户"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
