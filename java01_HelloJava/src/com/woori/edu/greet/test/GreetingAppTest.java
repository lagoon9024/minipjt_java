package com.woori.edu.greet.test;

import com.woori.edu.greet.Greeting;

//����Ŭ���� Ȥ�� �׽�Ʈ Ŭ����
/*
 * ���� Ŭ������ �ϴ� ��
 * 1. ����� Ŭ���� �޸� �Ҵ� == ��ü���� == �ʵ�� �޼ҵ尡 �޸𸮿� �ö󰣴�
 * 2. ����� ����
 * 	  1) �ʵ� --- �� �Ҵ� --- �ʱ�ȭ(= ���ο� �� �Ҵ�)
 *    2) �޼ҵ� --- ȣ��
 */
public class GreetingAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeting = new Greeting(); // ��ü ����...�޸𸮿� �ø���...������� �ö󰣴�.
		greeting.setGreeting("18��", "Welcome!");
		System.out.println(greeting.getGreeting());
	}

}
