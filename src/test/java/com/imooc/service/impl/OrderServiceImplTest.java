package com.imooc.service.impl;

import com.imooc.Enums.OrderStatusEnum;
import com.imooc.Enums.PayStatusEnum;
import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 孟华锋
 * 2017/8/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    private final String BUYER_OPENID="110110100";

    private final String ORDER_ID="1502162674928746483";

    @Autowired
    private OrderServiceImpl orderService;

    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = new OrderDTO();
        //买家信息
        orderDTO.setBuyerName("孟华锋");
        orderDTO.setBuyerAddress("新东方");
        orderDTO.setBuyerPhone("1310000000");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("123456");
        orderDetail.setProductQuantity(2);

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductId("123458");
        orderDetail2.setProductQuantity(20);

        orderDetailList.add(orderDetail);
        orderDetailList.add(orderDetail2);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info(" [ 创建订单 ] result = {}",result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() throws Exception {

        OrderDTO result = orderService.findOne(ORDER_ID);
        log.info(" [ 查询单个订单 ] result = {}",result);
    }

    @Test
    public void findList() throws Exception {
        PageRequest request = new PageRequest(0,1);
        Page<OrderDTO> orderDTOPage = orderService.findList(BUYER_OPENID,request);
        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO result = orderService.findOne(ORDER_ID);
        OrderDTO orderDTO = orderService.cancel(result);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),orderDTO.getOrderStatus());
    }

    @Test
    public void finish() throws Exception {
        OrderDTO result = orderService.findOne(ORDER_ID);
        OrderDTO orderDTO = orderService.finish(result);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(),orderDTO.getOrderStatus());
    }

    @Test
    public void paid() throws Exception {
        OrderDTO result = orderService.findOne(ORDER_ID);
        OrderDTO orderDTO = orderService.paid(result);
        Assert.assertEquals(orderDTO.getPayStatus(), PayStatusEnum.SUCCESS.getCode());
    }

}