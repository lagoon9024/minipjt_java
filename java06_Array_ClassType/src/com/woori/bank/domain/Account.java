package com.woori.bank.domain;
// 은행 계좌 정보를 담고 있는 클래스
public class Account {
	private double balance;
	private String bankName;
	
	// 주입의 통로
	public Account(double balance) {
		this.balance = balance;
	}
	
	public Account(double balance, String bankName) {
		this.balance = balance;
		this.bankName = bankName;
	}
	
	public String getBankName() {
		return bankName;
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
