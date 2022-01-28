package com.woori.fly;
/*
 * 구현부가 없는 추상메소드들로만 구성
 */
public interface Flyer {
	public static final int MAX_SPEED = 100; // 반드시 대문자로 작성
	void fly();
	void land();
	public abstract void take_off();
}
