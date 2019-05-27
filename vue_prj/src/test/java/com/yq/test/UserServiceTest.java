package com.yq.test;

import com.yq.domain.UserInfo;
import com.yq.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceTest {
    @Autowired
    private IUserService userService;
    @Test
    public void testFindAll(){
        System.out.println(userService.findAll());
    }
    @Test
    public void testFindOne(){
        System.out.println(userService.findUserById(2));
    }
    @Test
    public void testUpdate(){
        UserInfo user=userService.findUserById(1);
        user.setName("张三丰");
        userService.editUser(user);
    }
}
