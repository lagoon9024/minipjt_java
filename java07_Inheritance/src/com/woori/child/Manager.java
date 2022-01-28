package com.woori.child;

import com.woori.parent.Employee;
import com.woori.util.MyDate;

public class Manager extends Employee {
	
	// 자기 자신만의 멤버 추가
	private String dept;
	
	// 자식 생성자...객체 생성...
	public Manager(String name, MyDate birthDate, int salary, String dept) {
		// Employee 생성자 호출...
		super(name,birthDate,salary);
		this.dept=dept;
	}
	
	public void changeDept(String deptName) {
		dept = deptName;
	}
	
	// 자식에게 맞게 기능을 고쳐서 사용한다...Method Overriding...구현부가 반드시 달라야한다.
	public String getDetails() {
		return super.getDetails()+", "+dept;
	}
}
