package com.qf.menuinfo.controller;

import com.qf.menuinfo.dto.MenuInfoDto;
import com.qf.menuinfo.service.MenuService;
import com.qf.menuinfo.vo.DistributeVo;
import com.qf.menuinfo.vo.UserRoleVo;
import com.qf.menuinfo.pojo.MenuInfo;
import com.qf.userinfo.pojo.UserInfo;
import com.qf.roleinfo.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuInfoController {
    @Autowired(required = false)
    RoleInfoService roleinfoService;
    @Autowired
    MenuService menuService;
    //获取对应角色所有菜单信息
    @RequestMapping("getAllMenuInfo")
    public Object getAllMenuInfo(@RequestParam int rid) {
        List<MenuInfoDto> allMenuInfo = menuService.getAllMenuInfo(rid);
        return allMenuInfo;
    }

    //分配角色菜单许可
    @RequestMapping(value = "distribute", method = RequestMethod.POST)
    public void distribute(@RequestBody DistributeVo distributeVo) {
        menuService.insertDistributeMenuInfo(distributeVo);
    }
    //查询所有菜单信息
    @RequestMapping("getAllMenu")
    public  Object getAllMenu(){
        return menuService.getAllMenu();
    }
    //查询所有菜单信息
    @RequestMapping("allMenu")
    public  Object allMenu(){
        return menuService.allMenuInfo();
    }
    //添加菜单信息
    @RequestMapping("addMenuInfo")
    public Object addMenu(@RequestBody MenuInfo menuinfo){
        int i = menuService.addMenuinfo(menuinfo);
        if(i==0)
            return false;
        return true;
    }
    //删除菜单信息
    @RequestMapping("deleteMenu")
    public Object deleteMenu(@RequestParam int id){
        int i = menuService.deleteMenuinfo(id);
        if(i==1)
            return true;
        return false;
    }
    //修改菜单信息
    @RequestMapping("updateMenuInfo")
    public Object updateMenuInfo(@RequestBody MenuInfo menuinfo){
        int i = menuService.updateMenuinfo(menuinfo);
        if(i==1)
            return true;
        return false;
    }
    //查询单个菜单信息
    @RequestMapping("selectOneMenu")
    public Object selectOneMenu(@RequestParam int id){
        MenuInfo menuinfo = new MenuInfo();
        menuinfo.setMenuId(id);
        MenuInfo menuinfo1 = menuService.selectOne(menuinfo);
        return menuinfo1;
    }

    //用户请求对应角色的所有菜单信息
    @RequestMapping("getUserRoleMenu")
    public Object getUserRoleMenu(HttpSession session){
        ArrayList<Integer> roles = new ArrayList<Integer>();
        UserInfo user = (UserInfo) session.getAttribute("user");
        int userId = user.getUserId();
        UserRoleVo userRoleVo = new UserRoleVo();
        userRoleVo.setUserId(userId);
        List<MenuInfoDto> menuInfoDtos = menuService.selectUserRoleMenu(userRoleVo);
        ArrayList<MenuInfoDto> menuInfoDtos1 = new ArrayList<MenuInfoDto>();
        for (MenuInfoDto menuinfoDto:menuInfoDtos
             ) {
            int pid = menuinfoDto.getPid();
            if(pid==0) {
                menuInfoDtos1.add(menuinfoDto);
            }
        }
        for (MenuInfoDto m1:menuInfoDtos1) {
           ArrayList<MenuInfoDto> menuInfoDtos2= new ArrayList<MenuInfoDto>();
            for (MenuInfoDto m2:menuInfoDtos
                 ) {
                if(m1.getId()==m2.getPid()){
                    menuInfoDtos2.add(m2);
                }
            }
            m1.setChildren(menuInfoDtos2);
        }
        return menuInfoDtos1;
    }

}
