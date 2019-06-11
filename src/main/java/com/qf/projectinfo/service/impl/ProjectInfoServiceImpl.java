package com.qf.projectinfo.service.impl;

import com.qf.projectinfo.pojo.ProjectInfo;
import com.qf.projectinfo.mapper.ProjectInfoMapper;
import com.qf.projectinfo.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {
    @Autowired(required = false)
    ProjectInfoMapper projectInfoMapper;
    @Override
    public List<ProjectInfo> selectAllProject() {
        return projectInfoMapper.selectAllProject();
    }

    @Override
    public int insertOneProject(ProjectInfo projectInfo) {
        return projectInfoMapper.insertOneProject(projectInfo);
    }

    @Override
    public int deleteOneProject(int projectId) {
        return projectInfoMapper.deleteOneProject(projectId);
    }

    @Override
    public int updateOneProject(ProjectInfo projectInfo) {
        return projectInfoMapper.updateOneProject(projectInfo);
    }

    @Override
    public ProjectInfo selectOneProject(int projectId) {
        return projectInfoMapper.selectOneProject(projectId);
    }

    @Override
    public List<ProjectInfo> selectLikeAllProjects(ProjectInfo projectInfo) {
        return projectInfoMapper.selectLikeAllProjects(projectInfo);
    }
}
