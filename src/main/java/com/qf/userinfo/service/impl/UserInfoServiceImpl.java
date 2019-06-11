package com.qf.userinfo.service.impl;

import com.qf.userinfo.pojo.UserInfo;
import com.qf.userinfo.mapper.UserInfoMapper;
import com.qf.userinfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired(required = false)
    UserInfoMapper userInfoMapper;
    public List<UserInfo> selectAll() {
        return userInfoMapper.findAll();
    }

    public void insertUserinfo(UserInfo userinfo) {
        userInfoMapper.addUserinfo(userinfo);
    }

    public int deleteUserinfo(int id) {
        return userInfoMapper.deleteUserinfo(id);
    }

    public int updateUserinfo(UserInfo userinfo) {

        return userInfoMapper.updateUserinfo(userinfo);
    }

    public List<UserInfo> selectLike(UserInfo userinfo) {

        return userInfoMapper.selectLike(userinfo);
    }

    public UserInfo selectOne(UserInfo userInfo) {
        return userInfoMapper.selectOne(userInfo);

    }

    public UserInfo selectOneById(int userId) {
        return userInfoMapper.selectOneById(userId);
    }
}
