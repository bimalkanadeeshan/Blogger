package com.springboot.blogger.service;

import com.springboot.blogger.model.User;

public interface UserService {
    User findOne(String username);
    void save(User user);
}
