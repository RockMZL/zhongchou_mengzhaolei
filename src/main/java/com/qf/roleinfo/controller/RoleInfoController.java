package com.qf.roleinfo.controller;

import com.qf.roleinfo.pojo.RoleInfo;
import com.qf.roleinfo.service.RoleInfoService;
import com.qf.roleinfo.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class RoleInfoController {
    @Autowired(required = false)
    RoleInfoService roleInfoService;

    //获取所有角色信息
    @RequestMapping("getAllRoleInfo")
    public Object getAllRoleInfo() {
        return roleInfoService.selectAllRoleinfo();
    }

    //删除用户角色
    @RequestMapping("deleteRole_MenuInfo")
    public Object deleteRole_MenuInfo(@RequestParam int roleId) {
        return roleInfoService.deleteRole_MenuInfo(roleId);
    }

    //添加角色信息
    @RequestMapping("addRoleInfo")
    public Object addRoleInfo(@RequestParam String roleName,String status) {
        RoleInfo roleinfo = new RoleInfo();
        roleinfo.setRoleName(roleName);
        roleinfo.setStatus(status);
        roleInfoService.addRoleinfo(roleinfo);
        return true;
    }

    //根据id查询单个角色
    @RequestMapping("selectOne")
    public Object selectOne(@RequestParam int id) {
        RoleInfo roleinfo = new RoleInfo();
        roleinfo.setRoleId(id);
        return roleInfoService.selectOne(roleinfo);
    }

    //修改角色信息
    @RequestMapping("updateRoleinfo")
    public Object updateRoleinfo(@RequestParam String roleName, int roleId,String status) {
        RoleInfo roleinfo = new RoleInfo();
        roleinfo.setRoleName(roleName);
        roleinfo.setRoleId(roleId);
        roleinfo.setStatus(status);
        roleInfoService.updateRoleinfo(roleinfo);
        return true;
    }

    //模糊查询
    @RequestMapping("selectLikeRoleInfo")
    public Object selectLikeRoleInfo(@RequestParam String message) {
        RoleInfo roleinfo = new RoleInfo();
        roleinfo.setRoleName(message);
        List<RoleInfo> roleinfos = roleInfoService.selectLike(roleinfo);
        if (roleinfos.size() > 0)
            return roleinfos;
        return false;
    }

    //根据用户id查询已经选定的角色信息
    @RequestMapping("selectUserRoleById")
    public Object selectUserRoleById(@RequestParam int userid) {
        return roleInfoService.selectUserRoleById(userid);
    }

    @RequestMapping("selectNotUserRoleById")
    public Object selectNotUserRoleById(@RequestParam int userid) {
        return roleInfoService.selectNotUserRoleById(userid);
    }

    @RequestMapping("addUserRole")
    public Object addUserRole(@RequestBody RoleInfoVo roleInfoVo) {
        return roleInfoService.insertDistributeUserRole(roleInfoVo);
    }

}
