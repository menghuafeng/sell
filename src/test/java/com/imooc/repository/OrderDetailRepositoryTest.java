package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
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
public class OrderDetailRepositoryTest {

    private final String detailId="1234567887";
    @Autowired
    private OrderDetailRepository repository;
    @Test
    public void save(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setDetailId(detailId);
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("11111432345");
        orderDetail.setOrderId("2214534111111111");
        orderDetail.setProductName("皮皮虾1");
        orderDetail.setProductPrice(new BigDecimal(7.6));
        orderDetail.setProductQuantity(23);

        OrderDetail result=repository.save(orderDetail);
        Assert.assertNotNull(result);

    }
    @Test
    public void findByDetailId() throws Exception {
        PageRequest request=new PageRequest(0,3);
        Page<OrderDetail> result=repository.findByDetailId(detailId,request);
        System.out.println(result.getTotalElements());
    }

}