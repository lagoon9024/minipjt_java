package com.woori.bank.test;

import com.woori.bank.domain.Account;
import com.woori.bank.domain.Customer;
import com.woori.bank.service.BankService;

/*
 * Class Type�� �迭
 * 1. ����	2. ����	3.�ʱ�ȭ
 * 
 */
public class BankArrayTest3 {

	public static void main(String[] args) {
		// Account Ÿ���� �迭 ����, ����, �ʱ�ȭ
		Account[] accounts1 = {
				new Account(1000,"��������"),
				new Account(400000,"�츮����"),
				new Account(5000000,"��������")
		};
		
		Account[] accounts2 = {
				new Account(450000000,"�츮����"),
				new Account(8800000,"��������")
		};
		
		Account[] accounts3 = {
				new Account(1000,"��������"),
				new Account(4000000,"�츮����"),
				new Account(55000000,"�������")
		};
		
		Customer c1 = new Customer("James", 1);
		Customer c2 = new Customer("John", 2);
		Customer c3 = new Customer("Juliet", 3);
		Customer[] customers= {c1,c2,c3};
		
		
		c1.setAccount(accounts1);
		c2.setAccount(accounts2);
		c3.setAccount(accounts3);
		
		// ���� ��ü ����
		BankService service = BankService.getBankInstance();
		
		Customer returnC = service.findCustomerInfo(customers, 1);
		// ��� �ϱ�
		
	}
	
}
