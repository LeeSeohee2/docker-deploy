package com.yonsai.Day70_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data  // toString,get,setter 한꺼번에 생성
	   // outline창을 꼭 켜서 확인하기!
public class Post {
	@Id    //기본키 설정꼭 해야된다.
	
	//mysql 에서 auto_increment 설정 방법
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String content;
}
