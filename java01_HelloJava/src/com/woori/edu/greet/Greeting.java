package com.woori.edu.greet;

// Entity 추출 -> field/method 정의 -> relationship(수평(hasing)/수직(inheritance)) 결정

// 어떤 인사말 | 누구에게  ---> 값을 저장(field)
// 콘솔창으로 인사말을 출력 ---> 기능을 동작(method)

// 컴파일 대상만 가능
public class Greeting {
	// 필드 선언(=멤버변수) :: 데이터 타입 + 필드명
	public String message;
	public String target;
	
	public void setGreeting(String target, String message) {
		this.target = target;
		this.message=message;
	}
	
	public String getGreeting() {
		return this.target+", "+this.message;
	}
	
}
// class는 설계도다 --> 구체화(값을 집어넣고, 메소드를 호출)를 통해 프로그램 구동