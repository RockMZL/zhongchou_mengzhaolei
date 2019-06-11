package com.qf.reward.service;

import com.qf.reward.pojo.Reward;

import java.util.List;

public interface RewardService {
    //添加回报信息
    public int insertReward(Reward reward);
    //查询项目下所有回报信息
    public List<Reward> getAllReward(String  projectName);
    //查询单个回报信息
    public Reward getOneReward(int reward);

}
