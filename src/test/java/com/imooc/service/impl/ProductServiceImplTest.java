package com.imooc.service.impl;

import com.imooc.Enums.ProductStatusEnum;
import com.imooc.dataobject.ProductInfo;
import com.imooc.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request=new PageRequest(0,2);
        Page<ProductInfo> productInfoPage=productService.findAll(request);
//        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo product=new ProductInfo();
        product.setProductId("123457");
        product.setProductName("皮皮虾");
        product.setProductPrice(new BigDecimal(3.2));
        product.setProductDescription("很好吃的虾");
        product.setProductStatus(ProductStatusEnum.DOWN.getCode());
        product.setProductStock(100);
        product.setCategoryType(2);
        product.setProductIcon("http://xxx.jsp");

        ProductInfo result=productService.save(product);
        Assert.assertNotNull(result);
    }

}