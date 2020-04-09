package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserREpo extends JpaRepository<User, Integer>  {

	User findByUserName(String userName);
}
