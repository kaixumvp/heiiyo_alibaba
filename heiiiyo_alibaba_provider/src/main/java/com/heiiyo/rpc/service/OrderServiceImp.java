package com.heiiyo.rpc.service;

import com.heiiyo.api.OrderService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class OrderServiceImp implements OrderService {
    @Override
    public String getInfo() {
        return "{'info':{}}";
    }
}
