package com.woori.bank;
// 은행거래를 서비스 받는 고객
public class Customer {
	public String firstName;
	public String lastName;
	
	//has a
	public Account account;

	//has a
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getCustomerInfo() {
		return firstName + ", " +  lastName;
	}
	
		 
}
