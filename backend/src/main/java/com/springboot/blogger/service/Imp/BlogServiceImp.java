package com.springboot.blogger.service.Imp;

import com.springboot.blogger.model.Blog;
import com.springboot.blogger.repository.BlogRepository;
import com.springboot.blogger.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImp implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findOne(int bid) {
        return blogRepository.findById(bid);
    }

    @Override
    public void delete(int bid) {
        blogRepository.deleteById(bid);
    }

    @Override
    public void edit(Blog blog,int bid) {
        blogRepository.save(blog);
    }
}