package com.woori.bank.test;

import com.woori.bank.domain.Account;

/*
 * Class Type의 배열
 * 1. 선언	2. 생성	3.초기화
 * 
 */
public class BankArrayTest1 {

	public static void main(String[] args) {
		// 1. 선언과 생성
		Account[] accounts = new Account[3];
		// 2. 초기화
		accounts[0] = new Account(1000,"신한은행");
		accounts[1] = new Account(40000,"우리은행");
		accounts[2] = new Account(500000,"국민은행");
		
		for (Account account:accounts)
			System.out.println(account.getBankName() + ", " + account.getBalance());
		
		System.out.println("========================= 주소값 1 =========================");
		System.out.println(accounts);
		
		System.out.println("========================= 주소값 2 =========================");
		for (int i=0; i<accounts.length; ++i)
			System.out.println(accounts[i]);
	}

}
