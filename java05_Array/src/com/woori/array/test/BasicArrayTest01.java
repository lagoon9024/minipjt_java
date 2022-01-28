/*
 * Array
 * ���� ������ Ÿ���� ������ �������� ������ 
 * �ϳ��� ������ ���ؼ� �ѹ��� ó���Ǵ� ��
 * 
 * 1) Array�� ��ü��
 * 2) Same Data Type�̾�� ���� �� �ִ�.
 * 
 * <Syntax>
 * 1. ����				2. ����(size ���)				3. �ʱ�ȭ
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
