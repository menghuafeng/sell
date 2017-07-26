package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

/**
 * Created by 孟华锋
 * 2017/7/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory product=repository.findOne( 1);
        System.out.println(product.toString());
    }

    @Test
    //测试的事务,完成后全部回滚
    @Transactional
    public void saveOnt(){
        ProductCategory product=new ProductCategory("男生最爱",5);
        ProductCategory result=repository.save(product);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null,result);
    }
}