package com.woori.fly.impl;

import com.woori.fly.Flyer;

public class Bird implements Flyer{ // interface -> implements... �������̽��� ��� ��� implement �ʼ�

	@Override
	public void fly() {
		System.out.println("Bird...fly");
		
	}

	@Override
	public void land() {
		System.out.println("Bird...land");		
	}

	@Override
	public void take_off() {
		System.out.println("Bird...take_off");
	}
	
	public String layEggs() {
		return "���� ����";
	}
}
