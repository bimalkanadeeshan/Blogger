package com.springboot.blogger.service;

import com.springboot.blogger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("UserDetailsService")
public class UserServiceSecurity {
    @Autowired
    private UserRepository userRepository;

    //@Override
    //public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       // return userRepository.findByUsername(email);
   // }
}
