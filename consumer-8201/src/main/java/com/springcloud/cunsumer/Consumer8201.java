package com.springcloud.cunsumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Consumer8201 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer8201.class, args);
    }
}
