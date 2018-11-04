package com.springboot.blogger.service;

import com.springboot.blogger.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAll();
    Blog save(Blog blog);
    void delete(int bid);
    Optional<Blog> findOne(int bid);
}
