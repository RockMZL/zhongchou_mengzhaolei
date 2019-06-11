package com.qf.reward.service.impl;

import com.qf.reward.mapper.RewardMapper;
import com.qf.reward.pojo.Reward;
import com.qf.reward.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardServiceImpl implements RewardService {
    @Autowired(required = false)
    RewardMapper rewardMapper;
    @Override
    public int insertReward(Reward reward) {
        return rewardMapper.insertReward(reward);
    }

    @Override
    public List<Reward> getAllReward(String projectName) {
        return rewardMapper.getAllReward(projectName);
    }

    @Override
    public Reward getOneReward(int reward) {
        return rewardMapper.getOneReward(reward);
    }
}
