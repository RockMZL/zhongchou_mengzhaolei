package com.qf.projectinfo.pojo;

public class ProjectInfo{
    private  int projectId;
    private  String projectName;
    private String projectInfo;

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectInfo='" + projectInfo + '\'' +
                '}';
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }
}
