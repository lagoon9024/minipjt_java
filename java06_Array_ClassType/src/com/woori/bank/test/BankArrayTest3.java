package com.woori.bank.test;

import com.woori.bank.domain.Account;
import com.woori.bank.domain.Customer;
import com.woori.bank.service.BankService;

/*
 * Class Type의 배열
 * 1. 선언	2. 생성	3.초기화
 * 
 */
public class BankArrayTest3 {

	public static void main(String[] args) {
		// Account 타입의 배열 선언, 생성, 초기화
		Account[] accounts1 = {
				new Account(1000,"신한은행"),
				new Account(400000,"우리은행"),
				new Account(5000000,"국민은행")
		};
		
		Account[] accounts2 = {
				new Account(450000000,"우리은행"),
				new Account(8800000,"농협은행")
		};
		
		Account[] accounts3 = {
				new Account(1000,"신한은행"),
				new Account(4000000,"우리은행"),
				new Account(55000000,"기업은행")
		};
		
		Customer c1 = new Customer("James", 1);
		Customer c2 = new Customer("John", 2);
		Customer c3 = new Customer("Juliet", 3);
		Customer[] customers= {c1,c2,c3};
		
		
		c1.setAccount(accounts1);
		c2.setAccount(accounts2);
		c3.setAccount(accounts3);
		
		// 서비스 객체 생성
		BankService service = BankService.getBankInstance();
		
		Customer returnC = service.findCustomerInfo(customers, 1);
		// 출력 하기
		
	}
	
}
