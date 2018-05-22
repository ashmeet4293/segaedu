package com.sega.app.segaeducationfoundation.service;

import com.google.gson.Gson;
import com.sega.app.segaeducationfoundation.common.SegaEduException;
import com.sega.app.segaeducationfoundation.entities.Role;
import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
import com.sega.app.segaeducationfoundation.model.AddressVO;
import com.sega.app.segaeducationfoundation.model.StudentDataResponse;
import com.sega.app.segaeducationfoundation.model.StudentDataVO;
import com.sega.app.segaeducationfoundation.repository.RoleRepository;
import com.sega.app.segaeducationfoundation.repository.StudentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDataService {
    @Autowired
    StudentDataRepository studentDataRepository;
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    RoleService roleService;


    public StudentDataResponse saveUser(StudentDataVO studentDataVO, Integer roleId, String employeeName) throws  SegaEduException {

        StudentDataEntity studentDataEntity = new StudentDataEntity(studentDataVO);
        studentDataEntity.setRegisteredBy(employeeName);
        java.util.Date utilDate = new java.util.Date();
        studentDataEntity.setRegisteredDate(utilDate);
        studentDataEntity.setLastModifiedBy(employeeName);
        studentDataEntity.setLastModifiedDate(utilDate);
        studentDataEntity.setPermanentAddress(convertAddressToString(studentDataVO.getPermanentAddress()));

        Role selectedRole=roleService.getRoleById(roleId);
        if(selectedRole==null){
            throw new SegaEduException("Role id not found in database");
        }

        List<Role> roles=new ArrayList<>();
        roles.add(selectedRole);

        studentDataEntity.setRoles(roles);

        StudentDataEntity savedUser = studentDataRepository.save(studentDataEntity);
        StudentDataResponse response = new StudentDataResponse(savedUser);
        response.setPermanentAddress(convertStringToAddress(savedUser.getPermanentAddress()));
        return response;
    }

    public List<StudentDataResponse> getAllUsers() {
        List<StudentDataEntity> userDataEntityList = studentDataRepository.findAll();
        List<StudentDataResponse> userList = new ArrayList<>();

        for (StudentDataEntity userDataEntity : userDataEntityList) {

            StudentDataResponse response = new StudentDataResponse(userDataEntity);
            response.setPermanentAddress(convertStringToAddress(userDataEntity.getPermanentAddress()));

            userList.add(response);
//            response.setInstallationAddress(convertStringToAddress(userDataEntity.getInstallationAddress()));
//            response.setAddress(convertStringToAddress(userDataEntity.getAddress()));
        }
        return userList;
    }
    public StudentDataResponse getUserById(Integer id){
        StudentDataEntity studentDataEntity=studentDataRepository.findOne(id);
        if(studentDataEntity!=null){

            StudentDataResponse response = new StudentDataResponse(studentDataEntity);
            response.setPermanentAddress(convertStringToAddress(studentDataEntity.getPermanentAddress()));

            return response;
        }else{
            return null;
        }
    }
    public Boolean checkEmailValidity(String email){

        StudentDataEntity studentDataEntity=studentDataRepository.findByEmail(email);
        if(studentDataEntity!=null){
            return true;
        }
        return false;
    }

    public StudentDataResponse updateStudentById(StudentDataVO studentDataVO, Integer studentId, String employeeName) {
        StudentDataEntity studentDataEntity = studentDataRepository.findOne(studentId);
        if (studentDataEntity != null) {



            studentDataEntity.setStudentDataVO(studentDataVO);
            studentDataEntity.setRegisteredBy(employeeName);
            java.util.Date utilDate = new java.util.Date();
            studentDataEntity.setRegisteredDate(utilDate);
            studentDataEntity.setLastModifiedBy(employeeName);
            studentDataEntity.setLastModifiedDate(utilDate);

            studentDataEntity.setPermanentAddress(convertAddressToString(studentDataVO.getPermanentAddress()));


            StudentDataEntity savedUser = studentDataRepository.save(studentDataEntity);
            StudentDataResponse response = new StudentDataResponse(savedUser);
            response.setPermanentAddress(convertStringToAddress(savedUser.getPermanentAddress()));
            return response;

        }
        return null;
    }

    public Boolean deleteEmployeeById(Integer studentId) {
        StudentDataEntity studentDataEntity=studentDataRepository.findOne(studentId);
        if(studentDataEntity == null){
            return false;
        }else{
            studentDataRepository.delete(studentDataEntity);
            return true;
        }
    }
    public String convertAddressToString(AddressVO addressVO) {
        Gson gson = new Gson();
        String json = gson.toJson(addressVO);
        return json;

    }

    public AddressVO convertStringToAddress(String jsonString) {
        Gson gson = new Gson();
        AddressVO addressVO = gson.fromJson(jsonString, AddressVO.class);
        return addressVO;

    }
//

}
