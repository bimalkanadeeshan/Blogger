package com.springboot.blogger.controller;

import com.springboot.blogger.config.JwtTokenUtil;
import com.springboot.blogger.model.ApiResponse;
import com.springboot.blogger.model.AuthToken;
import com.springboot.blogger.model.LoginUser;
import com.springboot.blogger.model.User;
import com.springboot.blogger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @RequestMapping(method = RequestMethod.POST, value = "/user/login")
    public ApiResponse<AuthToken> register(@RequestBody LoginUser loginUser) throws AuthenticationException {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
        User user = userService.findOne(loginUser.getUsername());
        String token = jwtTokenUtil.generateToken(user);
        return new ApiResponse<>(200, "success",new AuthToken(token, user.getUsername()));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/register")
    public ApiResponse register(@RequestBody User user) {
        if(userService.findOne(user.getUsername()).equals(user.getUsername())) {
            return new ApiResponse(200, "success",new AuthToken("User Already exist",user.getUsername()));
        }
        userService.save(user);
        return new ApiResponse(200, "success",new AuthToken("User created",user.getUsername()));
    }
}
