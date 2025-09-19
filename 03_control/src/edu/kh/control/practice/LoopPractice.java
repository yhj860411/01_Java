package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		String result = "";
		int sum = 0;

		for (int i = 1; i <= input; i++) {
			sum += i;
			if (i == input) {
				result += i;
			} else {
				result += i + " + ";
			}
		}
		System.out.printf("%s = %d", result, sum);
	}

	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		if (input1 >= 1 && input2 >= 1) {
			// 일단 start에 첫번째 숫자, end에 두번째 숫자 대입
			int start = input1;
			int end = input2;

			if (input1 > input2) {
				start = input2;
				end = input1;
			}
			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice5() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		System.out.printf("===== %d단 =====\n", dan);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}

	public void practice6() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {
			for (int i = dan; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
			}

		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
	}

	public void practice7() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if (i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		System.out.printf("\ncount : %d", count);
	}

}
