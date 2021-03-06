package com.springcloud.provicer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider8101 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8101.class, args);
    }
}
