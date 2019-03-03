package com.ljl.user.dao;

import com.ljl.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {
  @Autowired
  private UserDao userDao;

  @Test
  public void testGetUser() {
    User ts = userDao.findByUsername("ts");
    Assert.assertNotNull(ts);
  }
}
