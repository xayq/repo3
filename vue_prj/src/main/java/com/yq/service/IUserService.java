package com.yq.service;

import com.yq.domain.UserInfo;

import java.util.List;

public interface IUserService {
    public List<UserInfo> findAll();
    public UserInfo findUserById(Integer id);
    public void editUser(UserInfo user);
}
