package edu.kh.op.practice;

import java.util.Scanner;

// 기능 제공용 클래스
public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("인원 수 : ");
		int perCount = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candyCount = sc.nextInt();
		
		System.out.println();
		
		System.out.println("1인당 사탕 개수 : " + candyCount / perCount);
		System.out.println("남는 사탕 개수 : " + candyCount % perCount);
		
		
	}
	
	public void practice2() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int clas = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별(남학생/여학생) : ");
		String sex = sc.next();
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",
				grade, clas, num, name, sex, score);
	}

	public void practice3() {
		
		System.out.print("국어 : ");
		int korscore = sc.nextInt();
		System.out.print("영어 : ");
		int engscore = sc.nextInt();
		System.out.print("수학 : ");
		int mathscore = sc.nextInt();
		
		System.out.println();
		
		int total = korscore + engscore + mathscore;
		double avr = total / 3.0;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avr);
		
		// 각 과목이 40점 이상이고, 평균 60점 이상이어야 합격
		// 그 외 불합격 출력
		
		boolean result = 
				(korscore >= 40) && (engscore >= 40) && (mathscore >= 40) && (avr >= 60); 
		
		System.out.println(result ? "합격" : "불합격");
	}
}
