package com.woori.bank.domain;
// 은행거래를 서비스 받는 고객
public class Customer {
	private String name;
	private int ssn;
	
	//has a
	//public Account account;
	public Account[] accounts;

	//has a
	public Account[] getAccount() {
		return accounts;
	}

	public void setAccount(Account[] accounts) {
		this.accounts = accounts;
	}

	public Customer(String name, int ssn) {
		this.name= name;
		this.ssn = ssn;
	}
	
	public String getCustomerInfo() {
		return ssn + ", " +  name;
	}
	
		 
}
