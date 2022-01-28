package com.woori.fly.impl;

import com.woori.fly.Flyer;

public class Superman implements Flyer{ 
	@Override
	public void fly() {
		System.out.println("Superman...fly");
		
	}

	@Override
	public void land() {
		System.out.println("Superman...land");		
	}

	@Override
	public void take_off() {
		System.out.println("Superman...take_off");
	}
	
	public String eye_beam() {
		return "´«ºö";
	}
}
