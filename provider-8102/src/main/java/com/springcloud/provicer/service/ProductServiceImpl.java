package com.springcloud.provicer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl {


    @Value("${spring.application.name}")
    private String instantName;

    @Value("${server.port}")
    private String port;


    public String getServiceInfo(){
        return "查询成功-当前服务名为："+instantName+"当前端口："+port;
    }

    @HystrixCommand(fallbackMethod = "selectByIdFallbackHandler", commandProperties = {
            // 是否启用服务熔断
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            // 请求阈值
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            // 时间窗口
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            // 错误比率
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50")
    })
    public String getProductById(Long id) throws Exception {
        if(id<0) throw new Exception();
        log.info("我送给消费者一个产品");
        return "这是一个产品";
    }
    public String selectByIdFallbackHandler(Long id){
        return "我失败了啊啊啊";

    }
    public String addProduct(String product){
        return "添加一个产品成功";
    }

    public String listProduct(){
        return "这里有一堆产品";
    }
}
