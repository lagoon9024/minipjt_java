package com.woori.fly.impl;

import com.woori.fly.Flyer;

public class Bird implements Flyer{ // interface -> implements... 인터페이스의 모든 요소 implement 필수

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
		return "알을 낳다";
	}
}
