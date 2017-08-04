package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单的数据传输对象
 * Created by 孟华锋
 * 2017/8/4.
 */
@Data
public class OrderDTO {
    /**订单ID. */
    private String orderId;
    /**买家姓名. */
    private String buyerName;
    /**买家手机号. */
    private String buyerPhone;
    /**买家地址. */
    private String buyerAddress;
    /**买家微信的openId. */
    private String buyerOpenid;
    /**订单总金额. */
    private BigDecimal orderAmount;
    /**订单状态,默认为0 新下单状态. */
    private Integer orderStatus;
    /**支付状态,默认为0 未支付状态. */
    private Integer payStatus;
    /**创建时间. */
    private Date createTime;
    /**更新时间. */
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}

