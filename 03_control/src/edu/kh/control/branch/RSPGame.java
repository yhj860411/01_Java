package edu.kh.control.branch;

import java.util.Scanner;

public class RSPGame {
	
	public void RSPGame2() {
		// 가위바위보 게임
		// 몇 판할지 입력받음
		// 입력받은 판 수 만큼 반복
				
		// 컴퓨터 : Math.random() : 0.0 ~ 1.0 사이 난수 생성
		// 1 ~ 3 사이 난수 생성
		// 1이면 가위, 2이면 바위, 3이면 보 지정
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승! / 졌습니다 ㅠㅠ / 비겼습니다
		// 매판마다 - 현재기록 : 2승 1무 0패 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[가위 바위 보 게임~!]");
		System.out.print("몇 판? : ");
		int round = sc.nextInt();
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i <= round; i++) {
			System.out.println("\n" + i + "번째 게임");
			System.out.print("가위/바위/보 중 하나 입력 : ");
			String input = sc.next();
			
			int random = (int) Math.random() * 3 + 1;
			String input2 = null;
			
			switch (random) {
			case 1 : input2 = "가위"; break;
			case 2 : input2 = "바위"; break;
			case 3 : input2 = "보"; break;
			}
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", input2);
			
			if (input.equals(input2)) {
				System.out.println("비겼습니다.");
				draw++;
			} else {
				boolean win1 = input.equals("가위") && input.equals("보");
				boolean win2 = input.equals("바위") && input.equals("보");
				boolean win3 = input.equals("보") && input.equals("보");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("패배하였습니다.");
					lose++;
				}
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패", win, draw, lose);
			
		}
	}

}
