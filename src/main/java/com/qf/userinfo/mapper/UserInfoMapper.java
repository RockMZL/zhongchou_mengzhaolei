package com.qf.userinfo.mapper;

import com.qf.userinfo.pojo.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    //查询所有用户
    public List<UserInfo> findAll();
    //添加用户
    public void addUserinfo(UserInfo userinfo);
    //删除用户
    public int deleteUserinfo(int id);
    //修改用户
    public int updateUserinfo(UserInfo userinfo);
    //模糊查询
    public List<UserInfo> selectLike(UserInfo userinfo);
    //查询单个用户
    public UserInfo selectOne(UserInfo userInfo);
    //根据id查询单个用户
    public UserInfo selectOneById(int userId);

}
