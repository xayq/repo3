package com.yq.service;

import com.yq.dao.IUserDao;
import com.yq.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    @Override
    public UserInfo findUserById(Integer id) {
        return userDao.getUser(id);
    }

    @Override
    public void editUser(UserInfo user) {
        userDao.update(user);
    }
}
