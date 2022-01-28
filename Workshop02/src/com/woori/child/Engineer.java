package com.woori.child;
import com.woori.domain.Employee;
import com.woori.util.MyDate;

public class Engineer extends Employee{

	private String techType;
	private int dispatchSalary;
	
	public Engineer(String userName, MyDate birthday, int baseSalary, double bonusRate, int workingTime,
			boolean vaccinated, int deptNumber, MyDate joinDate, String techType, int dispatchSalary) {
		super(userName, birthday, baseSalary, bonusRate, workingTime, vaccinated, deptNumber, joinDate);
		this.techType = techType;
		this.dispatchSalary = dispatchSalary;
	}

	public int getTotalSalary() {
		return  super.getTotalSalary() + dispatchSalary;
	}

	public String getDetails() {
		return super.getDetails() + "," + techType + ", " + dispatchSalary;
	}	
}
