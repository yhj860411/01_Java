package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		boolean membership = sc.nextBoolean();
		
		double discount = (membership ? 0.1 : 0.05);
		double finalPr = price * (1-discount);
		
		System.out.println("할인율 : " + discount);
		System.out.println("할인을 포함한 최종금액 : " + finalPr + "원");
	}
	
	public void practice2() {
		
		System.out.print("출금할 금액 입력 : ");
		int input = sc.nextInt();
		int re50000 = input / 50000;
		input %= 50000;
		int re10000 = input / 10000;
		input %= 10000;
		int re5000 = input / 5000;
		input %= 5000;
		int re1000 = input / 1000;
		
		System.out.println("50000원: " + re50000);
		System.out.println("10000원: " + re10000);
		System.out.println("5000원: " + re5000);
		System.out.println("1000원: " + re1000);
	}
	
	public void practice3() {
		
		System.out.print("첫 번째 수 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int input2 = sc.nextInt();
		
		int result = input1 % input2;
		
		System.out.println(result == 0 ? "배수입니다" : "배수가 아닙니다");
	}

}
