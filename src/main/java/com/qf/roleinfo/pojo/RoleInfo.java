package com.qf.roleinfo.pojo;

public class RoleInfo {
    private int roleId;
    private String roleName;
    private String status="正常";

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
