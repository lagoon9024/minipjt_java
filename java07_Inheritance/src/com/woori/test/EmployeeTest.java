package com.woori.test;

import com.woori.child.Manager;
import com.woori.util.MyDate;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("James", new MyDate(1980, 1, 1), 3000000, "IT");
		System.out.println(m.getDetails());
	}

}
