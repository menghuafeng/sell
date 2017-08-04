package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 孟华锋
 * 2017/8/4.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    Page<OrderDetail> findByDetailId(String detailId, Pageable pageable);
}
