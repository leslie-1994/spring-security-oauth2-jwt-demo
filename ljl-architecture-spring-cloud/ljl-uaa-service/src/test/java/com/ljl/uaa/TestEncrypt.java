package com.ljl.uaa;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestEncrypt {
  @Test
  public void testBCrypt() {
    System.out.println(new BCryptPasswordEncoder().encode("123456"));
  }
}
