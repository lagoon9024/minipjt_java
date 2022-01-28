package com.woori.bank.service;

import com.woori.bank.domain.Customer;

/*
 * Service Class��
 * ��ɸ��� ��Ƶ� Ŭ����
 * 
 * ��û�� Service Ŭ������ ��û�� ������ ó���ϴ� ������ �ƴ϶�
 * Service Ŭ������ �޼ҵ尡 �Ϻ��� ��û�� ó���ϴ� ������ �ȴ�.
 * �̶� �ƹ��� ���� Ŭ���̾�Ʈ�� �����ϴ��� Service Instance�� �� �Ѱ��� �����ϵ��� ����.
 * :: 
 * Singletone Pattern
 * 1) private static���� Ŭ���� �ȿ��� �ϴ� �ϳ��� ��ü�� ����.
 * 2) �ٸ� ������ ������ ���� ���ϵ��� ���Ƶд�...������ ���� private�� ����
 * 3) �ϳ� ����� ���� ��ü�� �������⼭ ������ �� �� �ֵ��� ����д�....
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
		
	// 1. Ư���� ���� ������ �����ϴ� ���
	// return type, identifier, argument list
	public Customer findCustomerInfo(Customer[] customers, int ssn) {
		Customer customer = null;
		//������
		return customer;
	}
	
	// 2. �� �߿��� ���� ���� ��ġ���� ������ �ִ� ���� ��ġ���� �����ϴ� ���
	public double maxDeposit(Customer[] customers) {
		double total = 0;
		
		return total;
	}
	// 3. ���� ��ġ�� �߿��� 5õ���� �̻��� ��ġ���� ������ �ִ� ���� ��ȯ
	public Customer[] overDeposit(Customer[] customers, double amount) {
		Customer[] temp = new Customer[MAX_SIZE];
		
		return temp;
	}
}
