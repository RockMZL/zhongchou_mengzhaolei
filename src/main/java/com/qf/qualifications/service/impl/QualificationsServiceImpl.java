package com.qf.qualifications.service.impl;

import com.qf.qualifications.pojo.Qualifications;
import com.qf.qualifications.mapper.QualificationsMapper;
import com.qf.qualifications.service.QualificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QualificationsServiceImpl implements QualificationsService {
    @Autowired(required = false)
    QualificationsMapper qualificationsMapper;
    @Override
    public List<Qualifications> selectAllQualifications() {
        return qualificationsMapper.selectAllQualifications();
    }

    @Override
    public int insertOneQualifications(Qualifications qualifications) {
        return qualificationsMapper.insertOneQualifications(qualifications);
    }

    @Override
    public int deleteOneQualifications(int qualifyId) {
        return qualificationsMapper.deleteOneQualifications(qualifyId);
    }

    @Override
    public int updateOneQualifications(Qualifications qualifications) {
        return qualificationsMapper.updateOneQualifications(qualifications);
    }

    @Override
    public Qualifications selectOneQualifications(int qualifyId) {
        return qualificationsMapper.selectOneQualifications(qualifyId);
    }

    @Override
    public List<Qualifications> selectLikeAllQualifications(Qualifications qualifications) {
        return qualificationsMapper.selectLikeAllQualifications(qualifications);
    }
}
