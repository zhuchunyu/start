package com.habage.mapper;

import com.habage.common.HaMapper;
import com.habage.model.Grade;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GradeMapper extends HaMapper<Grade> {

    @Select("select * from grade where id=#{id}")
    @Results({
            @Result(column="id", property="id"),
            @Result(column="grade_nm", property="gradeNm"),
            @Result(column="teacher_id", property="teacherId")
    })
    Grade getbyid_annotation_sql(Integer id);

    Grade getbyid_xml_sql(Integer id);

    List<Grade> list_xml_sql(Grade grade);
}