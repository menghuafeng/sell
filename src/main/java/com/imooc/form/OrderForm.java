package com.imooc.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by 孟华锋
 * 2017/8/9.
 */
@Data
public class OrderForm {

    /***
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /***
     * 买家手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /***
     * 买家地址
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /***
     * 买家微信openid
     */
    @NotEmpty(message = "买家openid必填")
    private String openid;

    /***
     * 买家订单信息
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;

}


