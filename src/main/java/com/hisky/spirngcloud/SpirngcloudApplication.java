package com.hisky.spirngcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpirngcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpirngcloudApplication.class, args);
    }

}

