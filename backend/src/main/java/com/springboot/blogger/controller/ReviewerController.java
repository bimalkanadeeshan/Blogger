package com.springboot.blogger.controller;

import com.springboot.blogger.model.Reviewer;
import com.springboot.blogger.service.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ReviewerController {

  @Autowired
  private ReviewerService reviewerService;

  @RequestMapping("/reviewers")
  public List<Reviewer> findAllReviewers() {
      return reviewerService.findAll();
  }

  @RequestMapping("/reviewers/{id}")
  public Optional<Reviewer> findReviewer(@PathVariable int id) {
      return reviewerService.findById(id);
  }

  @RequestMapping(method=RequestMethod.POST,value="/reviewers")
  public void saveReviewer(@RequestBody Reviewer reviewer){
      reviewerService.save(reviewer);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/reviewers/{id}")
  public void deleteReviewer(@PathVariable int id) {
      reviewerService.delete(id);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/reviewers/{id}")
  public void editReeviewer(@RequestBody Reviewer reviewer, @PathVariable int id) {
      Reviewer r = reviewerService.findById(id).get();
      if(r != null) {
          r.setName(reviewer.getName());
          r.setOrganization(reviewer.getOrganization());
          r.setPosition(reviewer.getPosition());
          reviewerService.edit(r);
      }
  }
}
