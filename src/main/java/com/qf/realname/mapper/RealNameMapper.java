package com.qf.realname.mapper;

import com.qf.realname.pojo.RealName;

import java.util.List;

public interface RealNameMapper {
    //添加审批信息
    public int insertOneRealName(RealName realName);
    //查询所有审批信息
    public List<RealName> getAllRealName();
    //修改审批信息
    public int updateRealName(RealName realName);
    //查询单个认证信息
    public RealName selectOneRealName(String accountName);
}
