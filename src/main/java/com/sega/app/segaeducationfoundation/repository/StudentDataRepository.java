package com.sega.app.segaeducationfoundation.repository;

import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentDataRepository extends JpaRepository<StudentDataEntity, Integer>{
//    User findByName(String name);
    StudentDataEntity findByEmail(String username);

StudentDataEntity findByUserName(String username);
//    StudentDataEntity findByName(String username);
}
