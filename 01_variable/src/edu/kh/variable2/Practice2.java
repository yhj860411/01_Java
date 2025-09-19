package edu.kh.variable2;

public class Practice2 {

	public static void main(String[] args) {
		
		String name1 = "영숙";
		int age1 = 28;
		double height1 = 165.7;
		
		System.out.printf("출연자 이름: %s\n", name1);
		System.out.printf("나이: %d세\n", age1);
		System.out.printf("키: %.1fcm\n\n", height1);
		
		double ageD1 = age1;
		System.out.printf("자동 형변환된 나이(double): %.1f\n\n", ageD1);
		
		System.out.printf("강제 형변환된 키(int): %d\n\n", (int)height1);
		
		int score1 = 87;
		int score2 = 92;
		double avr = (score1 + score2) / 2.0;
		System.out.printf("%s님의 매칭 점수 평균은 %.1f입니다!", name1, avr);
		

		

	}

}
