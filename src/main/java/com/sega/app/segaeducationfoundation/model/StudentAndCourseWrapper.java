package com.sega.app.segaeducationfoundation.model;

import com.sega.app.segaeducationfoundation.entities.CoursesEntity;
import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;

public class StudentAndCourseWrapper {
    private StudentDataVO studentDataVO;
    private CoursesVO coursesVO;


    public StudentAndCourseWrapper(StudentDataVO studentDataVO, CoursesVO coursesVO) {
        this.studentDataVO = studentDataVO;
        this.coursesVO = coursesVO;
    }

    public StudentAndCourseWrapper() {
    }

    public StudentDataVO getStudentDataVO() {
        return studentDataVO;
    }

    public void setStudentDataVO(StudentDataVO studentDataVO) {
        this.studentDataVO = studentDataVO;
    }

    public CoursesVO getCoursesVO() {
        return coursesVO;
    }

    public void setCoursesVO(CoursesVO coursesVO) {
        this.coursesVO = coursesVO;
    }
}
