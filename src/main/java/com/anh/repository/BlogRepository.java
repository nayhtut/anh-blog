package com.anh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anh.entity.Blog;
import com.anh.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	
	List<Blog> findByUser(User user);
	
}
