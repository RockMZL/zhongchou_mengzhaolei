package com.qf.menuinfo.vo;

import java.util.List;

public class DistributeVo {
    int rId;
    List<Integer> menus;

    @Override
    public String toString() {
        return "DistributeVo{" +
                "rId=" + rId +
                ", menus=" + menus +
                '}';
    }
    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public List<Integer> getMenus() {
        return menus;
    }

    public void setMenus(List<Integer> menus) {
        this.menus = menus;
    }
}
