package com.sega.app.segaeducationfoundation.entities;

import com.sega.app.segaeducationfoundation.model.CoursesVO;

import javax.persistence.*;

@Entity(name = "course_data")
public class CoursesEntity {
    @Id
    @GeneratedValue
    @Column(name="Course_ID")
    private Integer courseId;

    @Column(name="name")
    private String name;

    @Column(name="duration")
    private String duration;
    @Column(name="fee")
    private Integer fee;

    @ManyToOne(cascade = CascadeType.ALL)
    private StudentDataEntity studentDataEntity;


    public CoursesEntity() {
    }


    public CoursesEntity(CoursesVO coursesVo){
        this.name=coursesVo.getName();
        this.duration=coursesVo.getDuration();
        this.fee=coursesVo.getFee();
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

    public StudentDataEntity getStudentDataEntity() {
        return studentDataEntity;
    }

    public void setStudentDataEntity(StudentDataEntity studentDataEntity) {
        this.studentDataEntity = studentDataEntity;
    }
}
