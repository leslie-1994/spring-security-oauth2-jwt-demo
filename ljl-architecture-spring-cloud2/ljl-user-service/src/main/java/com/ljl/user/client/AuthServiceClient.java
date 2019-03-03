package com.ljl.user.client;

import com.ljl.domain.JWT;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "uaa-service", fallback = AuthServiceHystrix.class)
public interface AuthServiceClient {
  @PostMapping(value = "/oauth/token")
  JWT getToken(@RequestHeader(value = "Authorization") String authorization,
               @RequestParam("grant_type") String grantType,
               @RequestParam("username") String username,
               @RequestParam("password") String password);
}
