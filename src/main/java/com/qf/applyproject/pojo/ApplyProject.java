package com.qf.applyproject.pojo;

public class ApplyProject {
    private Integer projectId;
    private String projectName;
    private String accountName;
    private String type;
    //简介
    private String intro;
    //筹资金额
    private Integer fundingMoney;
    private Integer day;
    private String projectHeader;
    //项目详情
    private String projectetails;
    //自我介绍
    private String selfintrRoduction;
    //详细自我介绍
    private String detialEdintroDuction;
    private String phone;
    //客服电话
    private String customerPhone;
    private String status="待审核";
    private Integer raiseMoney=0;
    private String createTime;

    @Override
    public String toString() {
        return "ApplyProject{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", accountName='" + accountName + '\'' +
                ", type='" + type + '\'' +
                ", intro='" + intro + '\'' +
                ", fundingMoney=" + fundingMoney +
                ", day=" + day +
                ", projectHeader='" + projectHeader + '\'' +
                ", projectetails='" + projectetails + '\'' +
                ", selfintrRoduction='" + selfintrRoduction + '\'' +
                ", detialEdintroDuction='" + detialEdintroDuction + '\'' +
                ", phone='" + phone + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", status='" + status + '\'' +
                ", raiseMoney=" + raiseMoney +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public ApplyProject() {
    }

    public ApplyProject(Integer projectId, String projectName, String accountName, String type, String intro, Integer fundingMoney, Integer day, String projectHeader, String projectetails, String selfintrRoduction, String detialEdintroDuction, String phone, String customerPhone, String status, Integer raiseMoney, String createTime) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.accountName = accountName;
        this.type = type;
        this.intro = intro;
        this.fundingMoney = fundingMoney;
        this.day = day;
        this.projectHeader = projectHeader;
        this.projectetails = projectetails;
        this.selfintrRoduction = selfintrRoduction;
        this.detialEdintroDuction = detialEdintroDuction;
        this.phone = phone;
        this.customerPhone = customerPhone;
        this.status = status;
        this.raiseMoney = raiseMoney;
        this.createTime = createTime;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getFundingMoney() {
        return fundingMoney;
    }

    public void setFundingMoney(Integer fundingMoney) {
        this.fundingMoney = fundingMoney;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getProjectHeader() {
        return projectHeader;
    }

    public void setProjectHeader(String projectHeader) {
        this.projectHeader = projectHeader;
    }

    public String getProjectetails() {
        return projectetails;
    }

    public void setProjectetails(String projectetails) {
        this.projectetails = projectetails;
    }

    public String getSelfintrRoduction() {
        return selfintrRoduction;
    }

    public void setSelfintrRoduction(String selfintrRoduction) {
        this.selfintrRoduction = selfintrRoduction;
    }

    public String getDetialEdintroDuction() {
        return detialEdintroDuction;
    }

    public void setDetialEdintroDuction(String detialEdintroDuction) {
        this.detialEdintroDuction = detialEdintroDuction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRaiseMoney() {
        return raiseMoney;
    }

    public void setRaiseMoney(Integer raiseMoney) {
        this.raiseMoney = raiseMoney;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
