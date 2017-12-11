package com.sega.app.segaeducationfoundation.service;

import com.sega.app.segaeducationfoundation.entities.CoursesEntity;
import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
import com.sega.app.segaeducationfoundation.model.CoursesVO;
import com.sega.app.segaeducationfoundation.model.StudentAndCourseWrapper;
import com.sega.app.segaeducationfoundation.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {
    @Autowired
    CoursesRepository coursesRepository;

    public CoursesEntity insertStudentWithCourse(StudentAndCourseWrapper studentAndCourseWrapper) {
        CoursesEntity coursesEntity = new CoursesEntity(studentAndCourseWrapper.getCoursesVO());


        StudentDataEntity studentDataEntity = new StudentDataEntity(studentAndCourseWrapper.getStudentDataVO());
        String employeeName = "ashmeet";

        studentDataEntity.setRegisteredBy(employeeName);
        java.util.Date utilDate = new java.util.Date();
        studentDataEntity.setRegisteredDate(utilDate);
        studentDataEntity.setLastModifiedBy(employeeName);
        studentDataEntity.setLastModifiedDate(utilDate);

        coursesEntity.setStudentDataEntity(studentDataEntity);


        CoursesEntity savedData = coursesRepository.save(coursesEntity);

        System.out.println("\n \n \n \n \n STUDENT COURSE ENTITY : " + coursesEntity.getName());
        System.out.println("\n \n \n \n \n  StudentDATAENTITY: " + studentDataEntity.getUserName());
        return savedData;


    }
    public CoursesEntity insertCourses(CoursesVO coursesVO) {
        CoursesEntity coursesEntity = new CoursesEntity(coursesVO);


//        StudentDataEntity studentDataEntity = new StudentDataEntity(studentAndCourseWrapper.getStudentDataVO());
        String employeeName = "ashmeet";

//        studentDataEntity.setRegisteredBy(employeeName);
//        java.util.Date utilDate = new java.util.Date();
//        studentDataEntity.setRegisteredDate(utilDate);
//        studentDataEntity.setLastModifiedBy(employeeName);
//        studentDataEntity.setLastModifiedDate(utilDate);
//
//        coursesEntity.setStudentDataEntity(studentDataEntity);


        CoursesEntity savedData = coursesRepository.save(coursesEntity);

        System.out.println("\n \n \n \n \n STUDENT COURSE ENTITY : " + coursesEntity.getName());
//        System.out.println("\n \n \n \n \n  StudentDATAENTITY: " + studentDataEntity.getUserName());
        return savedData;


    }
}
