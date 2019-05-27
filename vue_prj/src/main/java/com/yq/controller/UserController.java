package com.yq.controller;

import com.yq.domain.UserInfo;
import com.yq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }
    @RequestMapping("/findById")
    public UserInfo findById(Integer id){
        return userService.findUserById(id);
    }
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody UserInfo user){
        userService.editUser(user);
    }

}
