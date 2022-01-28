package com.woori.service;

import com.woori.domain.Employee;

public interface ServiceInterface {
	public void addEmployee(Employee e);
	public void deleteEmployee(int empNum);
	public void deleteEmployee(String userName);
	public int totalVaccinated();
	public int calculateRetirementPay(Employee emp);
	public double calculateAvgAge();
	public int findSalary(int empNum);
	public int findHighestSalary();
	public String findHighestEvgSalaryJob();
}
