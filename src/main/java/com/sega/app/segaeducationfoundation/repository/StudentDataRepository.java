package com.sega.app.segaeducationfoundation.repository;

import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDataRepository extends JpaRepository<StudentDataEntity, Integer>{
}
