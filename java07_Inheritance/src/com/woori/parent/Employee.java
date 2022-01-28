package com.woori.parent;

import com.woori.util.MyDate;

public class Employee {
	private String name;
	private MyDate birthDate;
	private int salary;
	public static int BASIC_SALARY = 100;
	
	// 생성자 Overloading...상속과 상관없이 하나의 클래스에서 발생하는 성질...
	// 이름은 같고 인자가 다르게 사용된다.
	public Employee() {};
	
	public Employee(String name, MyDate birthDate, int salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public Employee(String name, MyDate birthDate) {
		// 생성자 앞의 this...하나의 클래스에서 또 다른 생성자 호출...
		this(name, birthDate, BASIC_SALARY);
	}

	public String getDetails() {
		return name+", "+birthDate.getMyDate()+", "+salary;
	}
}
