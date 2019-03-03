package com.ljl.user.service;

import com.ljl.domain.JWT;
import com.ljl.domain.User;
import com.ljl.domain.user.response.UserLoginDTO;
import com.ljl.user.client.AuthServiceClient;
import com.ljl.user.dao.UserDao;
import com.ljl.user.utils.BPwdEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserDetailService {
  @Autowired
  private UserDao userRepository;

  @Resource
  private AuthServiceClient authServiceClient;

  public User insertUser(String username, String password) {
    User user = new User();
    user.setUsername(username);
    user.setPassword(BPwdEncoderUtil.encode(password));
    return userRepository.save(user);
  }

  public UserLoginDTO login(String username, String password) {
    User user = userRepository.findByUsername(username);
    if (user == null) {
      throw new RuntimeException("用户不存在");
    }
    if (!BPwdEncoderUtil.matches(password, user.getPassword())) {
      throw new RuntimeException("用户密码不对");
    }
    JWT jwt = authServiceClient.getToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==",
        "password", username, password);
    if (jwt == null) {
      throw new RuntimeException("用户token有问题");
    }
    UserLoginDTO dto = new UserLoginDTO();
    dto.setUser(user);
    dto.setJwt(jwt);

    return dto;
  }
}
