/*
 * Array
 * 같은 데이터 타입을 가지는 여러개의 값들이 
 * 하나의 변수를 통해서 한번에 처리되는 것
 * 
 * 1) Array는 객체다
 * 2) Same Data Type이어야 묶을 수 있다.
 * 
 * <Syntax>
 * 1. 선언				2. 생성(size 명시)				3. 초기화
 * int[] arr;			arr = new int[3];			
 * ==>		int[] arr = new int[3];
 * 
 * 
 */

package com.woori.array.test;

public class BasicArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		arr[0]=11;
		arr[1]=22;
		arr[2]=33;
		
		for(int i:arr) System.out.println(i);
	}

}
