package com.sega.app.segaeducationfoundation.model;

import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;

public class CustomUserDetails extends StudentDataEntity implements UserDetails {

    private StudentDataEntity studentDataEntity;

    public CustomUserDetails(StudentDataEntity studentDataEntity) {
        System.out.println("\n USER ROLES : "+studentDataEntity.getRoles());
        this.studentDataEntity = studentDataEntity;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        System.out.println("\n ROLES: " + studentDataEntity.getRoles());
        Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        String roles = studentDataEntity.getRoles();

        authorities.add(new SimpleGrantedAuthority(roles));
        System.out.println("AUTHORITIES ARE : " + authorities);
        return authorities;

    }

    @Override
    public String getPassword() {
        System.out.println("PASSWORD : " + studentDataEntity.getPassword());
        return studentDataEntity.getPassword();
    }

    @Override
    public String getUsername() {
        System.out.println("\n MIRACLE USERNAME : "+studentDataEntity.getUserName());

        return studentDataEntity.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
