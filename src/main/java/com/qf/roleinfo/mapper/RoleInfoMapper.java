package com.qf.roleinfo.mapper;

import com.qf.roleinfo.pojo.RoleInfo;
import com.qf.roleinfo.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoMapper {
    //查询所有角色信息
    public List<RoleInfo> selectAllRoleinfo();
    //添加角色
    public void addRoleinfo(RoleInfo roleinfo);
    //删除角色
    public void deleteRoleinfo(int id);
    //修改角色
    public void updateRoleinfo(RoleInfo roleinfo);
    //模糊查询
    public List<RoleInfo> selectLike(RoleInfo roleinfo);
    //查询单个角色
    public RoleInfo selectOne(RoleInfo roleinfo);
    //删除中间表角色信息
    public void deleteRole_MenuInfo(int id);
    //根据用户id查询已经选定的角色信息
    public List<RoleInfo> selectUserRoleById(int id);
    //查询未被用户选中的角色信息
    public List<RoleInfo> selectNotUserRoleById(int id);
    //添加选中的角色信息至中间表
    public void insertDistributeUserRole(RoleInfoVo roleInfoVo);
    //根据userid删除中间表数据
    public void deleteUserRole(int userid);
}
