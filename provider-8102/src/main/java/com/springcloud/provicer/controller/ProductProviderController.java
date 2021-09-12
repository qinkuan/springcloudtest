package com.springcloud.provicer.controller;

import com.springcloud.provicer.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/product/provider")
@RequiredArgsConstructor
public class ProductProviderController {

    @Value("${spring.application.name}")
    private String instantName;

    @Value("${server.port}")
    private String port;
    private final ProductServiceImpl productServiceImpl;

    @GetMapping("/serviceInfo")
    public String getServiceInfo(){
        return productServiceImpl.getServiceInfo();
    }

    @GetMapping("/getById")
    public String getProductById(@RequestParam Long id) throws Exception {
        return productServiceImpl.getProductById(id);
    }

    @PostMapping("/add")
    public String addProduct(String product){
        return productServiceImpl.addProduct(product);
    }

    @PostMapping("/list")
    public String listProduct(){
        return productServiceImpl.listProduct();
    }
}
