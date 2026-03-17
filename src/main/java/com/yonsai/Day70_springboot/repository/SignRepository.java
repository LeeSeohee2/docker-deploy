package com.yonsai.Day70_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yonsai.Day70_springboot.entity.Sign;

public interface SignRepository 
			extends JpaRepository<Sign, Long>{

}
