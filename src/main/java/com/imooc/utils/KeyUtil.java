package com.imooc.utils;

import java.util.Random;

/**
 * Created by 孟华锋
 * 2017/8/7.
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式 : 日期 + 随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random=new Random();
        Integer number=random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
