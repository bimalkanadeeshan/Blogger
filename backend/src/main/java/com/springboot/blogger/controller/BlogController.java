package com.springboot.blogger.controller;
import com.springboot.blogger.model.Blog;
import com.springboot.blogger.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/blog")
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/blog")
    public Blog addBlog(@RequestBody Blog blog) {
        return blogService.save(blog);
    }

/*
    @RequestMapping("/blog/{id}")
    public Blog findOneBlog(@PathVariable int id) {
        return blogService.findOneBlog(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value= "/blog/{id}")
    public void deleteBlog(@PathVariable int id) {
        blogService.deleteBlog(id);
    }*/
}
