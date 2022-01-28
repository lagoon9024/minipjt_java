package com.woori.fly.test;

import com.woori.fly.Flyer;
import com.woori.fly.impl.Bird;
import com.woori.fly.impl.Superman;

public class FlyerTest {

	public static void main(String[] args) {
		// Flyer f = new Flyer(); --> 인터페이스는 추상화의 극...
		Flyer f1 = new Bird(); 
		Flyer f2 = new Superman();
		
		if(f1 instanceof Bird) {
			f1.fly();
			f1.land();
			f1.take_off();
			System.out.println(((Bird) f1).layEggs());
		}
		System.out.println("=======================================================");
		if(f1 instanceof Object) {
			f1.fly();
			f1.land();
			f1.take_off();
			System.out.println(((Bird) f1).layEggs());
		}
		
	}

}
