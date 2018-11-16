package com.springboot.blogger.repository;

import com.springboot.blogger.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //User findByUsername(String email);
   // Boolean existsByEmail(String email);
}
