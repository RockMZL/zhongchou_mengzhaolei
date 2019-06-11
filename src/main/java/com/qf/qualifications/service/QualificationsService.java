package com.qf.qualifications.service;

import com.qf.qualifications.pojo.Qualifications;

import java.util.List;

public interface QualificationsService {
    //查询所有资质
    public List<Qualifications> selectAllQualifications();
    //添加单个资质
    public int  insertOneQualifications(Qualifications qualifications);
    //删除单个资质
    public int deleteOneQualifications(int qualifyId);
    //修改资质信息
    public int updateOneQualifications(Qualifications qualifications);
    //查询单个资质信息
    public Qualifications selectOneQualifications(int qualifyId);
    //模糊查询
    public List<Qualifications> selectLikeAllQualifications(Qualifications qualifications);
}
