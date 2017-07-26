package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/7/25.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//使用注解,不需要每次都引入Logger
public class LoggerTest {

    //这个地方添加上当前的类名.class的原因是指定日志打印出的当前信息是属于哪个类的
    //private final Logger logger=LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name="孟老师";
        String password="123";
        log.debug("额,这样也行呀~~");
        log.info("我去,这就行了??");
        log.error("马丹,error.......");
        log.warn("这个手刹不太灵");
        log.info("name : {},password : {}",name,password);
    }
}
