package com.qf.roleinfo.vo;

import java.util.List;

public class RoleInfoVo {
    int userId;
    List<Integer> array;

    @Override
    public String toString() {
        return "RoleInfoVo{" +
                "userId=" + userId +
                ", array=" + array +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }

}
