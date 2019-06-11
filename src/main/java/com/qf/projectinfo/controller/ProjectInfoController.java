package com.qf.projectinfo.controller;

import com.qf.projectinfo.pojo.ProjectInfo;
import com.qf.projectinfo.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectInfoController {
    @Autowired
    ProjectInfoService projectInfoService;
    //查询所有
    @RequestMapping("getAllProject")
    public Object getAllProject(){
        return projectInfoService.selectAllProject();
    }
    //新增
    @RequestMapping("addProject")
    public  Object addProject(@RequestBody ProjectInfo projectInfo){
        return projectInfoService.insertOneProject(projectInfo);
    }
    //查询单个
    @RequestMapping("selectOneProject")
    public Object selectOneProject(@RequestParam int projectId){
        return projectInfoService.selectOneProject(projectId);
    }
    //修改项目信息
    @RequestMapping("updateProject")
    public Object updateProject(@RequestBody ProjectInfo projectInfo){
        return projectInfoService.updateOneProject(projectInfo);
    }
    //删除项目信息
    @RequestMapping("deleteProject")
    public Object deleteProject(@RequestParam int projectId){
        return projectInfoService.deleteOneProject(projectId);
    }
    //模糊查询
    @RequestMapping("selectLikeAllProjects")
    public Object selectLikeAllProjects(@RequestParam String message){
        ProjectInfo projectInfo = new ProjectInfo();
        projectInfo.setProjectName(message);
        projectInfo.setProjectInfo(message);
        return projectInfoService.selectLikeAllProjects(projectInfo);
    }

}
