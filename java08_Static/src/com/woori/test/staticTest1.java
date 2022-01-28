/*
 * static 성질
 * 1. static이 붙은 멤버는 class file loader 되는 단계에 미리 메모리에 올라간다.
 * 2. 객체 생성하기 이전에 미리 메모리에 올라가있다.
 * 3. static한 멤버는 local level에서 사용못함... 멤버레벨에서만 사용
 * 4. 생성된 객체들이 모두 static한 변수를 공유
 * 5. static은 final과 함께 많이 쓰이고... 상수값을 의미
 */
package com.woori.test;

class Member{
	static String name = "철수";	// class 변수, static 변수
	static int age = 22;
	int count = 1;
	
	public static void getMember() {
		System.out.println("우/유/빛/깔"+name);
		// count++; ==> static 내에서 non-static한 값 사용 불가 
		//--> 메모리 올라가는 시점이 다르다.(static 이후 생성시 count 메모리에 올라감) 
		//--> static은 static끼리 통한다.
	}
	
	public void getMeber2() {
		// static int total = 11; ==> Error. static은 멤버레벨에서만 사용해야한다
		System.out.println("우/웅/우/웅"+name);
	}
}

public class staticTest1 {
	public static void main(String[] args) {
		Member.getMember(); // static 필드는 생성 전에 사용 가능
		Member m = new Member();
		m.getMeber2(); // non-static 필드는 생성이 필수
	}
}
