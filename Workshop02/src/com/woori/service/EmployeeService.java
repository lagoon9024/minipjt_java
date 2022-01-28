package com.woori.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.woori.child.*;
import com.woori.domain.Employee;
import com.woori.exception.NoItemException;
import com.woori.exception.ZeroDevidedException;
import com.woori.util.MyDate;

public class EmployeeService implements ServiceInterface {

	private ArrayList<Employee> employees = new ArrayList<>();
	private Map<String, Integer> numOfEachJob = new HashMap<>();
	
	private static EmployeeService service = new EmployeeService();
	private EmployeeService() {
		numOfEachJob.put("Engineer", 0);
		numOfEachJob.put("Manager", 0);
		numOfEachJob.put("Secretary", 0);
		numOfEachJob.put("Employee", 0);
		
	}
	public static EmployeeService getService() {
		return service;
	}
	
	// Get job name
	private String getJobName(Employee e) {
		if (e instanceof Engineer) {
			return "Engineer";
		} else if (e instanceof Manager) {
			return "Manager";
		} else if (e instanceof Secretary) {
			return "Secretary";
		} else{
			return "Employee";
		} 
		
//		return "NotFound";
	}
	// Add Employee
	public void addEmployee(Employee e) {
		employees.add(e);
		numOfEachJob.put(getJobName(e), numOfEachJob.get(getJobName(e)) + 1);
	}
	// Delete Employee with (empNum & userName)
	
	public void deleteEmployee(int empNum) {
		try {
			Employee e = getEmployeeById(empNum);
			int idx = employees.indexOf(e);
			employees.remove(idx);
		}catch(NoItemException ex) {
			ex.printStackTrace();
		}
	} 
	public void deleteEmployee(String userName) {
		for (int i=0; i<employees.size(); i++) {
			if (userName.equals(employees.get(i).getUserName())) {
				numOfEachJob.put(getJobName(employees.get(i)), numOfEachJob.get(getJobName(employees.get(i))) - 1);
				employees.remove(i);
				return;
			}
		}
	}
	// Count vaccinated
	public int totalVaccinated() {
		int cnt = 0;
		for (Employee e: employees) {
			if (e.isVaccinated())
				cnt++;
		}
		return cnt;
	}
	// Calculate retirement
	public int calculateRetirementPay(Employee emp) {
		return emp.getTotalSalary() * MyDate.diffMonth(emp.getJoinDate());
	}
	// Calculate average age
	public double calculateAvgAge() {
		double totalAge = 0d;
		for (Employee e: employees) {
			totalAge += MyDate.getAge(e.getBirthday());
		}
		return totalAge / employees.size();
	}
	// Find each salary with empNum
	public int findSalary(int empNum) {
		int salary = 0;
		for (Employee e: employees) {
			if (e.getEmpNumber() == empNum) {
				salary = e.getTotalSalary();
				break;
			}
		}
		return salary;
	}
	// Find highest salary of employees
	public int findHighestSalary() {
		int maxSalary = -1;
		for (Employee e: employees) {
			int curSalary = e.getTotalSalary();
			maxSalary = curSalary > maxSalary ? curSalary : maxSalary;
		}
		return maxSalary;
	}
	// Find highest avg salary of dept
	
	public Employee getEmployeeById(int id) throws NullPointerException{
		for(Employee e: employees) {
			if( e.getEmpNumber() == id)
				return e;
		}
		throw new NoItemException(); // TODO 예외처리 
			
	}
	public String findHighestEvgSalaryJob() {
		int engiTotal = 0, manaTotal = 0, secrTotal = 0;
		
		for (Employee e: employees) {
			switch(this.getJobName(e)) {
			case "Engineer":
				engiTotal += e.getTotalSalary();
				break;
			case "Manager":
				manaTotal += e.getTotalSalary();
				break;
			case "Secretary":
				secrTotal += e.getTotalSalary();
				break;
			}
		}
		
		double avgEngi, avgMana, avgSecr;
		
		try {
			avgEngi = (double)engiTotal / numOfEachJob.get("Engineer");
		} catch (ZeroDevidedException e) {
			System.out.println("엔지니어가 존재하지 않습니다.");	
			avgEngi=0d;
		}
		try {
			avgMana = (double)manaTotal / numOfEachJob.get("Manager");
		} catch (ZeroDevidedException e) {
			System.out.println("매니저가 존재하지 않습니다.");
			avgMana=0d;
		}
		try {
			avgSecr = (double)secrTotal / numOfEachJob.get("Secretary");
		} catch (ZeroDevidedException e) {
			System.out.println("비서가 존재하지 않습니다.");
			avgSecr=0d;
		}
		
		if (avgEngi >= avgMana) {
			return (avgEngi >= avgSecr) ? "Engineer" : "Secretary";
		} else {
			return (avgMana >= avgSecr) ? "Manager" : "Secretary";
		}
	}
	
	public void printAllEmployee() {
		for(Employee e:employees) {
			System.out.println(e.getDetails());
		}
	}
}
