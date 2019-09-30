package com.springboot.blogger.controller;

import com.springboot.blogger.config.JwtTokenUtil;
import com.springboot.blogger.model.AuthToken;
import com.springboot.blogger.model.User;
import com.springboot.blogger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @RequestMapping(method = RequestMethod.POST, value = "/user/login")
    public AuthToken login(@RequestBody User loginUser) throws AuthenticationException {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
        User user = userService.findOne(loginUser.getUsername());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        logger.info(authentication.toString());
        String token = jwtTokenUtil.generateToken(authentication);
        return new AuthToken(token,user.getUsername());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/register")
    public User register(@RequestBody User user) {
/*        if(userService.findOne(user.getUsername()).equals(user.getUsername())) {
            return new ApiResponse(200, "success",new AuthToken("User Already exist",user.getUsername()));
        }*/
        userService.save(user);
        return user;
    }
}
