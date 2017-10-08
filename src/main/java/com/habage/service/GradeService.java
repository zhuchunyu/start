package com.habage.service;

import com.habage.mapper.GradeMapper;
import com.habage.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    public Grade getbyid_mapper(Integer id) {
        return gradeMapper.selectByPrimaryKey(id);
    }

    public Grade getbyid_annotation_sql(Integer id) {
        return gradeMapper.getbyid_annotation_sql(id);
    }

    public Grade getbyid_xml_sql(Integer id) {
        return gradeMapper.getbyid_xml_sql(id);
    }

    public List<Grade> list_xml_sql(Grade grade) {
        return gradeMapper.list_xml_sql(grade);
    }
}
