package com.imooc.VO;

import lombok.Data;

/**
 * HTTP请求返回的最外层对象
 * Created by 孟华锋
 * 2017/8/1.
 */
@Data
public class ResultVO<T> {

    /** 错误码,0成功. */
    private Integer code;
    /** 提示信息. */
    private String msg;
    /** 具体内容. */
    private T data;
}
