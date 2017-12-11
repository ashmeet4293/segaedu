package com.sega.app.segaeducationfoundation.repository;

import com.sega.app.segaeducationfoundation.entities.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<CoursesEntity, Integer>{
}
