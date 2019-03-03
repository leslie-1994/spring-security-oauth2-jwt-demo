package com.ljl.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@EntityScan("com.ljl.domain")
public class UserApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(UserApplication.class)
        .web(true).run(args);
  }
}
