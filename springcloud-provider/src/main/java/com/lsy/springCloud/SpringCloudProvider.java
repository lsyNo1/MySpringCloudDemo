package com.lsy.springCloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Create By Lance
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProvider {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider.class,args);
    }

}
