package com.yonsai.Day70_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yonsai.Day70_springboot.dto.PostDTO;
import com.yonsai.Day70_springboot.entity.Log;
import com.yonsai.Day70_springboot.entity.Post;
import com.yonsai.Day70_springboot.entity.Sign;
import com.yonsai.Day70_springboot.repository.LogRepository;
import com.yonsai.Day70_springboot.repository.PostRepository;
import com.yonsai.Day70_springboot.repository.SignRepository;

@Controller
public class LogController {
	
	@Autowired
	private LogRepository 디비접근;
	
	@Autowired
	private PostRepository 게시글디비접근;
	
	@Autowired
	private SignRepository 회원디비접근;

	@GetMapping("/main")
	public String log() {
		System.out.println("메인페이지 보여줘!");
		
		Log log = new Log();
		log.setMessage("처음하는 JAP 에러 없다!");
		
		디비접근.save(log);
		
		return "log";
	}
	
	/*/add 들어왔을 때 GET 게시글 입력 페이지 보이기!*/
	@GetMapping("/add")
	public String add() {
		System.out.println("게시글 입력 페이지 보여줘!");
		
		return "postAdd";
	}
	
	@PostMapping("/add")
	public String addPro(PostDTO post) {
		System.out.println("넘겨받은 값: " + post.getTitle());
		
		// dto객체를 DB테이블로 변경하는것!
		Post ch =  post.toEntity(post);
		// 추가!
		게시글디비접근.save(ch);
		
		return "postAdd";
	}
	
	@GetMapping("/sign")
	public String sign() {
		System.out.println("회원가입 페이지 보여줘!");
		
		return "sign";
	}
	
	@PostMapping("/sign")
	public String signPro(Sign user) {
		System.out.println("회원가입 처리 메서드 실행!");
				
		Sign res = 회원디비접근.save(user);
		System.out.println("save실행 후 결과: " + res);
		return "list";		
	}	
	
}



