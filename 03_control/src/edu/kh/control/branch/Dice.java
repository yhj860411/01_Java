package edu.kh.control.branch;

import java.util.Scanner;

public class Dice {

	Scanner sc = new Scanner(System.in);

	public void DiceGame() {

		int answer = (int) (Math.random() * 6 + 1);
		String input = null;
		int count = 0;
		int win = 0;

		System.out.println("===주사위 맞히기 게임 시작===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료하려면 \"종료\" 입력)");

		while (true) {
			System.out.println();
			System.out.print("숫자 입력>> ");
			input = sc.next();

			System.out.println();

			if (input.equals("종료")) {
				System.out.printf("총 시도 횟수: %d번\n", count);
				System.out.printf("정답 횟수: %d번\n", win);
				if (count ==0) {
					System.out.println("게임 플레이하지 않았습니다.");
				} else {
					System.out.println("정답률: " + (win*100/count) + "%");
				}
				
				break;
			} else {
				int num = Integer.parseInt(input);
				if (num >= 1 && num <= 6) {
					if (num > answer) {
						System.out.println("틀렸습니다. 더 작은 수를 입력하세요.");
						count++;
					} else if (num < answer) {
						System.out.println("틀렸습니다. 더 큰 수를 입력하세요.");
						count++;
					} else {
						System.out.println("정답입니다!");
						count++;
						win++;
						answer = (int) (Math.random() * 6 + 1);
						System.out.println("새로운 주사위 숫자가 생성되었습니다.");

					}
				} else {
					System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");
				}

			}
		}

	}

}
