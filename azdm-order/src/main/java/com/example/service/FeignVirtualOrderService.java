package com.example.service;

import com.example.service.impl.FeignVirtualOrderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by JIAZ on 2018/8/24.
 */
@FeignClient(value = "AZDM-ACCOUNT", fallback = FeignVirtualOrderServiceImpl.class)
public interface FeignVirtualOrderService {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String getbyfeign(@RequestParam(value = "name") String name);
}
