package com.woori.service;

import com.woori.child.Engineer;
import com.woori.child.Manager;
import com.woori.parent.Employee;

public class EmployeeService {
	private static EmployeeService service = new EmployeeService();
	private EmployeeService() {};
	public static int THIS_YEAR = 2022;
	public static EmployeeService getEmployeeInstance() {
		return service;
	}
	
	// Employee 타입으로... 실질적으로 생성된 객체의 타입을 알고... instanceof	
	public void manageEmployee(Employee e) {
		if(e instanceof Manager) {
			// Employee e = new Manager()
			((Manager)e).changeDept("Consulting");
		}
		else if(e instanceof Engineer) {
			// Employee e = new Engineer()
			((Engineer)e).changeTech("Python");
		}
		
	}
}
