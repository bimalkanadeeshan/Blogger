package com.springboot.blogger.controller;
import com.springboot.blogger.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/blog")
    public List<Blog> findAllBlogs() {
        return blogService.findAllBlogs();
    }

    @RequestMapping("/blog/{id}")
    public Blog findOneBlog(@PathVariable int id) {
        return blogService.findOneBlog(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/blog")
    public void addBlog(@RequestBody Blog blog) {
        blogService.addBlog(blog);
    }

    @RequestMapping(method = RequestMethod.DELETE, value= "/blog/{id}")
    public void deleteBlog(@PathVariable int id) {
        blogService.deleteBlog(id);
    }
}
