package com.qf.userinfo.vo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

public class UserInfoVo implements Serializable {

    @Length(min = 2,max = 16,message = "用户名不合法")
    private String userName;
    @NotBlank
    private String userPass;
    //@Pattern(regexp = "^[a-zA-Z0-9-_]+@[a-zA-Z0-9-_]+(\\.[a-zA-Z0-9-_]+)+$",message = "邮箱地址不合法")
    @Email
    private String email;
    @Length(min = 2,max = 16,message = "账号不正确")
    private String accounts;
    private String type;
    private String status="正常";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", email='" + email + '\'' +
                ", accounts='" + accounts + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }
}
