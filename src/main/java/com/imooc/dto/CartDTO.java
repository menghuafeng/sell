package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * Created by 孟华锋
 * 2017/8/7.
 */
@Data
public class CartDTO {

    /** 商品ID. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}


