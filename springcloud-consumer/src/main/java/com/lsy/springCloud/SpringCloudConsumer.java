package com.lsy.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lsy.springCloud"})
public class SpringCloudConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer.class, args);
    }
}
