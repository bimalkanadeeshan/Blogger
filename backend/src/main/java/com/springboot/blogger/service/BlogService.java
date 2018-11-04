package com.springboot.blogger.service;

import com.springboot.blogger.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog save(Blog blog);

}
