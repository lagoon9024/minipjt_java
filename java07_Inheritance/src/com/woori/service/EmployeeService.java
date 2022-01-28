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
	
	// Employee Ÿ������... ���������� ������ ��ü�� Ÿ���� �˰�... instanceof	
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
