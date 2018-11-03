package com.springboot.blogger.service;
import com.springboot.blogger.repository.BlogRepository;
import com.springboot.blogger.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogrepository;

    //save blog
    public Blog addBlog(Blog blog) {
        return blogrepository.save(blog);
    }

    //return all blogs
    public List<Blog> findAll() {
        return blogrepository.findAll();
    }

    //return a blog by id
    //public Blog finOne(Long bid) {
      //  return blogrepository.findOne(bid);
    //}

    //delete blog
    public void delete(Blog blog) {
        blogrepository.delete(blog);
    }
}
