package com.woori.edu.test;

import com.woori.edu.Shirt;

public class ShirtAppTest {

	public static void main(String[] args) {
		// Calling�� ���⼭��...
		/*
		 * 1. ��ü����... Ŭ������ ����� �޸𸮿� �ø���.
		 * 2. ����� ����
		 * 	  �ʵ����� -- ���Ҵ�
		 *   �޼ҵ����� -- ȣ��		
		 */   
		
		/* 
		 * Shirt();
		 * ������
		 * ��ü�� ������ ������ ȣ�� �Ǵ� ��
		 * 
		 * Calling vs Worker
		 * 
		 */
		Shirt s = new Shirt();
//		//float, double �Ǽ��� ������ �� �ڿ� ������ Ÿ���� �����ϴ� Ű���尡 �׻� ���ԵǾ� �ִ�.
//		//1) price DataType�� double�� ����
//		//2) ���� float���� ��ȯ
//		s.price = 39.23f;
//		s.brandName = "����Ű";
//		s.color = 'W';
//		s.longSleeved = true;
//		s.size = 100;
//		
		//����� ����
		Shirt s1 = new Shirt(39.72f, "����Ŭ��", false, 'B', 100);
		Shirt s2 = new Shirt();
		
		s2.setShirtInfo(100.2f, "����Ű", true, 'R', 105);
				
		System.out.println(s.getShirtInfo());
		System.out.println(s1.getShirtInfo());
		System.out.println(s2.getShirtInfo());
	}

}
