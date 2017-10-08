package com.habage.model;

import javax.persistence.*;
import java.io.Serializable;

public class Grade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "grade_nm")
    private String gradeNm;

    @Column(name = "teacher_id")
    private Integer teacherId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return grade_nm
     */
    public String getGradeNm() {
        return gradeNm;
    }

    /**
     * @param gradeNm
     */
    public void setGradeNm(String gradeNm) {
        this.gradeNm = gradeNm;
    }

    /**
     * @return teacher_id
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * @param teacherId
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}