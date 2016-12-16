package com.anh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anh.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);

}
