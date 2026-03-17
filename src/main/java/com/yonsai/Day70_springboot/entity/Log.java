package com.yonsai.Day70_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Setter;

// Entity
//  데이터베이스 테이블과 1:1로 매핑 되는 자바 클래스
//  DB테이블을 자바로 옮겨서 작성한 것!
// Hibernate ORM
//  - JPA규칙을 실제로 실행해주는 구현체(엔진) 실행자!
@Entity

public class Log {
	
	@Id 			// primary key설정 ! 할때 객체타입으로 줘야된다!
	@GeneratedValue // DB가 자동으로 번호를 생성
	private Long id;
	
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
