package com.stylefeng.guns.modular.good.controller;

import com.stylefeng.guns.modular.good.entity.GoodEntity;
import com.stylefeng.guns.modular.good.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/9/10.
 */
@Controller
@RequestMapping("good")
public class GoodController {
    @Autowired
    private GoodService GoodService;

    @RequestMapping("all")
    @ResponseBody
    public List<GoodEntity> getGood(){
        return GoodService.getGood();
    }
}
