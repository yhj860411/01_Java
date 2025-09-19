package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] array = new int[9];
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
			System.out.print(array[i] + " ");
			if(i%2 == 0) {
				sum += array[i];
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		int[] array2 = new int[9];
		int sum = 0;
		
		for(int i = 0; i < array2.length; i++) {
			array2[i] = array2.length - i;
			System.out.print(array2[i] + " ");
			if(i%2 == 1) {
				sum += array2[i];
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] array3 = new int[input];

		for(int i = 0; i < array3.length; i++) {
			array3[i] = i+1;
			System.out.print(array3[i] + " ");
		}
	}
	
	public void practice4() {
		int[] array4 = new int[5];
		for(int i = 0; i < array4.length; i++) {
			System.out.print("입력 " + i + " : ");
			array4[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i < array4.length; i++) {
			if(input == array4[i]) {
				System.out.println("인덱스 : " + i);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String input = sc.next();
		char[] array5 = new char[input.length()];
		for(int i = 0; i< array5.length; i++) {
			array5[i] = input.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		int count = 0; // 내가 찾는 글자 개수를 세기 위한 변수
		for(int i = 0; i < array5.length; i++) {
			if(ch == array5[i]) {
				System.out.print(i + " ");
				count++;
			}	
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice6() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] array6 = new int[input];
		int sum = 0;
		
		for(int i = 0; i < array6.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			array6[i] = sc.nextInt();
			sum += array6[i];
		}
		for(int i = 0; i < array6.length; i++) {
			System.out.print(array6[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7() {
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		char[] array7 = new char[input.length()];
		for(int i = 0; i< 8; i++) {
			array7[i] = input.charAt(i);
			System.out.print(array7[i]);
		}
		System.out.println("******");
	}
	
	public void practice9() {
		int[] array9 = new int[10];
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < 10; i++) {
			array9[i] = (int)(Math.random() * 10 + 1);
			System.out.print(array9[i] + " ");
		}
	}
	
	public void practice10() {
		int[] array10 = new int[10];
		int max;
		int min;
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < 10; i++) {
			array10[i] = (int)(Math.random() * 10 + 1);
			System.out.print(array10[i] + " ");
		}
	}

}
