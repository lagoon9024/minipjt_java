package com.woori.capsulation.test;

import java.util.Scanner;

import com.woori.capsulation.MyDate;


public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate md = new MyDate();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� :: ");
		int month = sc.nextInt();
		md.setMonth(month);
		System.out.println("�� �Է� :: ");
		int day = sc.nextInt();
		md.setDay(day);
		sc.close();
		
		System.out.println(md.getMonth() + "�� " + md.getDay() + "��");
		
	}

}
