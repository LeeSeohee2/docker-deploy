package com.yonsai.Day70_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
// 에러를 확인하는 방법
//  - 값이 null일 경우에는 html name속성확인
//  - 그 값을 받는 entity 클래스에 혹시 setter나
//    기본 생성자가 있는지 확인!

@Entity
@NoArgsConstructor  //기본생성자!
@AllArgsConstructor //매개변수 있는 생성자
@Setter             // 수정하는 메서드!
@Getter             //데이터를 꺼내가는 메서드 !
@Data
public class Sign {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	//@RequiredArgsConstructor 어노테이션
	//사용시 원하는 필드 생성할 때는 옆에 @NonNull
	// 을 붙인다!
	private String id;
	private String password;
	private String addr;
	private String email;
	private String phone;
	private String name;
	
//	@Builder(실무에서는 추천 가독성)
//	public Sign(String id,String password,String addr) {
//		this.id = id;
//		this.password = password;
//	}
	
	
}
