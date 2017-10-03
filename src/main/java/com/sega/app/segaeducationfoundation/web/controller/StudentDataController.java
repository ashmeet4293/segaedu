package com.sega.app.segaeducationfoundation.web.controller;

import com.sega.app.segaeducationfoundation.model.StudentDataVO;
import com.sega.app.segaeducationfoundation.service.StudentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/studentdata")
public class StudentDataController {
    @Autowired
    StudentDataService studentDataService;


    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/student")
    public ResponseEntity getUsers() {
        try {

            return ResponseEntity.ok(studentDataService.getAllUsers());

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }


    }


    @RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/student")
    public ResponseEntity saveUserData(@RequestBody StudentDataVO studentDataVO, @RequestParam("employeeName") String employeeName) {
        try {

            return ResponseEntity.ok(studentDataService.saveUser(studentDataVO, employeeName));


        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }

    }

}
