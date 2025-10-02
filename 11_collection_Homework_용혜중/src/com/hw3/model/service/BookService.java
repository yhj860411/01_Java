package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Book> books = new ArrayList<>();
	
	private List<Book> bookMark = new ArrayList<>();
	
	public BookService() {
		books.add(new Book("1111", "세이노의 가르침", "세이노", 6480, "데이원"));
		books.add(new Book("2222", "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		books.add(new Book("3333", "역행자", "자청", 17550, "웅진지식하우스"));
		books.add(new Book("4444", "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		books.add(new Book("5555", "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}
	
	public void displayMenu() {
		int menuNum = 0;
		do {
			System.out.println("===도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: System.out.println(addBook()); break;
			case 2: select(); break;
			case 3: System.out.println(update()); break;
			case 4: System.out.println(remove()); break;
			case 5: System.out.println(addMark()); break;
			case 6: System.out.println(removeMark()); break;
			case 7: selectMark(); break;
			case 8: System.out.println(randomSelect());  break;
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("잘못된 번호입니다.");
			}
		} while(menuNum != 0);
	}
		
		public String addBook() {
			System.out.println("==========도서 등록==========");
			System.out.print("도서 번호 : ");
			String bookNum = sc.next();
			sc.nextLine();
			System.out.print("도서 제목 : ");
			String title = sc.nextLine();
			System.out.print("도서 저자 : ");
			String author = sc.nextLine();
			System.out.print("도서 가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("도서 출판사 : ");
			String publisher = sc.nextLine();
			
			if(books.add(new Book(bookNum, title, author, price, publisher))) {
				return "등록 완료";
			} else {
				return "등록 실패";
			}
		}
		
	public void select() {
		if(books.isEmpty()) {
			System.out.println("도서 정보가 없습니다.");
			return;
		}
		for(Book bk : books) {
			System.out.println(bk);
		}
	}
	
	public String update() {
		if(books.isEmpty()) {
			return "도서 정보가 없습니다.";
		}
		System.out.println("===========도서 수정===========");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		String num = sc.next();
		boolean flag = true;
		Book upbook = null;
		
		for(Book bk : books) {
			if(bk.getBookNum().equals(num)) {
				upbook = bk;
				flag = false;
				break;
			}
		}
		if(flag) {
			return "해당 번호의 도서가 없습니다.";
		}
		
		int input = 0;
		do {
			System.out.println("1. 도서명");
			System.out.println("2. 도서 저자");
			System.out.println("3. 도서 가격");
			System.out.println("4. 도서 출판사");
			System.out.println("0. 수정 종료");
			System.out.print("어떤 정보를 수정하시겠습니까?");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: 
				System.out.println("========도서명 수정=========");
				System.out.print("수정할 도서명을 입력하세요 : "); 
				upbook.setTitle(sc.nextLine());
				System.out.println("수정 완료");
				break;
			case 2: 
				System.out.println("========도서 저자 수정=========");
				System.out.print("수정할 저자명을 입력하세요 : "); 
				upbook.setAuthor(sc.nextLine());
				System.out.println("수정 완료");
				break;
			case 3: 
				System.out.println("========도서 가격 수정=========");
				System.out.print("수정할 가격을 입력하세요 : "); 
				upbook.setPrice(sc.nextInt());
				System.out.println("수정 완료");
				break;
			case 4: 
				System.out.println("========도서 출판사 수정=========");
				System.out.print("수정할 출판사명을 입력하세요 : "); 
				upbook.setPublisher(sc.nextLine());
				System.out.println("수정 완료");
				break;
			case 0: break;
			default: System.out.println("잘못 입력하였습니다");
			}
		} while(input !=0);
		return "수정을 종료합니다";
	}
	
	public String remove() {
		if(books.isEmpty()) {
			return "삭제할 도서가 없습니다.";
		}
		System.out.println("========도서 삭제==========");
		for(Book bk : books) {
			System.out.println(bk);
		}
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		String input = sc.next();
		
		for(Book bk : books) {
			if(input.equals(bk.getBookNum())) {
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				char ch = sc.next().toUpperCase().charAt(0);
				if(ch == 'Y') {
					books.remove(bk);
					return "삭제가 완료되었습니다";
				} else {
					return "삭제를 진행하지 않습니다";
				}
			}
		}
		return "해당 번호의 도서가 없습니다.";
		
	}
	
	public String addMark() {
		if(books.isEmpty()) {
			return "즐겨찾기할 도서가 없습니다.";
		}
		System.out.println("========즐겨찾기 추가==========");
		System.out.print("즐겨찾기 할 도서 번호 : ");
		String input = sc.next();
		
		for(Book bk : books) {
			if(input.equals(bk.getBookNum())) {
				bookMark.add(bk);
				return bk.getBookNum() + "번 도서가 즐겨찾기에 추가 되었습니다.";
			}
		}
		return "해당 번호의 도서가 존재하지 않습니다.";
	}
	
	public String removeMark() {
		if(bookMark.isEmpty()) {
			return "즐겨찾기에 도서가 없습니다.";
		}
		System.out.println("========즐겨찾기 삭제==========");
		System.out.print("삭제할 도서 번호 : ");
		String input = sc.next();
		
		for(Book bk : bookMark) {
			if(input.equals(bk.getBookNum())) {
				bookMark.remove(bk);
				return bk.getBookNum() + "번 도서가 삭제 되었습니다.";
			}
		}
		return "해당 번호의 도서가 존재하지 않습니다.";
	}
	
	public void selectMark() {
		if(bookMark.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요.");
			return;
		}
		for(Book bk : bookMark) {
			System.out.println(bk);
		}
	}
	
	public String randomSelect() {
		if(books.isEmpty()) {
			return "도서 정보가 없습니다.";
		}
		int index = (int)((Math.random()) * (books.size()));
		return books.get(index).getTitle();
	}
}


