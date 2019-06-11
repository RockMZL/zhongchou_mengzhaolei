package com.qf.applyproject.service.impl;

import com.qf.applyproject.mapper.ApplyProjectMapper;
import com.qf.applyproject.pojo.ApplyProject;
import com.qf.applyproject.service.ApplyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyProjectServiceImpl implements ApplyProjectService {
    @Autowired(required = false)
    ApplyProjectMapper applyProjectMapper;
    @Override
    public int insertApplyProject(ApplyProject applyProject) {
        return applyProjectMapper.insertApplyProject(applyProject);
    }

    @Override
    public List<ApplyProject> getAllApplyProject() {
        return applyProjectMapper.getAllApplyProject();
    }

    @Override
    public int updateApplyProject(ApplyProject applyProject){
        return applyProjectMapper.updateApplyProject(applyProject);
    }

    @Override
    public List<ApplyProject> selectApplyProjectInfo() {
        return applyProjectMapper.selectApplyProjectInfo();
    }

    @Override
    public ApplyProject getOneApplyProject(int projectId) {
        return applyProjectMapper.getOneApplyProject(projectId);
    }

}
