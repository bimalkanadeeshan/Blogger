package com.springboot.blogger.controller;

import com.springboot.blogger.model.Reviewer;
import com.springboot.blogger.service.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ReviewerController {

  @Autowired
  private ReviewerService reviewerService;

  //@PreAuthorize("hasRole('admin')")
  @RequestMapping("/reviewer")
  public List<Reviewer> findAllReviewers() {
      return reviewerService.findAll();
  }

 // @PreAuthorize("hasRole('admin')")
  @RequestMapping("/reviewer/{id}")
  public Optional<Reviewer> findReviewer(@PathVariable int id) {
      return reviewerService.findById(id);
  }

  //@PreAuthorize("hasRole('admin')")
  @RequestMapping(method=RequestMethod.POST,value="/reviewer")
  public void saveReviewer(@RequestBody Reviewer reviewer){
      reviewerService.save(reviewer);
  }

//  @PreAuthorize("hasRole('admin')")
  @RequestMapping(method = RequestMethod.DELETE, value = "/reviewer/{id}")
  public void deleteReviewer(@PathVariable int id) {
      reviewerService.delete(id);
  }

 // @PreAuthorize("hasRole('admin')")
  @RequestMapping(method = RequestMethod.PUT, value = "/reviewer/{id}")
  public void editReviewer(@RequestBody Reviewer reviewer, @PathVariable int id) {
      Reviewer r = reviewerService.findById(id).get();
      if(r != null) {
          r.setName(reviewer.getName());
          r.setOrganization(reviewer.getOrganization());
          r.setPosition(reviewer.getPosition());
          reviewerService.edit(r);
      }
  }
}
