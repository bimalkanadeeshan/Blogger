package com.springboot.blogger.repository;
import com.springboot.blogger.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Optional<Blog> findById(Integer bid);
    List<Blog> findByUserUid(Long uid);
}
