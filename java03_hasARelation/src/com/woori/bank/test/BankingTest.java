package com.woori.bank.test;

import java.util.Scanner;

import com.woori.bank.Account;
import com.woori.bank.Customer;

public class BankingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer Name Input :: ");
		String firstName = sc.next();
		String lastName = sc.next();
		double balance = sc.nextInt();
		System.out.println("\n================= 1. Customer Creating =================");
		Customer customer = new Customer(firstName, lastName);
		
		System.out.println("\n================= 2. Account Creating  =================");
		customer.setAccount(new Account(balance));
		
		System.out.println("\n================= 3. Account Using     =================");
		Account jamesAccount = customer.getAccount();
		jamesAccount.deposit(2000.0);
		jamesAccount.deposit(3000.0);
		jamesAccount.withdraw(1000.0);
		
		System.out.println("\n================= 4. Get Balance       =================");
		System.out.println(" °í°´´ÔÀÇ ÇöÀç ÀÜ¾×Àº " + jamesAccount.getBalance() + "ÀÔ´Ï´Ù.");
		sc.close();
	}

}
