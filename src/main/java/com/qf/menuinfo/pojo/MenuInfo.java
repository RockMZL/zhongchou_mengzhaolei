package com.qf.menuinfo.pojo;

public class MenuInfo {
    private int menuId;
    private String menuName;
    private String jumpUrl;
    private int parentId;
    private String icoUrl;

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", jumpUrl='" + jumpUrl + '\'' +
                ", parentId=" + parentId +
                ", icoUrl='" + icoUrl + '\'' +
                '}';
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getIcoUrl() {
        return icoUrl;
    }

    public void setIcoUrl(String icoUrl) {
        this.icoUrl = icoUrl;
    }
}
