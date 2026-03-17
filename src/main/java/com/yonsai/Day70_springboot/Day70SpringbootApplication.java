package com.yonsai.Day70_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day70SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day70SpringbootApplication.class, args);
	}
}

/* 
 *  스프링부트 라이브러리 
 *   spring web
 *    - 웹서버 + 컨트롤러를 만들기 위해서 필수적인 라이브러리!
 *    - 이게 없으면 url요청도 못받고 서버도 실행 안된다.
 *    - 톰캣,Controller,Get,PostMapping...
 *    
 *   Lombok 
 *    - 코드를 덜 쓰게 해주는 도구!
 *    - 생성자, get,setter ...
 *    
 *   Spring Data JPA
 *    - SQL없이 DB를 다루게 해주는 라이브러리
 *    
 *   MySql 
 *    - 자바와 mysql을 연결해주는 통역기
 *    - 연동에 필수적인 라이브러리 단! 폴더명이나 클래스명들
 *      확인 (특히 최신버전들은)
 *   
 *   Thymeleaf
 *    - HTML 화면 만드는 라이브러리
 *    - 자바코드를 이용해서 동적으로 페이지를 만들준다. 
 * 
 *   spring boot devtools
 *    - 서버 자동 재시작 도구!
 * 
 * 	 자유롭게 실습 시간을 가지기!
 *    1. 강의교안에 있는 실습 구현하기
 *    2. 오늘 수업한 내용 정리하기 
 *    3. 남의 페이지 구경하기!
 *    
 * 
 * 
 * 
 */



