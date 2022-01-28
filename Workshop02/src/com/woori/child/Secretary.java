package com.woori.child;

import java.util.ArrayList;

import com.woori.domain.Employee;
import com.woori.util.MyDate;

public class Secretary extends Employee{
	
	private String bossOfName;
	private boolean additionalWork;


	public Secretary(String userName, MyDate birthday, int baseSalary, double bonusRate, int workingTime,
			boolean vaccinated, int deptNumber, MyDate joinDate, String bossOfName, boolean additionalWork) {
		super(userName, birthday, baseSalary, bonusRate, workingTime, vaccinated, deptNumber, joinDate);
		this.bossOfName = bossOfName;
		this.additionalWork = additionalWork;
	}
	
	public int findSalaryOfBoss(ArrayList<Employee> arr) {
		String name = this.bossOfName;
		int salarys = 0;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getUserName().equals(name)) {
				salarys = arr.get(i).getBaseSalary();
				break;
			}
		}
		return salarys;
	}
	
	public String getBossOfName() {
		return bossOfName;
	}
	public void setBossOfName(String bossOfName) {
		this.bossOfName = bossOfName;
	}
	public boolean isAdditionalWork() {
		return additionalWork;
	}
	public void setAdditionalWork(boolean additionalWork) {
		this.additionalWork = additionalWork;
	}
}


