package com.woori.bank.test;

import com.woori.bank.domain.Account;
import com.woori.bank.domain.Customer;

/*
 * Class Type의 배열
 * 1. 선언	2. 생성	3.초기화
 * 
 */

// Account, Customer와 같이 정보를 가진 클래스를 Domain이라 한다. Domain Class ----> DB와 연결
// 여기에선 두 개의 도메인을 가지므로 DB에 두 개의 테이블 형성(각각의 도메인은 각각의 테이블에 매핑)
// 도메인의 필드 값은 DB테이블의 컬럼이 된다
// DB 테이블의 ROW를 인스턴스화 시킨 클래스를 도메인 클래스라 한다
// DB 테이블의 하나의 ROW를 인스턴스화 시킨 객체를 VO(또는 DO)라고 한다.
// Domain = VO(Value Object) = DTO(Data Transfer Object)	
// Domain Class의 메소드는 생성자 + getter/setter + toString 으로만 이루어져야 한다.
public class BankArrayTest2 {

	public static void main(String[] args) {
		// Account 타입의 배열 선언, 생성, 초기화
		Account[] accounts = {
				new Account(1000,"신한은행"),
				new Account(400000,"우리은행"),
				new Account(5000000,"국민은행")
		};
		
		// 1. James라는 고객을 생성
		Customer customer = new Customer("James", 1);
		
		// 2. James가 신한, 우리, 국민은행 통장을 가지도록
		customer.setAccount(accounts);
		
		// 3. James가 가진 통장 중 우리은행 통장을 받아서 10만원을 입금 & 잔액 확인
		Account[] temp = customer.getAccount();
		for(Account acc:temp) {
			if(acc.getBankName().equals("우리은행")) {
				acc.deposit(100000);
				System.out.println("입금 후 잔액 :: " + acc.getBalance());
			}
		}
		
		// 4. James가 가진 통장 중 가장 많은 금액이 입금된 통장의 은행명 & 잔액 출력		
		double maxBalance = 0;
		String maxAccBank = "";
		for(Account acc:temp) {
			if(acc.getBalance()>maxBalance) {
				maxBalance = acc.getBalance();
				maxAccBank = acc.getBankName();
			}
				
		}
		System.out.println(maxAccBank + ", 잔액 :: " + maxBalance);
		
		
	}
	
}
