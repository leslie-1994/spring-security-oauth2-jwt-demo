package com.ljl.user.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BPwdEncoderUtil {
  private static final BCryptPasswordEncoder ENCODER = new BCryptPasswordEncoder();

  public static String encode(String password) {
    return ENCODER.encode(password);
  }

  public static boolean matches(CharSequence rawPassword, String encodedPassword) {
    return ENCODER.matches(rawPassword, encodedPassword);
  }
}
