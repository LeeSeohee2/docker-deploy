package com.yonsai.Day70_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yonsai.Day70_springboot.entity.Log;

// 실제 데이터베이스에 관한 정보를 상속 받아서 
// 사용할 수 있도록 인터페이스에 extends 한다.
// JPA가 기본적으로 CRUD를 제공하기 때문에 상속받는다.

public interface LogRepository 
			//              매핑될 테이블, PK타입
			extends JpaRepository<Log, Long>{

}
