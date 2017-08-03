package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * Created by 孟华锋
 * 2017/7/27.
 */
@Entity
@Data
public class ProductInfo {

    @Id
    /** 商品编号. */
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 商品单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 商品描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 商品状态,0正常1下架 */
    private Integer productStatus;

    /** 类目编号. */
    private Integer categoryType;
}
