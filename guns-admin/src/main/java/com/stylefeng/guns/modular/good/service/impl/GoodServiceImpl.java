package com.stylefeng.guns.modular.good.service.impl;

import com.stylefeng.guns.modular.good.dao.GoodDaoMapper;
import com.stylefeng.guns.modular.good.entity.GoodEntity;
import com.stylefeng.guns.modular.good.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/10.
 */
@Service
public class GoodServiceImpl implements GoodService{
    @Autowired
    private GoodDaoMapper GoodDaoMapper;
    @Override
    public List<GoodEntity> getGood(){
        return GoodDaoMapper.getGood();
    }
}
