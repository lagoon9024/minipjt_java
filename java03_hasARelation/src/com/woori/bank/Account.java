package com.woori.bank;
// ���� ���� ������ ��� �ִ� Ŭ����
public class Account {
	public double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		if(amt>=1000) balance += amt;
		else return;
	}
	
	public void withdraw(double amt) {
		if(balance>=amt) balance -= amt;
		else return;
	}	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
