package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// service : 특정 기능(비즈니스 로직)을 제공하는 패키지
// (비밀번호 암호화, 파일 검사...)

public class AbstractionService {

	// 속성
	// 기능
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1 (== 참조변수)
		// new People() : 새로운 People 객체를 Heap 영역에 생성
		
		/*
		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNo = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120";
		p1.phone = "010-1234-1234";
		p1.age = 20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
		
		// 값을 호출한자리로 얻어온다 == getter
		//p1.getName(); // 메소드의 호출
		
		// 전달한 값을 객체의 필드에 세팅한다 == setter
		//p1.setName("홍길동");
		          // 전달인자
		
		// 전달하는 값(인자) : 전달인자
		// p1에 홍길동 데이터 세팅하기
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("123456-1234567");
		p1.setAddress("서울시 중구 남대문로 120");
		p1.setPhone("010-1234-1234");
		p1.setAge(20);
		
		// p1에 저장된 데이터 불러오기
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		// 본인 객체
		// People 클래스 이용하여 본인 이름 객체 생성하기
		// 본인의 정보 setter 값 대입
		// 본인의 정보 getter 이용하여 콘솔창 출력까지
		System.out.println("===================");
		
		People yhj = new People();
		
		yhj.setName("용혜중");
		yhj.setGender('남');
		yhj.setpNo("860411-1234567");
		yhj.setAddress("경기도 고양시 덕양구 호국로860");
		yhj.setPhone("010-3464-7008");
		yhj.setAge(39);
		
		System.out.println(yhj.getName());
		System.out.println(yhj.getGender());
		System.out.println(yhj.getpNo());
		System.out.println(yhj.getAddress());
		System.out.println(yhj.getPhone());
		System.out.println(yhj.getAge());
	}
}
