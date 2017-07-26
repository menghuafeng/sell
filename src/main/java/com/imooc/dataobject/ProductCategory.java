package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 类目
 * Created by 孟华锋
 * 2017/7/26.
 * 如果表名为s_product_category,和类名不一致时
 * 需要添加@Table注解
 */
//@Table(name = "s_product_category")
@Entity
//自动更新
@DynamicUpdate
//lombok插件,可以不需要配置@Getter @Setter,@ToString方法,自动配置
@Data
public class ProductCategory {

    /** 类目ID. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名称. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}
