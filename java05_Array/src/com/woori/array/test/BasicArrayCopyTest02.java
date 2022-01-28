/*
 * Array
 * 1. 클래스 타입이 제공되지 않는다
 * 2. 한 번 잡은 사이즈를 변경할 수 없다.
 * 
 * ※ 가비지컬렉터는 Heap영역만 정리한다. Class Area(static 변수 올라가는 영역)은 정리하지 않는다. --> static 변수 사용에 주의하자!!!
 * 
 */
package com.woori.array.test;

public class BasicArrayCopyTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] target = {1,2,3,4,5,6};
		target = new int[10];
		
		for(int i:target) System.out.println(i);
	}

}
