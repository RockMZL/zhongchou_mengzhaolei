package com.qf.userinfo.controller;

import com.qf.userinfo.pojo.UserInfo;
import com.qf.userinfo.service.UserInfoService;
import com.qf.userinfo.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    //查询所有用户
    @RequestMapping("getAllUserInfo")
    public Object getAllUserInfo() {
        return userInfoService.selectAll();
    }

    //登录 根据字段查询
    @RequestMapping("userLogin")
    public Object login(@RequestParam String accounts, String userpass, String type, HttpSession session) {
        UserInfo userinfo = new UserInfo();
        userinfo.setAccounts(accounts);
        userinfo.setUserPass(userpass);
        userinfo.setType(type);
        UserInfo userinfo1 = this.userInfoService.selectOne(userinfo);
        if (userinfo1 != null) {
            session.setAttribute("user", userinfo1);
            return userinfo1;
        }
        return 0;
    }

    //根据对象查询
    @RequestMapping("checkLogin")
    public Boolean checkLogin(@RequestBody UserInfo userinfo) {
        List<UserInfo> userinfos = this.userInfoService.selectLike(userinfo);
        if (userinfos != null) {
            return true;
        }
        return false;
    }


    @RequestMapping(value = "registUser", method = RequestMethod.POST)
    public Object doRegist(@Valid @RequestBody UserInfoVo userInfoVo, BindingResult result) {
        Map<String, String> map = new HashMap<String, String>();
        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError error : fieldErrors
            ) {
                //System.out.println(error.getField() + "*" + error.getDefaultMessage());
                map.put(error.getField(), error.getDefaultMessage());
            }
            return map;
        }
        UserInfo userinfo = new UserInfo();
        userinfo.setUserName(userInfoVo.getUserName());
        userinfo.setUserPass(userInfoVo.getUserPass());
        userinfo.setAccounts(userInfoVo.getAccounts());
        userinfo.setEmail(userInfoVo.getEmail());
        userinfo.setType(userInfoVo.getType());
        userinfo.setStatus(userInfoVo.getStatus());
        this.userInfoService.insertUserinfo(userinfo);
        return true;
    }

    @RequestMapping("getOneById")
    public Object getOneById(@RequestParam int userId) {
        UserInfo userinfo = userInfoService.selectOneById(userId);
        if (userinfo != null) {
            return userinfo;
        } else {
            return "查询用户不存在";
        }
    }

    @RequestMapping("updateUserInfo")
    public Object updateUserInfo(@RequestBody UserInfo userinfo) {
        int i = userInfoService.updateUserinfo(userinfo);
        if (i == 0)
            return "修改失败";
        return true;
    }

    @RequestMapping("deleteUserInfo")
    public Object deleteUserInfo(@RequestParam int userId) {
        int i = userInfoService.deleteUserinfo(userId);
        if (i == 0)
            return "删除失败";
        return "删除成功";

    }

    //模糊查询
    @RequestMapping("selectLikeAllUser")
    public Object selectLikeAllUser(@RequestParam String message) {
        UserInfo userinfo = new UserInfo();
        userinfo.setUserName(message);
        userinfo.setEmail(message);
        userinfo.setAccounts(message);
        userinfo.setUserPass(message);
        List<UserInfo> userinfos = userInfoService.selectLike(userinfo);
        if (userinfos.size() > 0)
            return userinfos;
        return false;
    }


}
