package com.woori.edu.greet;

// Entity ���� -> field/method ���� -> relationship(����(hasing)/����(inheritance)) ����

// � �λ縻 | ��������  ---> ���� ����(field)
// �ܼ�â���� �λ縻�� ��� ---> ����� ����(method)

// ������ ��� ����
public class Greeting {
	// �ʵ� ����(=�������) :: ������ Ÿ�� + �ʵ��
	public String message;
	public String target;
	
	public void setGreeting(String target, String message) {
		this.target = target;
		this.message=message;
	}
	
	public String getGreeting() {
		return this.target+", "+this.message;
	}
	
}
// class�� ���赵�� --> ��üȭ(���� ����ְ�, �޼ҵ带 ȣ��)�� ���� ���α׷� ����