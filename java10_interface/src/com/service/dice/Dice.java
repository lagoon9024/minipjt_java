package com.service.dice;
/*
 * DiceA, DiceB, DiceC 의 가장 핵심적인 기능의 Template
 */
public interface Dice {
	void selectedNumber(); //public abstraced는 생략되어있다고 봐도 무방하다
	int getValue();
	
}
