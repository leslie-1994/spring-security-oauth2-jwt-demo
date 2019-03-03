package com.ljl.domain;

import lombok.Data;

@Data
public class JWT {
  private String access_token;
  private String token_type;
  private String refresh_token;
  private String scope;
  private String jti;
  private int expires_in;
}
