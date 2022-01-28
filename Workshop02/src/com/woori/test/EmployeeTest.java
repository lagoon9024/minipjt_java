package com.woori.test;

import java.util.Scanner;

import com.woori.child.*;
import com.woori.domain.Employee;
import com.woori.service.EmployeeService;
import com.woori.util.MyDate;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeService empService = EmployeeService.getService();
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Manager("A", new MyDate(1990, 12, 1), 200, 0.2, 52, true , 123,new MyDate(2020, 2, 9), 333, "����");
		Employee e2 = new Manager("B", new MyDate(1990, 12, 1), 200, 0.2, 52, true , 123,new MyDate(2020, 2, 9), 333, "����");
		Employee e3 = new Secretary("������", new MyDate(1994, 9, 19), 400, 0.42, 40, true, 1111, new MyDate(2022, 02, 04), "�輺��", true);
		Employee e4 = new Engineer("��Ե�", new MyDate(1994, 8, 27), 550, 0.2, 460, false,222, new MyDate(2022, 2, 7),"IT",200);
		Employee e5 = new Engineer("������", new MyDate(1992, 11, 17), 550, 0.2, 460, false,222, new MyDate(2022, 2, 7),"HW",200);
		Employee e6 = new Engineer("�ڼ�ȣ", new MyDate(1990, 2, 9), 550, 0.2, 460, false,222, new MyDate(2022, 2, 7),"HW",200);
		Employee e7 = new Employee("������", new MyDate(1995, 7, 17), 5000, 0.11, 44, true, 244, new MyDate(2022, 2, 7));
		
		empService.addEmployee(e1);
		empService.addEmployee(e2);
		empService.addEmployee(e3);		
		empService.addEmployee(e4);
		empService.addEmployee(e5);
		empService.addEmployee(e6);
		empService.addEmployee(e7);
		
		while(true) {
			
			System.out.println("[���� ����] 1. ������ȸ 2. ����  3. ���� ");
			int input = sc.nextInt();

				if (input == 1) {

				System.out.println("1. ������� �ο��� 2. �系 ��� ���� ��� 3. �系���� ���� ���� �޿� "
						+ "4. ��� �޿��� ���� ���� ���� 5. ������� ������ ���  6. ������� ���� ��ȸ ");
				input  = sc.nextInt();

				switch(input) {
				case 1:
					System.out.println("---- ��������ο��� : " + empService.totalVaccinated());
					break;
				case 2:
					System.out.println("---- �系��ճ��̰�� : "+ empService.calculateAvgAge());			
					break;
				case 3:
					System.out.println("---- �系���� ���� ���� �޿� : " + empService.findHighestSalary());				
					break;
				case 4:
					System.out.println("---- ��ձ޿��� ���� ���� ���� : " +empService.findHighestEvgSalaryJob());			
					break;
				case 5:
					System.out.println("�������� ����� ����� �Է����ּ���");
					int temp = sc.nextInt();
					Employee tempEmp = empService.getEmployeeById(temp);
					if (tempEmp == null ) {
						System.out.println("�ش� ����� ������ �������� �ʽ��ϴ�.");
						break;
					}
					System.out.println("---- �������� " + empService.calculateRetirementPay(tempEmp) + "�� �Դϴ�. ");
					break;
				case 6:
					System.out.println("������ Ȯ���� ����� �Է����ּ���");
					int id = sc.nextInt();
					System.out.println("�ش� ����� ������ " + empService.findSalary(id) +"�� �Դϴ� ");
					break;
				default:
					System.out.println("�߸��� ����� �Է��߽��ϴ�.");
					break;
				}

				empService.printAllEmployee();
			}else if (input == 2 ) {

				System.out.println("1. �̸����� ���� 2. ������� ����");
				input = sc.nextInt();
				if(input == 1) {
					System.out.println("�̸��� �Է����ּ��� : ");
					String tmp = sc.next();
					empService.deleteEmployee(tmp);
				}else if(input==2) {
					System.out.println("����� �Է����ּ��� : ");
					int tmp = sc.nextInt();
					empService.deleteEmployee(tmp);
				}

				empService.printAllEmployee();
				
				//TODO ���� ����� ������ �� ����ó��  
			}else if(input == 3) {
				System.out.println("[���� ����] ���� ���� �Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("�߸��� ���� ��ȸ ��ȣ�� �Է��߽��ϴ�. ");
			}

		}

	}
	


}
