package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 孟华锋
 * 2017/7/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void save(){
        ProductInfo product=new ProductInfo();
        product.setProductId("123456");
        product.setProductName("皮蛋粥");
        product.setProductPrice(new BigDecimal(3.2));
        product.setProductDescription("很好喝的粥");
        product.setProductStatus(0);
        product.setProductStock(100);
        product.setCategoryType(2);
        product.setProductIcon("http://xxx.jsp");

        ProductInfo result=repository.save(product);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList=repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }

}