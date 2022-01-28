package com.woori.child;

import com.woori.parent.Employee;
import com.woori.util.MyDate;

public class Engineer extends Employee{
	private String tech;
	private int bonus;
	
	public Engineer(String name, MyDate birthDate, int salary, String tech, int bonus) {
		super(name, birthDate, salary);
		// TODO Auto-generated constructor stub
		this.tech = tech;
		this.bonus=bonus;
	}
	
	public String getDetails() {
		return super.getDetails()+", "+tech+", "+bonus;
	}

	public void changeTech(String string) {
		// TODO Auto-generated method stub
		this.tech = string;
	}
	
	
}
