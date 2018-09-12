package com.stylefeng.guns.modular.test.service.impl;

import com.stylefeng.guns.modular.test.dao.OrderDaoMapper;
import com.stylefeng.guns.modular.test.entity.OrderEntity;
import com.stylefeng.guns.modular.test.service.XxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class XxServiceImpl implements XxService {

    @Autowired
    private OrderDaoMapper daoMapper;

    @Override
    public List<OrderEntity> getAll() {
        return daoMapper.getAll();
    }
}
