package com.woori.edu.test;

import com.woori.edu.Shirt;

public class ShirtAppTest {

	public static void main(String[] args) {
		// Calling은 여기서만...
		/*
		 * 1. 객체생성... 클래스의 멤버를 메모리에 올린다.
		 * 2. 멤버에 접근
		 * 	  필드접근 -- 값할당
		 *   메소드접근 -- 호출		
		 */   
		
		/* 
		 * Shirt();
		 * 생성자
		 * 객체가 생성될 때마다 호출 되는 것
		 * 
		 * Calling vs Worker
		 * 
		 */
		Shirt s = new Shirt();
//		//float, double 실수형 값들은 값 뒤에 데이터 타입을 지정하는 키워드가 항상 포함되어 있다.
//		//1) price DataType을 double로 변경
//		//2) 값을 float으로 변환
//		s.price = 39.23f;
//		s.brandName = "나이키";
//		s.color = 'W';
//		s.longSleeved = true;
//		s.size = 100;
//		
		//명시적 생성
		Shirt s1 = new Shirt(39.72f, "유니클로", false, 'B', 100);
		Shirt s2 = new Shirt();
		
		s2.setShirtInfo(100.2f, "나이키", true, 'R', 105);
				
		System.out.println(s.getShirtInfo());
		System.out.println(s1.getShirtInfo());
		System.out.println(s2.getShirtInfo());
	}

}
