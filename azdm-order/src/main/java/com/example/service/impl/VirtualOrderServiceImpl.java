package com.example.service.impl;

import com.example.service.VirtualOrderService;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JIAZ on 2018/8/24.
 */
@Service
public class VirtualOrderServiceImpl implements VirtualOrderService {
    @Autowired
    RestTemplate restTemplate;

    //@Hystrix(fallbackHandler = {})
    public String get(String name) {
        return restTemplate.getForObject("http://AZDM-ACCOUNT/index?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
