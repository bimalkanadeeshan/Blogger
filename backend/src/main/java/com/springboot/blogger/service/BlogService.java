package com.springboot.blogger.service;

import com.springboot.blogger.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAllBlogByUser(long uid);
    List<Blog> findAll();
    Optional<Blog> findOne(int bid);
    Blog save(Blog blog);
    void delete(int bid);
    void edit(Blog blog, int bid);
}
