package com.qf.menuinfo.service.impl;

import com.qf.menuinfo.dto.MenuInfoDto;
import com.qf.menuinfo.mapper.MenuInfoMapper;
import com.qf.menuinfo.service.MenuService;
import com.qf.menuinfo.vo.DistributeVo;
import com.qf.menuinfo.vo.UserRoleVo;
import com.qf.menuinfo.pojo.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired(required = false)
    MenuInfoMapper menuinfoMapper;

    public List<MenuInfoDto> getAllMenuInfo(int rid) {
        return menuinfoMapper.getAllMenuInfo(rid);
    }

    public int addMenuinfo(MenuInfo menuinfo) {
        return menuinfoMapper.addMenuinfo(menuinfo);
    }

    public int  deleteMenuinfo(int id) {
        return menuinfoMapper.deleteMenuinfo(id);
    }

    public int  updateMenuinfo(MenuInfo menuinfo) {
        return menuinfoMapper.updateMenuinfo(menuinfo);
    }

    public List<MenuInfo> selectLike(MenuInfo menuinfo) {
        return menuinfoMapper.selectLike(menuinfo);
    }

    public MenuInfo selectOne(MenuInfo menuinfo) {
        return menuinfoMapper.selectOne(menuinfo);
    }

    @Transactional
    public boolean insertDistributeMenuInfo(DistributeVo distributeVo) {
        if (distributeVo.getMenus().size()==0) {
            menuinfoMapper.deleteDistributeMenuinfo(distributeVo.getrId());
            return true;
        } else {
            menuinfoMapper.deleteDistributeMenuinfo(distributeVo.getrId());
            menuinfoMapper.insertDistributeMenuInfo(distributeVo);
            return true;
        }
    }
    //查询所有菜单
    public List<MenuInfo> getAllMenu(){
        return menuinfoMapper.getAllMenu();
    }
    //查询所有菜单信息
    public List<MenuInfo> allMenuInfo() {
        return menuinfoMapper.allMenuInfo();
    }

    public List<MenuInfoDto> selectUserRoleMenu(UserRoleVo userRoleVo) {
        return menuinfoMapper.selectUserRoleMenu(userRoleVo);
    }

}
