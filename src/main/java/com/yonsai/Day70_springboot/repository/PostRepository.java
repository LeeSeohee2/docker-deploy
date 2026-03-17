package com.yonsai.Day70_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yonsai.Day70_springboot.entity.Post;

// Entity는 1개당 하나의 Repository가 있어야된다.
// Entity는 데이터베이스 테이블을 관리하고 객체를 데이터베이스로 보내고
//         데이터베이스에서 가져오고 하는 타입을 정의한 클래스!
public interface PostRepository 
			extends JpaRepository<Post, Long>{

}
