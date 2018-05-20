//package com.sega.app.segaeducationfoundation.model;
//
//import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.HashSet;
//
//public class CustomUserDetails extends StudentDataEntity implements UserDetails {
//
//    private StudentDataEntity studentDataEntity;
//
//    public CustomUserDetails(StudentDataEntity studentDataEntity) {
//        System.out.println("\n USER ROLES : "+studentDataEntity.getRoles());
//        this.studentDataEntity = studentDataEntity;
//    }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//
//        System.out.println("\n ROLES: " + studentDataEntity.getRoles());
//        Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
//        String roles = studentDataEntity.getRoles();
//
//
//        String[] parts = roles.split(",");
//        String part1 = parts[0]; // 004
//        String part2 = parts[1]; // 034556
//
//
//        authorities.add(new SimpleGrantedAuthority(part1));
//        authorities.add(new SimpleGrantedAuthority(part2));
//
//        for(GrantedAuthority autho: authorities) {
//            System.out.println("AUTHORITIES ARE : " + autho.getAuthority());
//        }
//        return authorities;
//
//    }
//
//    @Override
//    public String getPassword() {
//        System.out.println("PASSWORD : " + studentDataEntity.getPassword());
//        return studentDataEntity.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        System.out.println("\n MIRACLE USERNAME : "+studentDataEntity.getUserName());
//
//        return studentDataEntity.getUserName();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
