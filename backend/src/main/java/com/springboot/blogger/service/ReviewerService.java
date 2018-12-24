package com.springboot.blogger.service;

import com.springboot.blogger.model.Reviewer;

import java.util.List;
import java.util.Optional;

public interface ReviewerService {
    List<Reviewer> findAll();
    Optional<Reviewer> findById(int id);
}
