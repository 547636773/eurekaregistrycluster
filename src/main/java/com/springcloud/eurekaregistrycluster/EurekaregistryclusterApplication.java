package com.springcloud.eurekaregistrycluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaregistryclusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaregistryclusterApplication.class, args);
    }

}
