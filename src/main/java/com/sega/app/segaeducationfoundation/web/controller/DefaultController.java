package com.sega.app.segaeducationfoundation.web.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="")
public class DefaultController {
    @RequestMapping()
    public String index(){
        return "Hello World m spring boot ";
    }

//    @Secured("ROLE_ADMIN")
    @RequestMapping("/user")
    public String test(){
        return "Role User";
    }

//    @Secured({"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping("/admin")
    public String adminUser(){
        return "Role Admin";
    }
}
