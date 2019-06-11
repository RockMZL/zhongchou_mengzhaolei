package com.qf.reward.pojo;

public class Reward {
    Integer rewardId;
    String projectName;
    String type;
    Integer payMoney;
    String rewardContent;
    String explainPhoto;
    Integer rewardNumber;
    Integer singleNumber;
    Integer freightMoney;
    String invoice;
    Integer rewardTime;

    @Override
    public String toString() {
        return "Reward{" +
                "rewardId=" + rewardId +
                ", projectName='" + projectName + '\'' +
                ", type='" + type + '\'' +
                ", payMoney=" + payMoney +
                ", rewardContent='" + rewardContent + '\'' +
                ", explainPhoto='" + explainPhoto + '\'' +
                ", rewardNumber=" + rewardNumber +
                ", singleNumber=" + singleNumber +
                ", freightMoney=" + freightMoney +
                ", invoice='" + invoice + '\'' +
                ", rewardTime=" + rewardTime +
                '}';
    }

    public Integer getRewardId() {
        return rewardId;
    }

    public void setRewardId(Integer rewardId) {
        this.rewardId = rewardId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public String getRewardContent() {
        return rewardContent;
    }

    public void setRewardContent(String rewardContent) {
        this.rewardContent = rewardContent;
    }

    public String getExplainPhoto() {
        return explainPhoto;
    }

    public void setExplainPhoto(String explainPhoto) {
        this.explainPhoto = explainPhoto;
    }

    public Integer getRewardNumber() {
        return rewardNumber;
    }

    public void setRewardNumber(Integer rewardNumber) {
        this.rewardNumber = rewardNumber;
    }

    public Integer getSingleNumber() {
        return singleNumber;
    }

    public void setSingleNumber(Integer singleNumber) {
        this.singleNumber = singleNumber;
    }

    public Integer getFreightMoney() {
        return freightMoney;
    }

    public void setFreightMoney(Integer freightMoney) {
        this.freightMoney = freightMoney;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public Integer getRewardTime() {
        return rewardTime;
    }

    public void setRewardTime(Integer rewardTime) {
        this.rewardTime = rewardTime;
    }
}
