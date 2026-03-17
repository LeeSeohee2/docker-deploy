package com.yonsai.Day70_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.yonsai.Day70_springboot.entity.Sign;
import com.yonsai.Day70_springboot.repository.SignRepository;

@Controller
public class UserController {

	@Autowired
	private SignRepository 회원디비접근;

	// 전체 회원 목록을 조회
	@GetMapping("/list")
	public String list(Model 가방) {
		System.out.println("리스트 페이지 보여줘!");

		// 1. 디비조회
		List<Sign> userList = 회원디비접근.findAll();

		System.out.println("데이터확인: " + userList);
		// 2. 페이지로 보내기
		가방.addAttribute("userList", userList);

		return "list"; // list.html로 이동해라!
	}

	// 한명의 정보를 띄우는 상세페이지
	@GetMapping("/detail/{no}")
	public String detail(@PathVariable long no, Model 가방) {
		// 1. detail url요청이 들어오면 no가져오기
		System.out.println("전달된 no: " + no);
		// 2. DB에 특정 번호(no) 있으면 데이터 가져오기
		// Optional<Sign>
		// - DB에서 데이터값이 있을 수도 있고 없을 수도 있다
		// 에러가 날 수 있다 안전하게 다루는 타입
		Sign res = 회원디비접근.findById(no).orElse(null);

		if (res == null) {
			// list페이지로 돌아가는것은 괜춘!
			// 데이터가 없습니다!
			return "list";
		}

		// 3. detail.html로 보내기!
		가방.addAttribute("user", res);
		return "detail";
	}

	@GetMapping("/update/{no}")
	public String update(@PathVariable long no, Model 가방) {
		System.out.println("수정 페이지 보여줘!");
		// 1. detail url요청이 들어오면 no가져오기
		System.out.println("전달된 no: " + no);
		// 2. DB에 특정 번호(no) 있으면 데이터 가져오기
		
		Sign res = 회원디비접근.findById(no)
						   .orElse(null);
		가방.addAttribute("user", res);

		return "update";
	}
	
	@PostMapping("/update")
	public String updatePro(Sign user) {
		System.out.println("수정 하기 버튼을 클릭시 실행!");
		System.out.println("전달된 값: "+ user);
		
		// save()는 PK(기본 키를 기준) 있으면 update
		//                        없으면 insert 
		회원디비접근.save(user);
		
		//실제 리스트에 변경이 일어났기 때문에 list를 다시 
		// 조회해서 가야된다.!
		return "redirect:/list";
	}
	
	@GetMapping("/delete/{no}")
	public String remove(@PathVariable long no) {
		
		System.out.println("삭제버튼을 클릭했을 때 실행!");
		회원디비접근.deleteById(no);
		return "redirect:/list";
	}
}
