package com.sega.app.segaeducationfoundation.config;

import com.sega.app.segaeducationfoundation.repository.StudentDataRepository;
import com.sega.app.segaeducationfoundation.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
//
//@EnableGlobalMethodSecurity(securedEnabled = true)
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("\n\nM at User Details SErvice for authentication");
        auth.userDetailsService(userDetailsService);

    }

    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("\n\nM at User Details Configure for authentication");

        http.csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("**/studentdata/**").permitAll()
                .antMatchers("**/user/**").permitAll()
                .antMatchers("**/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
                .formLogin()
//                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout")
                .permitAll();
    }

//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user")
//                .password("user")
//                .roles("USER")
//                .and()
//                .withUser("admin")
//                .password("admin")
//                .roles("ADMIN");
//    }

}
