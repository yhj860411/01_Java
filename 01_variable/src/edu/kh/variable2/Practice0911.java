package edu.kh.variable2;

public class Practice0911 {

	public static void main(String[] args) {
		
		int age = 39;
		System.out.println("나는 " + age + "살입니다.");
		System.out.println();
		
		int score = 90;
		System.out.printf("최종 점수 : %d\n\n", score+10);
		
		int a = 10;
		double b = a;
		System.out.println(b);
		System.out.println();
		
		float pi = 3.14159f;
		System.out.printf("pi: %.2f, 정수: %d\n\n", pi, (int)pi);
		
		char ch = 'A';
		int num = ch;
		System.out.printf("문자: %c, 코드값: %d\n\n", ch, num);
		
		final int PRICE = 5000;
		int count = 3;
		System.out.printf("물건 가격: %d원, 개수: %d개, 총액: %d원\n\n", PRICE, count, PRICE*count);
		
		int langScore = 95, engScore = 87, mathScore = 90;
		int totalScore = langScore + engScore + mathScore;
		double aveScore = totalScore / 3.0;
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", langScore, engScore, mathScore);
		System.out.printf("총점: %d, 평균: %.2f\n\n", totalScore, aveScore);
		
		
	}

}
