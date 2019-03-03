package com.ljl.user.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {
  @RequestMapping("/hi")
  public String hi() {
    return "hi, 你好";
  }

  @RequestMapping("/hello")
  @PreAuthorize("hasAuthority('ROLE_ADMIN')")
  public String hello() {
    return "hello, 你好";
  }

  @RequestMapping("/getPrincipal")
  public OAuth2Authentication getPrincipal(OAuth2Authentication oAuth2Authentication,
                                           Principal principal,
                                           Authentication authentication) {
    System.out.println("=============================================");
    System.out.println(oAuth2Authentication);
    System.out.println(principal);
    System.out.println(authentication);
    System.out.println("=============================================");
    return oAuth2Authentication;
  }
}
