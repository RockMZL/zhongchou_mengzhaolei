package com.qf.realname.pojo;


public class RealName {
    int rnsId;
    String processName="实名认证审批流程";
    String accountName;
    String realName;
    String idCard;
    String phone;
    String idPhoto;
    String status="待审核";


    @Override
    public String toString() {
        return "RealName{" +
                "rnsId=" + rnsId +
                ", processName='" + processName + '\'' +
                ", accountName='" + accountName + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", idPhoto='" + idPhoto + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getRnsId() {
        return rnsId;
    }

    public void setRnsId(int rnsId) {
        this.rnsId = rnsId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
