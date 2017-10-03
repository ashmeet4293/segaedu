package com.sega.app.segaeducationfoundation.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String role;

    @ManyToMany(mappedBy = "roles")
    private List<StudentDataEntity> studentDataEntityList = new ArrayList<StudentDataEntity>();

    public Role() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<StudentDataEntity> getStudentDataEntityList() {
        return studentDataEntityList;
    }

    public void setStudentDataEntityList(List<StudentDataEntity> studentDataEntityList) {
        this.studentDataEntityList = studentDataEntityList;
    }
}
