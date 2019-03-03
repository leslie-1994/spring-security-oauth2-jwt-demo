package com.ljl.user.utils;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BPwdEncoderUtil {
  private static final PasswordEncoder ENCODER = PasswordEncoderFactories.createDelegatingPasswordEncoder();

  public static String encode(String password) {
    return ENCODER.encode(password);
  }

  public static boolean matches(CharSequence rawPassword, String encodedPassword) {
    return ENCODER.matches(rawPassword, encodedPassword);
  }
}
