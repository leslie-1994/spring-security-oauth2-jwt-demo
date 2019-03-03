package com.ljl.domain.user.response;

import com.ljl.domain.JWT;
import com.ljl.domain.User;
import lombok.Data;

@Data
public class UserLoginDTO {
  private User user;
  private JWT jwt;
}
