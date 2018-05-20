package com.sega.app.segaeducationfoundation.model;

import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;

import java.util.Date;

public class StudentDataResponse {

    private Integer userId;
    private String studentName;
    private String userName;
    private String gender;
    private String dob;
    private String fatherName;
    private String email;
    private AddressVO permanentAddress;
//    private String temporaryAddress;
    private String mobileNo;
    private String phoneNo;
    private String academicDetails;
    private String courseCode;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private String registeredBy;
    private Date registeredDate;
    private String roles;
    private String password;


    public StudentDataResponse(StudentDataEntity studentDataEntity){
        this.userId=studentDataEntity.getUserId();
        this.studentName=studentDataEntity.getStudentName();
        this.userName=studentDataEntity.getUserName();
        this.gender=studentDataEntity.getGender();
        this.dob=studentDataEntity.getDob();
        this.fatherName=studentDataEntity.getFatherName();
        this.email=studentDataEntity.getEmail();
//        this.permanentAddress=studentDataEntity.getPermanentAddress();
//        this.temporaryAddress=studentDataEntity.getTemporaryAddress();
        this.mobileNo=studentDataEntity.getEmail();
        this.phoneNo=studentDataEntity.getPhoneNo();
        this.academicDetails=studentDataEntity.getAcademicDetails();
        this.courseCode=studentDataEntity.getCourseCode();
        this.lastModifiedBy=studentDataEntity.getLastModifiedBy();
        this.lastModifiedDate=studentDataEntity.getLastModifiedDate();
        this.registeredBy=studentDataEntity.getRegisteredBy();
        this.registeredDate=studentDataEntity.getRegisteredDate();
        this.roles=studentDataEntity.getRoles();
        this.password=studentDataEntity.getPassword();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressVO getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(AddressVO permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAcademicDetails() {
        return academicDetails;
    }

    public void setAcademicDetails(String academicDetails) {
        this.academicDetails = academicDetails;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
