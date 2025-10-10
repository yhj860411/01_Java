package poppyPlaytime.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import poppyPlaytime.model.dto.Toy;

public class ToyFactory {
	
	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toySet = new HashSet<Toy>();
	
	Map<Integer, String> material = new HashMap<>();
	
	public Set<String> inputMaterial(int...a) {
		Set<String> toyMaterial = new HashSet<String>();
		for(int i : a) {
			toyMaterial.add(material.get(i));
		}
		
		return toyMaterial;
	}
	
	public ToyFactory() {
		
		material.put(1, "면직물");
		material.put(2, "플라스틱");
		material.put(3, "유리");
		material.put(4, "고무");
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", inputMaterial(1,4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", inputMaterial(1,2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", inputMaterial(1,2)));
		toySet.add(new Toy("킷냅", 8, 27000, "보라색", "19960128", inputMaterial(1,2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", inputMaterial(1,2,4)));
	}
	
	public void displayMenu() {
		int menuNum;
		while(true) {
			try {
			System.out.println("<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.print("선택 : ");

			menuNum = sc.nextInt();
			System.out.println();
			
			switch(menuNum) {
			case 1: displayToy(); break;
			case 2: System.out.println(addToy()); break;
			case 3: System.out.println(deleteToy()); break;
			case 4: arrangeToy(); break;
			case 5: ageToy(); break;
			case 6: System.out.println(addMaterial()); break;
			case 7: System.out.println(deleteMaterial()); break;
			default: 
				System.out.println("번호를 잘못 입력하셨습니다.");
			} 
			} catch(InputMismatchException e) {//정수입력에 대한 예외 처리
				System.out.println("번호를 입력해주세요.");
				sc.next();//이거 없으면, 예외 발생 시 while문 무한으로 돌아감
			}
			System.out.println();
		}
	}
	
	public void displayToy() {
		System.out.println("<전체 장난감 목록>");
		int i = 1;
		for(Toy toy : toySet) {
			System.out.print((i++) + ". ");
			toy.information();
		}
	}
	
	public String addToy() {
		System.out.println("<새로운 장난감 추가>");
		boolean flag;
		String name;
		do{//똑같은 이름의 장난감 추가 방지
			flag = false;
			System.out.print("장난감 이름 : ");
			name = sc.next();
			for(Toy toy : toySet) {
				if (name.equals(toy.getName())) {
					System.out.println("해당 이름의 장난감이 이미 있습니다.");
					flag = true;
					break;
				}
			}
		} while(flag);	
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("색상 : ");
		String color = sc.next();
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String date = sc.next();
		
		Set<String> newMaterial = new HashSet<String>();
		
		while(true) {
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			String input = sc.next();
			if(input.equals("q") || input.equals("Q") ) break;
			
			if(material.containsValue(input)) {//입력한 재료가 재료리스트에 등록되어있는지 확인
				newMaterial.add(input);
			} else {
				System.out.println("해당 재료가 등록되어있지 않습니다.");
			}			
		}
		toySet.add(new Toy(name, age, price, color, date, newMaterial));
		return "새로운 장난감이 추가되었습니다.";
	}
	
	public String deleteToy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요: ");
		String input = sc.next();
		boolean flag = false;
		for(Toy toy : toySet) {
			if(input.equals(toy.getName())) {
				flag = toySet.remove(toy);
				break;
			}
		}
		if(flag) {
			return "장난감이 삭제되었습니다.";
		}
		return "해당 장난감이 없습니다.";
	}
	
	public void arrangeToy() {
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		List<Toy> toyList = new ArrayList<Toy>(toySet);//장난감 목록을 Set -> List로 변환
		Collections.sort(toyList, new Comparator<Toy>() {//익명내부클래스 사용
			@Override
		public int compare(Toy o1, Toy o2) {//date변수가 String형이므로 compareTo 사용
			return o1.getDate().compareTo(o2.getDate());
		}
		});
		int i = 1;
		for(Toy toy : toyList) {
			System.out.print((i++) + ". ");
			toy.information();
		}
	}
	
	public void ageToy() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		int countE = 0;//객체를 출력할 때마다 1씩 증가하여 toySet의 size까지 증가하면 반복 종료
		boolean flag = true;
		for(int ageCount = 1; countE < toySet.size(); ageCount++) {
			flag = true;
			int i = 1;
			for(Toy toy :toySet) {
				if(toy.getAge() == ageCount) {
					if(flag) {//"[연령:*세]" 문구의 중복 출력을 방지
						System.out.println("[연령:" + ageCount + "세]");
						flag = false;
					}
					System.out.print((i++) + ". ");
					toy.information();
					countE++;
				}
			}
		}
	}
	
	public Set<Integer> displayMaterial() {//등록된 재료 표시 메서드. 재료추가 및 삭제 메서드에서 호출
		System.out.println("===현재 등록된 재료===");
		Set<Integer> materialKey = material.keySet();
		for(Integer key : materialKey) {
			System.out.println(key + ": " + material.get(key));
		}
		System.out.println("====================");
		return materialKey;
	}
	
	public String addMaterial() {
		System.out.println("<재료 추가>");
		
		Set<Integer> keySet = displayMaterial();// 재료 표시 메서드를 호출하여 반환된 Set를 keySet에 대입
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int inputKey = sc.nextInt();
		System.out.print("재료명 입력 : ");
		String name = sc.next();
		
		if(keySet.contains(inputKey)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N): ");
			char input = sc.next().toUpperCase().charAt(0);
			if(input == 'Y') {
				material.put(inputKey, name);
				return "재료가 성공적으로 덮어쓰기 되었습니다.";
			} else{
				return "재료등록이 취소되었습니다.";
			}
		}
		material.put(inputKey, name);
		return "새로운 재료가 성공적으로 등록되었습니다.";
	}
	
	public String deleteMaterial() {
		System.out.println("<재료 삭제>");
		
		Set<Integer> keySet = displayMaterial();
		
		System.out.print("삭제할 재료명 입력 : ");
		String name = sc.next();
		
		for(Integer key : keySet) {
			if(material.get(key).equals(name)) {
				String temp = material.remove(key);
				return "재료 '" + temp + "'가 성공적으로 제거되었습니다.";
			}
		}
		return "해당 이름의 재료가 존재하지 않습니다.";
	}
}
