package com.example.controller;

import com.example.service.FeignVirtualOrderService;
import com.example.service.VirtualOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JIAZ on 2018/8/24.
 */
@RestController
@RequestMapping("/virtualorder")
@EnableFeignClients({"com.example.service"})
public class VirtualOrderController {

    @Autowired
    VirtualOrderService virtualOrderService;
    @Autowired
    FeignVirtualOrderService feignVirtualOrderService;

    @RequestMapping("/get")
    public String get(String name) {
        return virtualOrderService.get(name);
    }

    @RequestMapping("/getbyfeign")
    public String getbyfeign(String name){
        return feignVirtualOrderService.getbyfeign(name);
    }

}
