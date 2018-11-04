package com.springboot.blogger.repository;
import com.springboot.blogger.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Optional<Blog> findById(@Param("bid") Integer bid);
}
