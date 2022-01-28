package com.woori.child;

import com.woori.parent.Employee;
import com.woori.util.MyDate;

public class Manager extends Employee {
	
	// �ڱ� �ڽŸ��� ��� �߰�
	private String dept;
	
	// �ڽ� ������...��ü ����...
	public Manager(String name, MyDate birthDate, int salary, String dept) {
		// Employee ������ ȣ��...
		super(name,birthDate,salary);
		this.dept=dept;
	}
	
	public void changeDept(String deptName) {
		dept = deptName;
	}
	
	// �ڽĿ��� �°� ����� ���ļ� ����Ѵ�...Method Overriding...�����ΰ� �ݵ�� �޶���Ѵ�.
	public String getDetails() {
		return super.getDetails()+", "+dept;
	}
}
