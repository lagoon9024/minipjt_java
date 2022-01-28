package com.woori.edu.greet.test;

import com.woori.edu.greet.Greeting;

//실행클래스 혹은 테스트 클래스
/*
 * 실행 클래스가 하는 일
 * 1. 설계된 클래스 메모리 할당 == 객체생성 == 필드와 메소드가 메모리에 올라간다
 * 2. 멤버에 접근
 * 	  1) 필드 --- 값 할당 --- 초기화(= 새로운 값 할당)
 *    2) 메소드 --- 호출
 */
public class GreetingAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeting = new Greeting(); // 객체 생성...메모리에 올린다...멤버들이 올라간다.
		greeting.setGreeting("18기", "Welcome!");
		System.out.println(greeting.getGreeting());
	}

}
