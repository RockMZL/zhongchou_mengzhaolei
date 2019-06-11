package com.qf.menuinfo.mapper;

import com.qf.menuinfo.dto.MenuInfoDto;
import com.qf.menuinfo.vo.DistributeVo;
import com.qf.menuinfo.vo.UserRoleVo;
import com.qf.menuinfo.pojo.MenuInfo;

import java.util.List;

public interface MenuInfoMapper {
    //查询所有菜单
    public List<MenuInfoDto> getAllMenuInfo(int rid);
    //添加菜单
    public int addMenuinfo(MenuInfo menuinfo);
    //删除菜单
    public int  deleteMenuinfo(int id);
    //修改菜单
    public int  updateMenuinfo(MenuInfo menuinfo);
    //模糊查询
    public List<MenuInfo> selectLike(MenuInfo menuinfo);
    //查询单个角色
    public MenuInfo selectOne(MenuInfo menuinfo);
    //删除角色菜单信息
    public void deleteDistributeMenuinfo(int rId);
    //新增角色菜单信息
    public void insertDistributeMenuInfo(DistributeVo distributeVo);
    //查询所有树状分类菜单
    public List<MenuInfo> getAllMenu();
    //查询所有菜单
    public List<MenuInfo> allMenuInfo();
    //根据用户查询已经选定的角色
    public List<MenuInfoDto> selectUserRoleMenu(UserRoleVo userRoleVo);
}
