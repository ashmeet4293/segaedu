package com.sega.app.segaeducationfoundation.web.controller;

import com.sega.app.segaeducationfoundation.common.SegaEduException;
import com.sega.app.segaeducationfoundation.model.StudentDataResponse;
import com.sega.app.segaeducationfoundation.model.StudentDataVO;
import com.sega.app.segaeducationfoundation.service.StudentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/studentdata")
public class StudentDataController {
    @Autowired
    StudentDataService studentDataService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/student")
    public ResponseEntity getUsers() {
        try {
//            System.out.println();
            return ResponseEntity.ok(studentDataService.getAllUsers());

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/student/{id}")
    public ResponseEntity getStudentById(@PathVariable("id") Integer userId) {
        try {

            return ResponseEntity.ok(studentDataService.getUserById(userId));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/student/{roleId}")
//    public ResponseEntity saveUserData(@RequestBody StudentDataVO studentDataVO, @RequestParam("employeeName") String employeeName) {
        public ResponseEntity saveUserData(@RequestBody StudentDataVO studentDataVO, @PathVariable("roleId") Integer roleId) {
        try {

            if(roleId==null){
                throw  new SegaEduException("Id not Found");
            }

            return ResponseEntity.ok(studentDataService.saveUser(studentDataVO, roleId,"employeeName"));


        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }

    }


//    @GetMapping("/checkUsername")
//    public boolean checkUsername(@RequestParam("value") String value) {
//        return this.existingUsernames.contains(value);
//    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET,  value = "/student/checkEmail")
    public Boolean checkEmailValidation(@RequestParam (value="value")String email) {
           if (studentDataService.checkEmailValidity(email)) {
               System.out.println("Available");
               return true;
           }else{
               System.out.println("Email Not Availbale");
               return false;

           }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.PUT, produces = "application/json", value = "/student/{id}")
    public ResponseEntity updateUserData(@RequestBody StudentDataVO studentDataVO, @PathVariable("id") Integer studentId) {
        try {
//            LOGGER.info("Received request to Update the Employee : ", employeeInfoVO+" with EmployeeId : "+employeeId+" by Employee : "+employeeName);

            StudentDataResponse response = studentDataService.updateStudentById(studentDataVO, studentId, "ashmeet");
            if (response != null) {
                return ResponseEntity.ok(response);

            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with UserId : " + studentId + " Cannot Updated !");

            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.DELETE, produces = "application/json", value = "/student/{id}")
    public ResponseEntity deleteUserById(@PathVariable("id") Integer studentId) {
        try {
//            LOGGER.info("Received request to Delete the Employee  with EmployeeId : "+employeeId);
            Boolean response = studentDataService.deleteEmployeeById(studentId);
            if (response) {
                return ResponseEntity.ok(response);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee with UserId : " + studentId + " Not found !");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }


    }


}
