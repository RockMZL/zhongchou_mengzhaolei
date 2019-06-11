package com.qf.projectinfo.mapper;

import com.qf.projectinfo.pojo.ProjectInfo;

import java.util.List;

public interface ProjectInfoMapper {
    //查询所有项目
    public List<ProjectInfo> selectAllProject();
    //添加单个项目
    public int  insertOneProject(ProjectInfo projectInfo);
    //删除单个项目
    public int deleteOneProject(int projectId);
    //修改项目信息
    public int updateOneProject(ProjectInfo projectInfo);
    //查询单个项目信息
    public ProjectInfo selectOneProject(int projectId);
    //模糊查询
    public List<ProjectInfo> selectLikeAllProjects(ProjectInfo projectInfo);
}
