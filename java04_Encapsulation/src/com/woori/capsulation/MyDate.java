package com.woori.capsulation;
/*
 * Encapsulation Pattern
 * 1. 필드 -> private
 * 2. 메서드 setter/getter -> public
 * 3. setter 메서드 필드 초기화 직전 제어문 -> 유효한 값만 할당되도록
 */
public class MyDate {
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>12 || month<1) showError(0);
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day<1||day>31) showError(1);
		switch(month) {
			case 2:
				if(day>29) showError(1);
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>30) showError(1);
		}
		this.day = day;
	}
	private void showError(int value) {
		if(value==1) System.out.println("잘못된 일 입력");
		else System.out.println("잘못된 월 입력");
		System.exit(0);		
	}
	
	
	
}
