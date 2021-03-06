package com.imooc.dataobject;

import com.imooc.Enums.OrderStatusEnum;
import com.imooc.Enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 孟华锋
 * 2017/8/3.
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /**订单ID. */
    @Id
    private String orderId;
    /**买家姓名. */
    private String buyerName;
    /**买家手机号. */
    private String buyerPhone;
    /**买家地址. */
    private String buyerAddress;
    /**买家微信的openId. */
    private String buyerOpenid;
    /**订单总金额. */
    private BigDecimal orderAmount;
    /**订单状态,默认为0 新下单状态. */
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();
    /**支付状态,默认为0 未支付状态. */
    private Integer payStatus= PayStatusEnum.SUCCESS.getCode();
    /**创建时间. */
    private Date createTime;
    /**更新时间. */
    private Date updateTime;
    //这里会添加一个不属于表字段的属性,最好新建一个数据传输对象DTO
//    @Transient
//    private List<OrderDetail> orderDetailList;
}
