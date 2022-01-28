package com.woori.util;

import java.time.LocalDate;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getMyDate() {
		return year + "-" + month + "-" + day;
	}
	public String toString() {
		return year + "-" + month + "-" + day;
	}
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	
	public static int getNowMonth() {
		return LocalDate.now().getMonthValue();
	}
	
	//����� mydate ������ ���� ���� ���
	public static int diffMonth(MyDate mydate) {
		return (LocalDate.now().getYear() - mydate.getYear()) * 12 
				+ (LocalDate.now().getMonthValue() - mydate.getMonth());
	}
	
	public static int getAge(MyDate mydate) {
		return (LocalDate.now().getYear() - mydate.getYear() + 1);
	}
}
