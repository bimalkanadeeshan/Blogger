package com.springboot.blogger.repository;

import com.springboot.blogger.model.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewerRepository extends JpaRepository<Reviewer, Integer> {
}
