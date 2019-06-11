package com.qf.qualifications.controller;

import com.qf.qualifications.pojo.Qualifications;
import com.qf.qualifications.service.QualificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QualificationsController {
    @Autowired
    QualificationsService qualificationsService;

    //查询所有
    @RequestMapping("getAllQualifications")
    public Object getAllQualifications(){
        return qualificationsService.selectAllQualifications();
    }
    //新增
    @RequestMapping("addQualifications")
    public  Object addQualifications(@RequestBody Qualifications qualifications){
        return qualificationsService.insertOneQualifications(qualifications);
    }
    //查询单个
    @RequestMapping("selectOneQualifications")
    public Object selectQualifications(@RequestParam int qualifyId){
        return qualificationsService.selectOneQualifications(qualifyId);
    }
    //修改项目信息
    @RequestMapping("updateQualifications")
    public Object updateQualifications(@RequestBody Qualifications qualifications){
        return qualificationsService.updateOneQualifications(qualifications);
    }
    //删除项目信息
    @RequestMapping("deleteQualifications")
    public Object deleteQualifications(@RequestParam int qualifyId){
        return qualificationsService.deleteOneQualifications(qualifyId);
    }
    //模糊查询
    @RequestMapping("selectLikeAllQualifications")
    public Object selectLikeAllQualifications(@RequestParam String message){
        Qualifications qualifications = new Qualifications();
        qualifications.setQualifyName(message);
        return qualificationsService.selectLikeAllQualifications(qualifications);
    }



}
