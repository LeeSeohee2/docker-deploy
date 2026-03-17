package com.yonsai.Day70_springboot.dto;

import com.yonsai.Day70_springboot.entity.Post;

import lombok.Data;

//input 태그들이 서버로 전송 되거나 자바 클래스들 끼리
// 데이터를 주고 받을 때 컨트롤러에서 서비스로 데이터를 전송할 때
//  서비스에서 컨트롤러로 데이터 결과를 리턴할 때 전달목적!
@Data
public class PostDTO {
	private Long id;
	private String title;
	private String content;
	
	// DTO객체를 Entity로 변경하는 메서드
	// 직접 작성해도 된다!
	public Post toEntity(PostDTO post) {
		Post p = new Post();
		p.setTitle(post.getTitle());
		p.setContent(post.getContent());
		
		return p;
	}
	
	
}
