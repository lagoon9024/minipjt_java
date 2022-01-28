package com.woori.bank.service;

import com.woori.bank.domain.Customer;

/*
 * Service Class는
 * 기능만을 모아둔 클래스
 * 
 * 요청이 Service 클래스가 요청을 일일히 처리하는 단위가 아니라
 * Service 클래스의 메소드가 완벽히 요청을 처리하는 단위가 된다.
 * 이때 아무리 많은 클라이언트가 접속하더라도 Service Instance는 단 한개만 생성하도록 하자.
 * :: 
 * Singletone Pattern
 * 1) private static으로 클래스 안에서 일단 하나의 객체는 생성.
 * 2) 다른 곳에서 생성을 하지 못하도록 막아둔다...생성자 앞을 private로 선언
 * 3) 하나 만들어 놓은 객체를 여기저기서 가져다 쓸 수 있도록 열어둔다....
 */
public class BankService {
	public static int MAX_SIZE = 100;
	
	private static BankService service = new BankService(); //1)
	private BankService() {
		System.out.println("Singletone....Service Creating..");
	} //2)
	public static BankService getBankInstance() {
		return service;
	} //3)
		
	// 1. 특정한 고객의 정보를 리턴하는 기능
	// return type, identifier, argument list
	public Customer findCustomerInfo(Customer[] customers, int ssn) {
		Customer customer = null;
		//구현부
		return customer;
	}
	
	// 2. 고객 중에서 가장 많은 에치금을 가지고 있는 고객의 예치금을 리턴하는 기능
	public double maxDeposit(Customer[] customers) {
		double total = 0;
		
		return total;
	}
	// 3. 고객의 예치금 중에서 5천만원 이상인 예치금을 가지고 있는 고객을 반환
	public Customer[] overDeposit(Customer[] customers, double amount) {
		Customer[] temp = new Customer[MAX_SIZE];
		
		return temp;
	}
}
