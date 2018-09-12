package com.stylefeng.guns.modular.test.controller;

import com.stylefeng.guns.modular.test.entity.OrderEntity;
import com.stylefeng.guns.modular.test.service.XxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("xx")
public class XxController {

    @Autowired
    private XxService xxService;

    @RequestMapping("/getall")
    @ResponseBody
    public List<OrderEntity> getall(){
       return  xxService.getAll();
    }
}
