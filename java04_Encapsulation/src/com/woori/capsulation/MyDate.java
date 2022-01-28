package com.woori.capsulation;
/*
 * Encapsulation Pattern
 * 1. �ʵ� -> private
 * 2. �޼��� setter/getter -> public
 * 3. setter �޼��� �ʵ� �ʱ�ȭ ���� ��� -> ��ȿ�� ���� �Ҵ�ǵ���
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
		if(value==1) System.out.println("�߸��� �� �Է�");
		else System.out.println("�߸��� �� �Է�");
		System.exit(0);		
	}
	
	
	
}
