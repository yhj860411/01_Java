package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] array = new int[9];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i] + " ");
			if (i % 2 == 0) {
				sum += array[i];
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {
		int[] array2 = new int[9];
		int sum = 0;

		for (int i = 0; i < array2.length; i++) {
			array2[i] = array2.length - i;
			System.out.print(array2[i] + " ");
			if (i % 2 == 1) {
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

		for (int i = 0; i < array3.length; i++) {
			array3[i] = i + 1;
			System.out.print(array3[i] + " ");
		}
	}

	public void practice4() {
		int[] array4 = new int[5];
		for (int i = 0; i < array4.length; i++) {
			System.out.print("입력 " + i + " : ");
			array4[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < array4.length; i++) {
			if (input == array4[i]) {
				System.out.println("인덱스 : " + i);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String input = sc.next();
		char[] array5 = new char[input.length()];
		for (int i = 0; i < array5.length; i++) {
			array5[i] = input.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		int count = 0; // 내가 찾는 글자 개수를 세기 위한 변수
		for (int i = 0; i < array5.length; i++) {
			if (ch == array5[i]) {
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

		for (int i = 0; i < array6.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			array6[i] = sc.nextInt();
			sum += array6[i];
		}
		for (int i = 0; i < array6.length; i++) {
			System.out.print(array6[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}

	public void practice7() {
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		char[] array7 = new char[input.length()];
		for (int i = 0; i < 8; i++) {
			array7[i] = input.charAt(i);
			System.out.print(array7[i]);
		}
		System.out.println("******");
	}

	public void practice8() {
		while (true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();

			if ((input >= 3) && (input % 2 == 1)) {
				int[] array8 = new int[input];
				int num = 1;
				for (int i = 0; i < array8.length; i++) {
					if (i < (array8.length / 2)) {
						array8[i] = num++;
					} else {
						array8[i] = num--;
					}
				}
				for (int i = 0; i < array8.length; i++) {
					System.out.print(array8[i]);
					if (i != array8.length - 1) {
						System.out.print(", ");
					}
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}

	public void practice9() {
		int[] array9 = new int[10];
		System.out.print("발생한 난수 : ");
		for (int i = 0; i < 10; i++) {
			array9[i] = (int) (Math.random() * 10 + 1);
			System.out.print(array9[i] + " ");
		}
	}

	public void practice10() {
		int[] array10 = new int[10];
		int max = 0;
		int min = 10;

		System.out.print("발생한 난수 : ");
		for (int i = 0; i < 10; i++) {
			array10[i] = (int) (Math.random() * 10 + 1);
			System.out.print(array10[i] + " ");
			if (array10[i] > max) {
				max = array10[i];
			}
			if (array10[i] < min) {
				min = array10[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice11() {
		int[] array11 = new int[10];

		for (int i = 0; i < array11.length; i++) {
			array11[i] = (int) (Math.random() * 10 + 1);
			for (int k = 0; k < i; k++) {
				if (array11[i] == array11[k]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < array11.length; i++) {
			System.out.print(array11[i] + " ");
		}
	}

	public void practice12() {
		int[] array12 = new int[6];

		for (int i = 0; i < array12.length; i++) {
			array12[i] = (int) (Math.random() * 45 + 1);
			for (int k = 0; k < i; k++) {
				if (array12[i] == array12[k]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(array12);
		for (int i = 0; i < array12.length; i++) {
			System.out.print(array12[i] + " ");
		}
	}

	public void practice13() {
		System.out.print("문자열 : ");
		String input = sc.nextLine();

		char[] array13 = new char[input.length()];
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < array13.length; i++) {
			array13[i] = input.charAt(i);
			System.out.print(array13[i]);
			if (i != array13.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + array13.length);
	}

}
