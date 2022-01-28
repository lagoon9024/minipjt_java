package com.woori.child;

import com.woori.parent.Employee;
import com.woori.util.MyDate;

public class Secretary extends Employee{
	private String BossOfName;
	
	public Secretary(String name, MyDate birthDate, int salary, String BossOfName) {
		super(name, birthDate, salary);
		// TODO Auto-generated constructor stub
		this.BossOfName = BossOfName;
	}
	
	public String getDetails() {
		return super.getDetails()+", "+BossOfName;
	}
	
	
}
