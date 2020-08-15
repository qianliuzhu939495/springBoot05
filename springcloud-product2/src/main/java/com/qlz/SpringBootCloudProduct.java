package com.qlz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootCloudProduct {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudProduct.class,args);
    }
}
