package com.sega.app.segaeducationfoundation.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
    private Integer id;

    @Column(name="Authorities")
    private String role;

    @ManyToMany(mappedBy = "roles")
    private List<StudentDataEntity> studentDataEntityList = new ArrayList<StudentDataEntity>();

    public Role(Integer id) {
        this.id=id;

    }
    public Role(){

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
