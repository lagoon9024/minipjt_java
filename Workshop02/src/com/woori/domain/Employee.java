package com.woori.domain;

import com.woori.util.MyDate;

public class Employee {
	private static int autoEmpNumber;
	private int empNumber;
	private String userName;
	private MyDate birthday;
	private int baseSalary;
	private double bonusRate;
	private int workingTime;
	private boolean vaccinated;
	private int deptNumber;
	private MyDate joinDate;
	
	public Employee(String userName, MyDate birthday, int baseSalary, double bonusRate, int workingTime,
			boolean vaccinated, int deptNumber, MyDate joinDate) {
		this.empNumber = ++autoEmpNumber;
		this.userName = userName;
		this.birthday = birthday;
		this.baseSalary = baseSalary;
		this.bonusRate = bonusRate;
		this.workingTime = workingTime;
		this.vaccinated = vaccinated;
		this.deptNumber = deptNumber;
		this.joinDate = joinDate;
	}

	public String introduce() {
		return "안녕하세요? " + deptNumber + " 부서의 " + userName + " 입니다!";
	}
	
	public int getTotalSalary() {
		double additionRate = 1.0;
		// 생일 월이면 보너스 비율 반영해서 급여 제공
		if(birthday.getMonth() == MyDate.getNowMonth()) {
			additionRate += bonusRate;
		}
		
		return (int)(baseSalary * additionRate);
	}
	
	public String getDetails() {
		return "임직원의 세부 내역 입니다. " + empNumber + " " + userName + " " + birthday.getMyDate() + " " + baseSalary +
				" " + bonusRate + " " + workingTime + " " + vaccinated + " " + deptNumber + " " + joinDate;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getBonusRate() {
		return bonusRate;
	}

	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}

	public int getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(int workingTime) {
		this.workingTime = workingTime;
	}

	public boolean isVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	public int getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}

	public MyDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(MyDate joinDate) {
		this.joinDate = joinDate;
	}
}
