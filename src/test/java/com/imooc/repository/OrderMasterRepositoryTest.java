package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created by 孟华锋
 * 2017/8/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    private final String BuyerOpenid="123123";
    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void save(){
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("孟华锋");
        orderMaster.setBuyerAddress("新东方");
        orderMaster.setBuyerOpenid(BuyerOpenid);
        orderMaster.setBuyerPhone("13141332434");
        orderMaster.setOrderAmount(new BigDecimal(2.3));

        OrderMaster result=repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest request=new PageRequest(0,1);
        Page<OrderMaster> page=repository.findByBuyerOpenid(BuyerOpenid,request);
        Assert.assertNotEquals(0,page.getTotalElements());
    }

}