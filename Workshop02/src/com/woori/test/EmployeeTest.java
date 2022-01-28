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
		Employee e1 = new Manager("A", new MyDate(1990, 12, 1), 200, 0.2, 52, true , 123,new MyDate(2020, 2, 9), 333, "교육");
		Employee e2 = new Manager("B", new MyDate(1990, 12, 1), 200, 0.2, 52, true , 123,new MyDate(2020, 2, 9), 333, "교육");
		Employee e3 = new Secretary("조성모", new MyDate(1994, 9, 19), 400, 0.42, 40, true, 1111, new MyDate(2022, 02, 04), "김성종", true);
		Employee e4 = new Engineer("노규동", new MyDate(1994, 8, 27), 550, 0.2, 460, false,222, new MyDate(2022, 2, 7),"IT",200);
		Employee e5 = new Engineer("정찬웅", new MyDate(1992, 11, 17), 550, 0.2, 460, false,222, new MyDate(2022, 2, 7),"HW",200);
		Employee e6 = new Engineer("박석호", new MyDate(1990, 2, 9), 550, 0.2, 460, false,222, new MyDate(2022, 2, 7),"HW",200);
		Employee e7 = new Employee("최은정", new MyDate(1995, 7, 17), 5000, 0.11, 44, true, 244, new MyDate(2022, 2, 7));
		
		empService.addEmployee(e1);
		empService.addEmployee(e2);
		empService.addEmployee(e3);		
		empService.addEmployee(e4);
		empService.addEmployee(e5);
		empService.addEmployee(e6);
		empService.addEmployee(e7);
		
		while(true) {
			
			System.out.println("[서비스 시작] 1. 정보조회 2. 삭제  3. 종료 ");
			int input = sc.nextInt();

				if (input == 1) {

				System.out.println("1. 백신접종 인원수 2. 사내 평균 나이 계산 3. 사내에서 가장 높은 급여 "
						+ "4. 평균 급여가 가장 높은 직군 5. 사번으로 퇴직금 계산  6. 사번으로 월급 조회 ");
				input  = sc.nextInt();

				switch(input) {
				case 1:
					System.out.println("---- 백신접종인원수 : " + empService.totalVaccinated());
					break;
				case 2:
					System.out.println("---- 사내평균나이계산 : "+ empService.calculateAvgAge());			
					break;
				case 3:
					System.out.println("---- 사내에서 가장 높은 급여 : " + empService.findHighestSalary());				
					break;
				case 4:
					System.out.println("---- 평균급여가 가장 높은 직군 : " +empService.findHighestEvgSalaryJob());			
					break;
				case 5:
					System.out.println("퇴직금을 계산할 사번을 입력해주세요");
					int temp = sc.nextInt();
					Employee tempEmp = empService.getEmployeeById(temp);
					if (tempEmp == null ) {
						System.out.println("해당 사번의 직원이 존재하지 않습니다.");
						break;
					}
					System.out.println("---- 퇴직금은 " + empService.calculateRetirementPay(tempEmp) + "원 입니다. ");
					break;
				case 6:
					System.out.println("월급을 확인할 사번을 입력해주세요");
					int id = sc.nextInt();
					System.out.println("해당 사번의 월급은 " + empService.findSalary(id) +"원 입니다 ");
					break;
				default:
					System.out.println("잘못된 사번을 입력했습니다.");
					break;
				}

				empService.printAllEmployee();
			}else if (input == 2 ) {

				System.out.println("1. 이름으로 삭제 2. 사번으로 삭제");
				input = sc.nextInt();
				if(input == 1) {
					System.out.println("이름을 입력해주세요 : ");
					String tmp = sc.next();
					empService.deleteEmployee(tmp);
				}else if(input==2) {
					System.out.println("사번을 입력해주세요 : ");
					int tmp = sc.nextInt();
					empService.deleteEmployee(tmp);
				}

				empService.printAllEmployee();
				
				//TODO 없는 사람을 삭제할 때 예외처리  
			}else if(input == 3) {
				System.out.println("[서비스 종료] 정상 종료 되었습니다.");
				break;
			}else {
				System.out.println("잘못된 서비스 조회 번호를 입력했습니다. ");
			}

		}

	}
	


}
