package com.qf.roleinfo.service.impl;

import com.qf.roleinfo.pojo.RoleInfo;
import com.qf.roleinfo.mapper.RoleInfoMapper;
import com.qf.roleinfo.service.RoleInfoService;
import com.qf.roleinfo.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired(required = false)
    RoleInfoMapper roleinfoMapper;

    public List<RoleInfo> selectAllRoleinfo() {
        List<RoleInfo> roleinfos = roleinfoMapper.selectAllRoleinfo();
        return roleinfos;
    }

    public void addRoleinfo(RoleInfo roleinfo) {
        roleinfoMapper.addRoleinfo(roleinfo);
    }

    public void updateRoleinfo(RoleInfo roleinfo) {
        roleinfoMapper.updateRoleinfo(roleinfo);
    }

    public List<RoleInfo> selectLike(RoleInfo roleinfo) {
        return roleinfoMapper.selectLike(roleinfo);
    }

    public RoleInfo selectOne(RoleInfo roleinfo) {
        return roleinfoMapper.selectOne(roleinfo);
    }

    @Transactional
    public boolean deleteRole_MenuInfo(int id) {
        roleinfoMapper.deleteRoleinfo(id);
        roleinfoMapper.deleteRole_MenuInfo(id);
        return true;
    }

    public List<RoleInfo> selectUserRoleById(int id) {
        return roleinfoMapper.selectUserRoleById(id);
    }

    public List<RoleInfo> selectNotUserRoleById(int id) {
        return roleinfoMapper.selectNotUserRoleById(id);
    }

    @Transactional
    public boolean insertDistributeUserRole(RoleInfoVo roleInfoVo) {
        int userId = roleInfoVo.getUserId();
        List<Integer> roles = roleInfoVo.getArray();
        if (roles.size() == 0) {
            roleinfoMapper.deleteUserRole(userId);
            return true;
        } else {
            roleinfoMapper.deleteUserRole(userId);
            roleinfoMapper.insertDistributeUserRole(roleInfoVo);
            return true;
        }
    }



}
