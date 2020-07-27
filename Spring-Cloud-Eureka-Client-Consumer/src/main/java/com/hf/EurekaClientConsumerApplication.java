package com.hf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Eureka 客户端 -服务提供者
 *
 * @author 温柔一刀
 * @create 2020-07-26 20:32
 **/
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerApplication.class, args);
    }
}
