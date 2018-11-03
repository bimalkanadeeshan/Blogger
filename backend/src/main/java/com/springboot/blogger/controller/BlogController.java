package com.springboot.blogger.controller;
import com.springboot.blogger.service.BlogService;
import com.springboot.blogger.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/blog")
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/blog")
    public void addBlog(@RequestBody Blog blog) {
        blogService.addBlog(blog);
    }
}
