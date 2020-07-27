package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Eureka 客户端 -服务提供者
 *
 * @author 温柔一刀
 * @create 2020-07-26 20:32
 **/
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvideApplication.class, args);
    }
}
