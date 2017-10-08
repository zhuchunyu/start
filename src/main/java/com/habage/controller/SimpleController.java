package com.habage.controller;

import com.google.common.collect.Maps;
import com.habage.model.Grade;
import com.habage.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class SimpleController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("/")
    Map<String, Object> home(HttpSession session) {
        Map<String, Object> result = Maps.newHashMap();

        result.put("grade1", gradeService.getbyid_mapper(1));

        result.put("grade2", gradeService.getbyid_annotation_sql(2));

        result.put("grade3", gradeService.getbyid_xml_sql(3));

        Grade grade = new Grade();
        grade.setId(2);
        grade.setGradeNm("smith");
        grade.setTeacherId(2);

        result.put("grade_list", gradeService.list_xml_sql(grade));

        session.setAttribute("grade", grade);

        return result;
    }

    @RequestMapping("/session")
    Map<String, Object> session(HttpSession session) {
        Map<String, Object> result = Maps.newHashMap();

        Grade grade = (Grade) session.getAttribute("grade");
        System.out.println(grade.getClass());

        result.put("grade", grade);

        return result;
    }
}
