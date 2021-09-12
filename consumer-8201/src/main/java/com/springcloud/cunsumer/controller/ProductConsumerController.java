package com.springcloud.cunsumer.controller;

import com.springcloud.cunsumer.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/consumer")
@RequiredArgsConstructor
@Slf4j
public class ProductConsumerController {


    private final ProductService productService;

    @GetMapping("/serviceInfo")
    public String getServiceInfo() {
        String serviceInfo = productService.getServiceInfo();
        log.info(serviceInfo);
        return serviceInfo;
    }

    @GetMapping("/getById")
    public String selectById(@RequestParam Long id) {
        String s = productService.selectById(id);
        log.info(s);
        return s;
    }
}
