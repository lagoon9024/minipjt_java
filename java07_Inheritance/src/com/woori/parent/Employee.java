package com.woori.parent;

import com.woori.util.MyDate;

public class Employee {
	private String name;
	private MyDate birthDate;
	private int salary;
	public static int BASIC_SALARY = 100;
	
	// ������ Overloading...��Ӱ� ������� �ϳ��� Ŭ�������� �߻��ϴ� ����...
	// �̸��� ���� ���ڰ� �ٸ��� ���ȴ�.
	public Employee() {};
	
	public Employee(String name, MyDate birthDate, int salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public Employee(String name, MyDate birthDate) {
		// ������ ���� this...�ϳ��� Ŭ�������� �� �ٸ� ������ ȣ��...
		this(name, birthDate, BASIC_SALARY);
	}

	public String getDetails() {
		return name+", "+birthDate.getMyDate()+", "+salary;
	}
}
