package com.sega.app.segaeducationfoundation.web.controller;

import com.sega.app.segaeducationfoundation.model.CoursesVO;
import com.sega.app.segaeducationfoundation.model.StudentAndCourseWrapper;
import com.sega.app.segaeducationfoundation.service.CoursesService;
import com.sega.app.segaeducationfoundation.service.StudentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/course")
public class CourseController {
    @Autowired
    CoursesService coursesService;


    @RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/studentcourse")
    public ResponseEntity insertCourseAndStudent(@RequestBody StudentAndCourseWrapper studentAndCourseWrapper) {
        try {

            return ResponseEntity.ok(coursesService.insertStudentWithCourse(studentAndCourseWrapper));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }

    }
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/course")
    public ResponseEntity insertCourse(@RequestBody CoursesVO coursesVO) {
        try {

            return ResponseEntity.ok(coursesService.insertCourses(coursesVO));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }

    }
}