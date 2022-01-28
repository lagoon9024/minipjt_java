package com.woori.child;

import java.util.ArrayList;

import com.woori.domain.Employee;
import com.woori.util.MyDate;

public class Manager extends Employee{
	private int manageDeptNum;
	private String task;

	public Manager(String userName, MyDate birthday, int baseSalary, double bonusRate, int workingTime,
			boolean vaccinated, int deptNumber, MyDate joinDate, int manageDeptNum, String task) {
		super(userName, birthday, baseSalary, bonusRate, workingTime, vaccinated, deptNumber, joinDate);
		this.manageDeptNum = manageDeptNum;
		this.task = task;
	}


	public double avgSalaryOfManagingDept(ArrayList<Employee> employees) {
		int countOfManagingDept=0;
		int totalSalary=0;
		for(Employee emp:employees) {
			if(this.manageDeptNum==emp.getDeptNumber()) {
				countOfManagingDept++;
				totalSalary+=emp.getTotalSalary();
			}
		}
		return (double)totalSalary/(double)countOfManagingDept;
	}


	@Override
	public String toString() {
		return super.getDetails() +","+ manageDeptNum + "," + task;
	}


	public int getManageDeptNum() {
		return manageDeptNum;
	}


	public void setManageDeptNum(int manageDeptNum) {
		this.manageDeptNum = manageDeptNum;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
