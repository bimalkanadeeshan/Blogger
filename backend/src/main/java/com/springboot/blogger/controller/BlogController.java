package com.springboot.blogger.controller;
import com.springboot.blogger.model.Blog;
import com.springboot.blogger.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/blog/{bid}")
    public Optional<Blog> findOneBlog(@PathVariable int bid) {
        return blogService.findOne(bid);
    }

    @RequestMapping(method = RequestMethod.DELETE, value= "/blog/{bid}")
    public void deleteBlog(@PathVariable int bid) {
        blogService.delete(bid);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/blog/{bid}")
    public void editBlog(@RequestBody Blog blog, @PathVariable int bid) {
        Blog bl =  blogService.findOne(bid).get();
        if(bl != null) {
            bl.setTitle(blog.getTitle());
            bl.setContent(blog.getContent());
            blogService.edit(bl, bid);
        }
    }
}
