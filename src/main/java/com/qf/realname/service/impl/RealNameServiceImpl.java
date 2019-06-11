package com.qf.realname.service.impl;

import com.qf.realname.pojo.RealName;
import com.qf.realname.mapper.RealNameMapper;
import com.qf.realname.service.RealNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealNameServiceImpl implements RealNameService {
    @Autowired(required = false)
    RealNameMapper realNameMapper;

    @Override
    public int insertOneRealName(RealName realName) {
        return realNameMapper.insertOneRealName(realName);
    }

    @Override
    public List<RealName> getAllRealName() {
        return realNameMapper.getAllRealName();
    }

    @Override
    public int updateRealName(RealName realName) {
        return realNameMapper.updateRealName(realName);
    }

    @Override
    public RealName selectOneRealName(String accountName) {
        return realNameMapper.selectOneRealName(accountName);
    }
}
