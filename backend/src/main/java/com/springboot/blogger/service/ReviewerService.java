package com.springboot.blogger.service;

import com.springboot.blogger.model.Reviewer;

import java.util.List;

public interface ReviewerService {
    List<Reviewer> findAll();
}
