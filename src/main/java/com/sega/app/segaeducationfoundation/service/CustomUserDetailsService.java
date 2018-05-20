//package com.sega.app.segaeducationfoundation.service;
//
//import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
//import com.sega.app.segaeducationfoundation.model.CustomUserDetails;
//import com.sega.app.segaeducationfoundation.repository.StudentDataRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    StudentDataRepository studentDataRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        System.out.println("the typed username is : "+username);
//        StudentDataEntity studentDataEntity=studentDataRepository.findByUserName(username);
//        if(studentDataEntity==null){
//            System.out.println("Username is null");
//            throw new UsernameNotFoundException("USer Not Found");
//        }
//        System.out.println("\n USERNAME IS NOT NULL : "+studentDataEntity.getEmail());
//        return new CustomUserDetails(studentDataEntity);
//    }
//}