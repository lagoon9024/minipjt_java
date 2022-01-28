package com.woori.bank.test;

import com.woori.bank.domain.Account;

/*
 * Class Type�� �迭
 * 1. ����	2. ����	3.�ʱ�ȭ
 * 
 */
public class BankArrayTest1 {

	public static void main(String[] args) {
		// 1. ����� ����
		Account[] accounts = new Account[3];
		// 2. �ʱ�ȭ
		accounts[0] = new Account(1000,"��������");
		accounts[1] = new Account(40000,"�츮����");
		accounts[2] = new Account(500000,"��������");
		
		for (Account account:accounts)
			System.out.println(account.getBankName() + ", " + account.getBalance());
		
		System.out.println("========================= �ּҰ� 1 =========================");
		System.out.println(accounts);
		
		System.out.println("========================= �ּҰ� 2 =========================");
		for (int i=0; i<accounts.length; ++i)
			System.out.println(accounts[i]);
	}

}
