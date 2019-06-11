package com.qf.realname.controller;

import com.qf.realname.pojo.RealName;
import com.qf.userinfo.pojo.UserInfo;
import com.qf.realname.service.RealNameService;
import com.qf.utils.SendEmail;
import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
public class RoleNameController {
    @Autowired
    RealNameService realNameService;
    @RequestMapping("insertRealNameSystem")
    public Object insertRealNameSystem(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request, HttpSession session) throws IOException {
        String realName = request.getParameter("realName");
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        UserInfo user = (UserInfo) session.getAttribute("user");
        String accounts = user.getAccounts();
        String path = "E:\\IDEAprj\\zhongchou_mengzhaolei\\src\\main\\webapp\\photos\\" + new Date().getTime() + multipartFile.getOriginalFilename();
        //文件上传
        File newFile = new File(path);
        multipartFile.transferTo(newFile);
        //创建审核信息
        RealName realName1 = new RealName();
        realName1.setAccountName(accounts);
        realName1.setIdCard(idCard);
        realName1.setIdPhoto(path);
        realName1.setPhone(phone);
        realName1.setRealName(realName);
        return realNameService.insertOneRealName(realName1);
    }
    @RequestMapping("getAllRealName")
    public Object getAllRealName(){
        return realNameService.getAllRealName();
    }
    @RequestMapping("updateRealName")
    public Object updateRealName(@RequestBody RealName realName){
        return realNameService.updateRealName(realName);
    }
    //获取session里的user信息
    @RequestMapping("getOneRoleName")
    public  Object getOneRoleName(HttpSession session){
        UserInfo user = (UserInfo) session.getAttribute("user");
        String accounts = user.getAccounts();
        return realNameService.selectOneRealName(accounts);
    }
    //邮箱生成验证码
    @RequestMapping("getOneEmail")
    public Object getOneEmail(@RequestParam String targetEmail,HttpSession session) throws EmailException {
        return SendEmail.sendEmail(targetEmail, session);
    }
    @RequestMapping("checkIdentifyingCode")
    public  Object checkIdentifyingCode(@RequestParam String identifyingCode,HttpSession session){
        String identifyingCode1 = (String)session.getAttribute("identifyingCode");
        if(identifyingCode.equals(identifyingCode1))
            return 1;
        return 0;
    }

}
