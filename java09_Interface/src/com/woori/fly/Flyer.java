package com.woori.fly;
/*
 * �����ΰ� ���� �߻�޼ҵ��θ� ����
 */
public interface Flyer {
	public static final int MAX_SPEED = 100; // �ݵ�� �빮�ڷ� �ۼ�
	void fly();
	void land();
	public abstract void take_off();
}
