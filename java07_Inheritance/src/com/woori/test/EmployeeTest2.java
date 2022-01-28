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
 * 		--------------> 상속 받은 인스턴스 별로 분기처리(?)
 * 
 */

public class EmployeeTest2 {

	public static void main(String[] args) {
		// Polymorphism... 부모타입으로 자식객체를 생성
		Employee m = new Manager("James", new MyDate(1980, 1, 1), 3000000, "IT");
		Employee eg = new Engineer("John", new MyDate(1980, 1, 1), 3000000, "JAVA", 100);
		Employee sc = new Secretary("Jack", new MyDate(1980, 1, 1), 3000000, "James");
		

		// 2. Manager의 부서를 변경...Marketing 
		//--> 부모타입으로 자식을 선언했을 때 자식의 메서드 사용 X --> ObjectCasting
		// m.changeDept("Marketing"); // ObjectCasting 전에는 사용 불가
		
		/*
		 * Manager manager = (Manager)m;
		 * manager.changeDept("Marketing");
		 * 아래의 한줄과 동일한 동작		
		 */
		((Manager) m).changeDept("Marketing");
				
		// 1. Virtual Method Invocation
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(sc.getDetails());
		
		
		
	}

}
