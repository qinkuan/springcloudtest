package com.springcloud.cunsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "provider", fallback = ProductFallbackServieImpl.class)
public interface ProductService {

    @GetMapping("/product/provider/serviceInfo")
    String getServiceInfo();

    @GetMapping("/product/provider" + "/getById?id={id}")
    String selectById(@PathVariable("id") Long id);
}
