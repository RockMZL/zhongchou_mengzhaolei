package com.qf.applyproject.service;

import com.qf.applyproject.pojo.ApplyProject;

import java.util.List;

public interface ApplyProjectService {
    //添加项目申请
    public int insertApplyProject(ApplyProject applyProject) ;
    //查询所有待审核项目信息
    public List<ApplyProject> getAllApplyProject();
    //修改审核项目状态信息
    public int updateApplyProject(ApplyProject applyProject);
    //查询已经审核通过的项目信息
    public List<ApplyProject>  selectApplyProjectInfo();
    //查询单个审核信息
    public ApplyProject getOneApplyProject(int projectId);
}
