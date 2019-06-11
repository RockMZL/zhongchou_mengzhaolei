package com.qf.menuinfo.service;

import com.qf.menuinfo.dto.MenuInfoDto;
import com.qf.menuinfo.vo.DistributeVo;
import com.qf.menuinfo.vo.UserRoleVo;
import com.qf.menuinfo.pojo.MenuInfo;

import java.util.List;

public interface MenuService {


    //查询所有角色
    public List<MenuInfoDto> getAllMenuInfo(int rid);
    //添加菜单
    public int addMenuinfo(MenuInfo menuinfo);
    //删除角色
    public int deleteMenuinfo(int id);
    //修改角色
    public int  updateMenuinfo(MenuInfo menuinfo);
    //模糊查询
    public List<MenuInfo> selectLike(MenuInfo menuinfo);
    //查询单个角色
    public MenuInfo selectOne(MenuInfo menuinfo);


    //获取分配菜单信息
    public boolean insertDistributeMenuInfo(DistributeVo distributeVo);
    //查询所有菜单
    public List<MenuInfo> getAllMenu();
    //查询所有菜单
    public List<MenuInfo> allMenuInfo();
    //根据用户查询已经选定的角色
    public List<MenuInfoDto> selectUserRoleMenu(UserRoleVo userRoleVo);

}
