package com.springcloud.cunsumer.service;

import org.springframework.stereotype.Component;

@Component
public class ProductFallbackServieImpl implements ProductService{
    @Override
    public String getServiceInfo() {
        return "服务器开小差了";
    }

    @Override
    public String selectById(Long id) {
        return "服务器开小差了";
    }
}
