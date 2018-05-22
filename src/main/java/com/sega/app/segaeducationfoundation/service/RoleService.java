package com.sega.app.segaeducationfoundation.service;

import com.sega.app.segaeducationfoundation.entities.Role;
import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;
import com.sega.app.segaeducationfoundation.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public Role getRoleById(Integer id){
        Role role=roleRepository.findOne(id);
        if(role!=null){
            return role;
        }else{
            return null;
        }
    }
}
