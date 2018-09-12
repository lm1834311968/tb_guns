package com.stylefeng.guns.modular.test.dao;

import com.stylefeng.guns.modular.test.entity.OrderEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/9/9.
 */

public interface OrderDaoMapper {
    List<OrderEntity> getAll();
}
