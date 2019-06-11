package com.qf.applyproject.controller;

import com.qf.applyproject.pojo.ApplyProject;
import com.qf.applyproject.service.ApplyProjectService;
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
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ApplyProjectController {
    @Autowired
    ApplyProjectService applyProjectService;

    //添加项目申请
    @RequestMapping("insertApplyProject")
    public Object insertApplyProject(HttpSession session) throws IOException {
        ApplyProject applyProject = (ApplyProject)session.getAttribute("applyProject");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        applyProject.setCreateTime(format);
        return applyProjectService.insertApplyProject(applyProject);
    }

    //存储项目图片及信息
    @RequestMapping("insertApplyProjectSession")
    public Object insertApplyProjectSession(@RequestParam("fileHeader") MultipartFile multipartFile1, @RequestParam("filetails") MultipartFile multipartFile2, HttpSession session, HttpServletRequest request) throws IOException {
        //头图
        String fileHeaderpath = "E:\\IDEAprj\\zhongchou_mengzhaolei\\src\\main\\webapp\\photos\\" + new Date().getTime() + multipartFile1.getOriginalFilename();
        File newFile = new File(fileHeaderpath);
        multipartFile1.transferTo(newFile);
        int i = fileHeaderpath.indexOf("photos");
        String path1 = fileHeaderpath.substring(i);
        //详情图
        String filetailspath = "E:\\IDEAprj\\zhongchou_mengzhaolei\\src\\main\\webapp\\photos\\" + new Date().getTime() + multipartFile2.getOriginalFilename();
        File newFile2 = new File(filetailspath);
        multipartFile2.transferTo(newFile2);
        int i2 = fileHeaderpath.indexOf("photos");
        String path2 = fileHeaderpath.substring(i2);

        String type = request.getParameter("type");
        String projectName = request.getParameter("projectName");
        String intro = request.getParameter("intro");
        String fundingMoney = request.getParameter("fundingMoney");
        int findingMoney1 = fundingMoney != null ? Integer.valueOf(fundingMoney) : 10000;
        String day = request.getParameter("day");
        int day1 = day != null ? Integer.valueOf(day) : 30;
        String selfintrRoduction = request.getParameter("selfintrRoduction");
        String detialEdintroDuction = request.getParameter("detialEdintroDuction");
        String phone = request.getParameter("phone");
        String customerPhone = request.getParameter("customerPhone");
        String accountName = request.getParameter("accountName");
        ApplyProject applyProject = new ApplyProject();
        applyProject.setAccountName(accountName);
        applyProject.setCustomerPhone(customerPhone);
        applyProject.setPhone(phone);
        applyProject.setDetialEdintroDuction(detialEdintroDuction);
        applyProject.setSelfintrRoduction(selfintrRoduction);
        applyProject.setDay(day1);
        applyProject.setFundingMoney(findingMoney1);
        applyProject.setIntro(intro);
        applyProject.setProjectName(projectName);
        applyProject.setType(type);
        applyProject.setProjectHeader(path1);
        applyProject.setProjectetails(path2);
        session.setAttribute("applyProject", applyProject);
        if (applyProject != null)
            return 1;
        return 0;
    }

    @RequestMapping("getAllApplyProject")
    public  Object getAllApplyProject(){
        return applyProjectService.getAllApplyProject();
    }

    @RequestMapping("updateApplyProject")
    public  Object updateApplyProject(@RequestBody ApplyProject applyProject){
        return applyProjectService.updateApplyProject(applyProject);
    }
    @RequestMapping("selectApplyProjectInfo")
    public  Object selectApplyProjectInfo(){
        return applyProjectService.selectApplyProjectInfo();
    }
    @RequestMapping("getOneApplyProject")
    public  Object getOneApplyProject(@RequestParam int projectId){
        return applyProjectService.getOneApplyProject(projectId);
    }
    @RequestMapping("updateFundingMoney")
    public Object updateFundingMoney(@RequestParam int totalNumber,@RequestParam int projectId){
        ApplyProject oneApplyProject = applyProjectService.getOneApplyProject(projectId);
        Integer raiseMoney = oneApplyProject.getRaiseMoney();
        raiseMoney = raiseMoney + totalNumber;
        oneApplyProject.setRaiseMoney(raiseMoney);
        return applyProjectService.updateApplyProject(oneApplyProject);
    }
}
