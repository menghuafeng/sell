package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 孟华锋
 * 2017/7/26.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

   List<ProductCategory> findByCategoryTypeIn(List<Integer> list);
}
