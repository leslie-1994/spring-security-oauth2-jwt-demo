package com.ljl.uaa;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableEurekaClient
@EntityScan("com.ljl.domain")
public class UaaApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(UaaApplication.class)
        .web(true).run(args);
  }
}
