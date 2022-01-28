package com.woori.test;

import com.woori.child.Engineer;
import com.woori.child.Manager;
import com.woori.child.Secretary;
import com.woori.parent.Employee;
import com.woori.util.MyDate;


/*
 * 									Employee
 * 										|
 * 						Manager		Engineer	Secretary
 * 
 * 						Service Class Method...
 * 1 step ::
 * 			public void addManager(Manager m)
 * 			public void insertEngineer(Engineer eg)
 * 			public void createSecretary(Secretary sc)
 * 2 step ::
 * 			public void addManager(Manager m)
 * 			public void addEngineer(Engineer eg)
 * 			public void addSecretary(Secretary sc)
 * 3 step ::
 * 			public void addEmployee(Manager m)
 * 			public void addEmployee(Engineer eg)  ---------------> method Overloading
 * 			public void addEmployee(Secretary sc)
 * 
 * ========================= Polymorphism ============================
 * 4 step ::
 * 			public void addEmployee(Employee e){
 * 					if(eg instanceof Engineer){
 * 
 * 					}
 * 			}
 * 		--------------> ��� ���� �ν��Ͻ� ���� �б�ó��(?)
 * 
 */

public class EmployeeTest2 {

	public static void main(String[] args) {
		// Polymorphism... �θ�Ÿ������ �ڽİ�ü�� ����
		Employee m = new Manager("James", new MyDate(1980, 1, 1), 3000000, "IT");
		Employee eg = new Engineer("John", new MyDate(1980, 1, 1), 3000000, "JAVA", 100);
		Employee sc = new Secretary("Jack", new MyDate(1980, 1, 1), 3000000, "James");
		

		// 2. Manager�� �μ��� ����...Marketing 
		//--> �θ�Ÿ������ �ڽ��� �������� �� �ڽ��� �޼��� ��� X --> ObjectCasting
		// m.changeDept("Marketing"); // ObjectCasting ������ ��� �Ұ�
		
		/*
		 * Manager manager = (Manager)m;
		 * manager.changeDept("Marketing");
		 * �Ʒ��� ���ٰ� ������ ����		
		 */
		((Manager) m).changeDept("Marketing");
				
		// 1. Virtual Method Invocation
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(sc.getDetails());
		
		
		
	}

}
