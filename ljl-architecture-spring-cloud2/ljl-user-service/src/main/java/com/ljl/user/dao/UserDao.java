package com.ljl.user.dao;

import com.ljl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
