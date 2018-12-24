package com.springboot.blogger.service.Imp;

import com.springboot.blogger.model.Reviewer;
import com.springboot.blogger.repository.ReviewerRepository;
import com.springboot.blogger.service.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewerServiceImp implements ReviewerService {

    @Autowired
    private ReviewerRepository reviewerRepository;

    @Override
    public List<Reviewer> findAll() {
        return reviewerRepository.findAll();
    }
}

