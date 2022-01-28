package com.woori.bank.test;

import com.woori.bank.domain.Account;
import com.woori.bank.domain.Customer;

/*
 * Class Type�� �迭
 * 1. ����	2. ����	3.�ʱ�ȭ
 * 
 */

// Account, Customer�� ���� ������ ���� Ŭ������ Domain�̶� �Ѵ�. Domain Class ----> DB�� ����
// ���⿡�� �� ���� �������� �����Ƿ� DB�� �� ���� ���̺� ����(������ �������� ������ ���̺� ����)
// �������� �ʵ� ���� DB���̺��� �÷��� �ȴ�
// DB ���̺��� ROW�� �ν��Ͻ�ȭ ��Ų Ŭ������ ������ Ŭ������ �Ѵ�
// DB ���̺��� �ϳ��� ROW�� �ν��Ͻ�ȭ ��Ų ��ü�� VO(�Ǵ� DO)��� �Ѵ�.
// Domain = VO(Value Object) = DTO(Data Transfer Object)	
// Domain Class�� �޼ҵ�� ������ + getter/setter + toString ���θ� �̷������ �Ѵ�.
public class BankArrayTest2 {

	public static void main(String[] args) {
		// Account Ÿ���� �迭 ����, ����, �ʱ�ȭ
		Account[] accounts = {
				new Account(1000,"��������"),
				new Account(400000,"�츮����"),
				new Account(5000000,"��������")
		};
		
		// 1. James��� ���� ����
		Customer customer = new Customer("James", 1);
		
		// 2. James�� ����, �츮, �������� ������ ��������
		customer.setAccount(accounts);
		
		// 3. James�� ���� ���� �� �츮���� ������ �޾Ƽ� 10������ �Ա� & �ܾ� Ȯ��
		Account[] temp = customer.getAccount();
		for(Account acc:temp) {
			if(acc.getBankName().equals("�츮����")) {
				acc.deposit(100000);
				System.out.println("�Ա� �� �ܾ� :: " + acc.getBalance());
			}
		}
		
		// 4. James�� ���� ���� �� ���� ���� �ݾ��� �Աݵ� ������ ����� & �ܾ� ���		
		double maxBalance = 0;
		String maxAccBank = "";
		for(Account acc:temp) {
			if(acc.getBalance()>maxBalance) {
				maxBalance = acc.getBalance();
				maxAccBank = acc.getBankName();
			}
				
		}
		System.out.println(maxAccBank + ", �ܾ� :: " + maxBalance);
		
		
	}
	
}
