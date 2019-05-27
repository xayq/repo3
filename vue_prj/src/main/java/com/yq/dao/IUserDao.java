package com.yq.dao;

import com.yq.domain.UserInfo;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
    @Select("select * from user_info")
    public List<UserInfo> findAll();
    @Select("select * from user_info where id=#{id}")
    public UserInfo getUser(Integer id);
    @Update("update user_info set name=#{name},age=#{age},address=#{address} where id=#{id}")
    public void update(UserInfo user);
}
