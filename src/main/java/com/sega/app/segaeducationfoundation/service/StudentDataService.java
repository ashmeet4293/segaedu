package com.sega.app.segaeducationfoundation.service;

import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
import com.sega.app.segaeducationfoundation.model.StudentDataResponse;
import com.sega.app.segaeducationfoundation.model.StudentDataVO;
import com.sega.app.segaeducationfoundation.repository.StudentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDataService {
    @Autowired
    StudentDataRepository studentDataRepository;

    public StudentDataResponse saveUser(StudentDataVO studentDataVO, String employeeName) {

        StudentDataEntity studentDataEntity = new StudentDataEntity(studentDataVO);
        studentDataEntity.setRegisteredBy(employeeName);
        java.util.Date utilDate = new java.util.Date();
        studentDataEntity.setRegisteredDate(utilDate);
        studentDataEntity.setLastModifiedBy(employeeName);
        studentDataEntity.setLastModifiedDate(utilDate);

        StudentDataEntity savedUser = studentDataRepository.save(studentDataEntity);
        StudentDataResponse response = new StudentDataResponse(savedUser);
        return response;
    }

    public List<StudentDataResponse> getAllUsers() {
        List<StudentDataEntity> userDataEntityList = studentDataRepository.findAll();
        List<StudentDataResponse> userList = new ArrayList<>();

        for (StudentDataEntity userDataEntity : userDataEntityList) {

            StudentDataResponse response = new StudentDataResponse(userDataEntity);
            userList.add(response);
//            response.setInstallationAddress(convertStringToAddress(userDataEntity.getInstallationAddress()));
//            response.setAddress(convertStringToAddress(userDataEntity.getAddress()));
        }
        return userList;
    }

}
