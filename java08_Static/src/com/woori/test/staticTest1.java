/*
 * static ����
 * 1. static�� ���� ����� class file loader �Ǵ� �ܰ迡 �̸� �޸𸮿� �ö󰣴�.
 * 2. ��ü �����ϱ� ������ �̸� �޸𸮿� �ö��ִ�.
 * 3. static�� ����� local level���� ������... ������������� ���
 * 4. ������ ��ü���� ��� static�� ������ ����
 * 5. static�� final�� �Բ� ���� ���̰�... ������� �ǹ�
 */
package com.woori.test;

class Member{
	static String name = "ö��";	// class ����, static ����
	static int age = 22;
	int count = 1;
	
	public static void getMember() {
		System.out.println("��/��/��/��"+name);
		// count++; ==> static ������ non-static�� �� ��� �Ұ� 
		//--> �޸� �ö󰡴� ������ �ٸ���.(static ���� ������ count �޸𸮿� �ö�) 
		//--> static�� static���� ���Ѵ�.
	}
	
	public void getMeber2() {
		// static int total = 11; ==> Error. static�� ������������� ����ؾ��Ѵ�
		System.out.println("��/��/��/��"+name);
	}
}

public class staticTest1 {
	public static void main(String[] args) {
		Member.getMember(); // static �ʵ�� ���� ���� ��� ����
		Member m = new Member();
		m.getMeber2(); // non-static �ʵ�� ������ �ʼ�
	}
}
