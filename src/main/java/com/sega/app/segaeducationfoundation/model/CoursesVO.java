package com.sega.app.segaeducationfoundation.model;

import com.sega.app.segaeducationfoundation.entities.CoursesEntity;

public class CoursesVO {

    private Integer courseId;
    private String name;
    private String duration;
    private Integer fee;

    public CoursesVO() {
    }

    public CoursesVO(CoursesEntity coursesEntity) {
        this.name=coursesEntity.getName();
        this.duration=coursesEntity.getDuration();
        this.fee=coursesEntity.getFee();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }
}
