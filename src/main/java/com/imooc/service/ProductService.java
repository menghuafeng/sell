package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * Created by 孟华锋
 * 2017/7/27.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有的上架的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询所有的商品
     *
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存

}
