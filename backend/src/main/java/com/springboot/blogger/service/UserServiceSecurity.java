package com.springboot.blogger.service;

import com.springboot.blogger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.blogger.model.User;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("UserDetailsService")
public class UserServiceSecurity implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        return new User(user.getUsername(),user.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
    }
}
