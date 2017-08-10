package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家订单查询
 * Created by 孟华锋
 * 2017/8/10.
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid , String orderId);

    OrderDTO cancelOrder(String opendid , String orderId);
}

