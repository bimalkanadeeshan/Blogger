package com.springboot.blogger.controller;

import com.springboot.blogger.model.Reviewer;
import com.springboot.blogger.service.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReviewerController {

  @Autowired
  private ReviewerService reviewerService;

  @RequestMapping("/reviewers")
  public List<Reviewer> findAllReviewers() {
      return reviewerService.findAll();
  }
}
