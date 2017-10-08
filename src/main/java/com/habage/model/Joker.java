package com.habage.model;

import javax.persistence.*;

public class Joker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String gradenm;

    private Integer teacherid;

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
     * @return gradenm
     */
    public String getGradenm() {
        return gradenm;
    }

    /**
     * @param gradenm
     */
    public void setGradenm(String gradenm) {
        this.gradenm = gradenm;
    }

    /**
     * @return teacherid
     */
    public Integer getTeacherid() {
        return teacherid;
    }

    /**
     * @param teacherid
     */
    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }
}