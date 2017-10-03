package com.sega.app.segaeducationfoundation.entities;

import com.sega.app.segaeducationfoundation.model.StudentDataVO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_data")
public class StudentDataEntity {
    @Id
    @GeneratedValue
    @Column(name="student_id")
    private Integer userId;

    @Column(name="NAME")
    private String studentName;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="GENDER")
    private Character gender;

    @Column(name="DOB")
    private String dob;

    @Column(name="FATHER_NAME")
    private String fatherName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PERMANENT_ADDRESS")
    private String permanentAddress;

    @Column(name="TEMPORARY_ADDRESS")
    private String temporaryAddress;

    @Column(name="MOBILE_NO")
    private String mobileNo;

    @Column(name="PHONE_NO")
    private String phoneNo;

    @Column(name="ACADEMIC_DETAILS")
    private String academicDetails;

    @Column(name="COURSE_CODE")
    private String courseCode;

    @Column(name="LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @Column(name="LAST_MODIFIED_DATE")
    private Date lastModifiedDate;

    @Column(name="REGISTERED_BY")
    private String registeredBy;

    @Column(name="REGISTERED_DATE")
    private Date registeredDate;

    @Column(name="ROLES")
    private String roles;

    public StudentDataEntity(StudentDataVO studentDataVO){
        this.studentName=studentDataVO.getStudentName();
        this.userName=studentDataVO.getUserName();
        this.gender=studentDataVO.getGender();
        this.dob=studentDataVO.getDob();
        this.fatherName=studentDataVO.getFatherName();
        this.email=studentDataVO.getEmail();
        this.permanentAddress=studentDataVO.getPermanentAddress();
        this.temporaryAddress=studentDataVO.getTemporaryAddress();
        this.mobileNo=studentDataVO.getMobileNo();
        this.phoneNo=studentDataVO.getPhoneNo();
        this.academicDetails=studentDataVO.getAcademicDetails();
        this.courseCode=studentDataVO.getCourseCode();
        this.roles=studentDataVO.getRoles();

    }

    public StudentDataEntity() {

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

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
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

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
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
}
