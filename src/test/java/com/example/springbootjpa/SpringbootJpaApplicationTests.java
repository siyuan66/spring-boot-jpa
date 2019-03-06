package com.example.springbootjpa;

import com.example.springbootjpa.dao.UserDao;
import com.example.springbootjpa.entrity.User;
import com.example.springbootjpa.entrity.Weibo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJpaApplicationTests {
    @Autowired
    UserDao userDao;

    @Test
    public void contextLoads() {
        User byUsername = userDao.findByUsername("111");
        System.out.println(byUsername);
        User user = new User();
        user.setUserId(1);
        user.setUsername("ss2");
        Weibo weibo = new Weibo();
        weibo.setCreateDate(new Date());
        Set<Weibo> weibos = new HashSet<>();
        weibos.add(weibo);
        weibo.setUser(user);
        user.setWeibos(weibos);
        userDao.save(user);
    }

}
