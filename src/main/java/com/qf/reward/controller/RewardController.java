package com.qf.reward.controller;

import com.qf.reward.pojo.Reward;
import com.qf.reward.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
public class RewardController {
    @Autowired
    RewardService rewardService;

    @RequestMapping("insertReward")
    public Object insertReward(@RequestBody Reward reward, HttpSession session) {
        String path2 = (String) session.getAttribute("explainPhotoPath");
        reward.setExplainPhoto(path2);
        return rewardService.insertReward(reward);
    }

    @RequestMapping("getOnePhoto")
    public Object getOnePhoto(@RequestParam("explainPhoto") MultipartFile multipartFile, HttpSession httpSession) throws IOException {
        String path = "E:\\IDEAprj\\zhongchou_mengzhaolei\\src\\main\\webapp\\photos\\" + new Date().getTime() + multipartFile.getOriginalFilename();
        //文件上传
        File newFile = new File(path);
        multipartFile.transferTo(newFile);
        int i = path.indexOf("photos");
        String path2 = path.substring(i);
        httpSession.setAttribute("explainPhotoPath", path2);
        return null;
    }
    @RequestMapping("getAllReward")
    public Object getAllReward(@RequestParam String projectName){
        return rewardService.getAllReward(projectName);
    }

    @RequestMapping("getOneReward")
    public Object getOneReward(@RequestParam int rewardId){
        return rewardService.getOneReward(rewardId);
    }


}
