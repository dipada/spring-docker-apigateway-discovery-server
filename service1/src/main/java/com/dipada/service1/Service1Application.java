package com.dipada.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }

}
