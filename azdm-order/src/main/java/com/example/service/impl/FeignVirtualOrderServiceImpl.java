package com.example.service.impl;

import com.example.service.FeignVirtualOrderService;
import org.springframework.stereotype.Service;

/**
 * Created by JIAZ on 2018/8/24.
 */
@Service
public class FeignVirtualOrderServiceImpl implements FeignVirtualOrderService {

    public String getbyfeign(String name) {
        return "sorry" + name;
    }

}
