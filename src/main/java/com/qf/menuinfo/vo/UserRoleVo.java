package com.qf.menuinfo.vo;

import java.util.List;

public class UserRoleVo {
    int userId;
    List<Integer> roles;

    @Override
    public String toString() {
        return "UserRoleVo{" +
                "userId=" + userId +
                ", roles=" + roles +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }
}
