package com.imooc.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.Enums.ResultEnum;
import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import com.imooc.exception.SellException;
import com.imooc.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 孟华锋
 * 2017/8/9.
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert (OrderForm orderForm) {
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems() ,
                    new TypeToken<List<OrderDetail>>(){}.getType());
        } catch (Exception e) {
            log.error(" [对象转换] 错误, String = {}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
