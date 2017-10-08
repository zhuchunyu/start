package com.habage.test;

import com.alibaba.fastjson.JSON;
import com.habage.Application;
import com.habage.model.Grade;
import com.habage.service.GradeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(Application.class)
public class GradeServiceTest {

    @Autowired
    private GradeService gradeService;

    @Test
    public void test() {
        System.out.println("hello test");

        Grade grade = gradeService.getbyid_annotation_sql(2);
        System.out.println(JSON.toJSONString(grade));
    }
}
