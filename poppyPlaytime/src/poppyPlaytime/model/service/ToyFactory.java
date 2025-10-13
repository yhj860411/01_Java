package poppyPlaytime.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import poppyPlaytime.model.dto.Toy;

public class ToyFactory {
	
	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toySet = new HashSet<Toy>();
	
	Map<Integer, String> material = new HashMap<>();
	
	// 가변인자 : 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	// 자료형...변수명
	// 가변인자를 통해 들어온 매개변수의 데이터 타입은 배열!
	public Set<String> inputMaterial(int...a) {
		// 1. 매개변수로 전달받은 materials 파악하기 == 배열로 정수형 데이터가 여러개
		// ex) [1,2,4]
		// 2. 재료를 저장하여 반환할 Set객체를 생성
		Set<String> toyMaterial = new HashSet<String>();
		// 3. inputMaterial 에 재료명을 추가해야함
		// -> 단, 재료는 Map에 존재하는 것만 추가 가능
		for(int materialKey : a) {
			// Map에서 재료 고유 번호(Key)에 대응하는 재료명(Value)를 가져와서 추가
			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null
			String materialValue = material.get(materialKey);
			if(materialValue != null) {
				// 재료 목록에 해당 키(재료)가 있을 때
				toyMaterial.add(materialValue);
			}
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
	
	/**
	 * 메뉴를 보여주어 번호를 입력받아 각 기능을 수행
	 */
	public void displayMenu() {
		int menuNum;
		while(true) {// 기능을 완료할 때마다 메뉴 반복 출력
			try {// 메뉴번호 입력시 다른 문자열로 잘못 입력할 경우에 대비해 try-catch문 사용
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
			default: // 1~7 이외의 다른 정수를 입력할 경우
				System.out.println("번호를 잘못 입력하셨습니다.");
			} 
			} catch(InputMismatchException e) {//문자열을 입력할 경우 -> 정수입력에 대한 예외 처리
				System.out.println("번호를 입력해주세요.");
				sc.nextLine();//이거 없으면, 예외 발생 시(문자열 입력 시) while문 무한으로 돌아감
			}
			System.out.println();
		}
	}
	
	/**
	 * 전체 장난감 목록을 보여주는 메서드
	 */
	public void displayToy() {
		if(toySet.isEmpty()) {
			System.out.println("장난감이 없습니다.");
			return;
		}
		
		System.out.println("<전체 장난감 목록>");
		int i = 1;// 목록마다 앞에 번호를 달아줌
		for(Toy toy : toySet) {
			System.out.print((i++) + ". ");
			toy.information();
		}
	}
	
	/**
	 * 새로운 장난감의 정보를 입력받아 장난감 목록에 추가하는 메서드
	 */
	public String addToy() {
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		/*
		 * 옵션 : 똑같은 이름의 장난감 추가를 방지하기 위한 코드문
	    boolean flag;
		do{
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
		*/	
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("색상 : ");
		String color = sc.next();
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String date = sc.next();
		
		Set<String> newMaterial = new HashSet<String>();// 해당 장난감의 재료를 담기 위한 Set 생성
		
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
	
	/**
	 * 장난감 이름을 입력받아 해당 장난감을 목록에서 삭제하는 메서드
	 */
	public String deleteToy() {
		if(toySet.isEmpty()) {
			return "장난감이 없습니다.";
		}
		
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
	
	/**
	 * 전체 장난감들을 제조일 순(오름차순)으로 정렬하여 표시하는 메서드
	 */
	public void arrangeToy() {
		if(toySet.isEmpty()) {
			System.out.println("장난감이 없습니다.");
			return;
		}
		
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
	
	/**
	 * 전체 장난감들을 사용가능연령별로 묶어서 표시하는 메서드
	 */
	public void ageToy() {
		if(toySet.isEmpty()) {
			System.out.println("장난감이 없습니다.");
			return;
		}
		
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		int countE = 0;//객체를 출력할 때마다 1씩 증가하여 toySet의 size까지 증가하면 반복 종료
		boolean flag = true;
		for(int ageCount = 1; countE < toySet.size(); ageCount++) {//countE가 toySet의 size와 같아지면 모든 객체 출력이 완료된 것이므로 반복 종료
			flag = true;
			int i = 1;
			for(Toy toy :toySet) {// ageCount 연령에 해당하는 장난감이 있는지 목록에서 검색하여 출력
				if(toy.getAge() == ageCount) {
					if(flag) {
						System.out.println("[연령:" + ageCount + "세]");
						flag = false;//"[연령:*세]" 문구의 중복 출력을 방지
					}
					System.out.print((i++) + ". ");
					toy.information();
					countE++;
				}
			}
		}
	}
	
	/**
	 * 등록된 재료key들의 Set를 반환하는 메서드. 재료추가(addMaterial) 및 삭제(deleteMaterial) 메서드에서 호출
	 */
	public Set<Integer> displayMaterial() {
		System.out.println("===현재 등록된 재료===");
		Set<Integer> materialKey = material.keySet();//재료Map의 key들을 Set로 생성
		for(Integer key : materialKey) {
			System.out.println(key + ": " + material.get(key));
		}
		System.out.println("====================");
		return materialKey;
	}
	
	/**
	 * 추가할 재료의 고유번호와 이름을 입력받아 등록재료목록(material)에 추가하는 메서드
	 */
	public String addMaterial() {
		System.out.println("<재료 추가>");
		
		Set<Integer> keySet = displayMaterial();// 재료 표시 메서드를 호출하여, 등록재료목록을 보여주고, 반환된 Set를 keySet에 대입
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int inputKey = sc.nextInt();
		System.out.print("재료명 입력 : ");
		String name = sc.next();
		
		if(keySet.contains(inputKey)) {// 입력받은 키가 이미 목록에 존재하는 경우
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N): ");
			char input = sc.next().toUpperCase().charAt(0);
			if(input == 'Y') {
				material.put(inputKey, name);// map에서 key가 중복될 수 없으므로 덮어씌어짐
				return "재료가 성공적으로 덮어쓰기 되었습니다.";
			} else{
				return "재료등록이 취소되었습니다.";
			}
		}
		// 입력받은 키가 목록에 없는 경우
		material.put(inputKey, name);
		return "새로운 재료가 성공적으로 등록되었습니다.";
	}
	
	/**
	 * 재료명을 입력받아, 해당 재료가 등록재료목록(material)에 있는지 확인 후 제거
	 */
	public String deleteMaterial() {
		if(material.isEmpty()) {
			return "등록된 재료가 없습니다.";
		}
		
		System.out.println("<재료 삭제>");
		
		Set<Integer> keySet = displayMaterial();// 재료 표시 메서드를 호출하여, 등록재료목록을 보여주고, 반환된 Set를 keySet에 대입
		
		System.out.print("삭제할 재료명 입력 : ");
		String name = sc.next();
		
		for(Integer key : keySet) {
			if(material.get(key).equals(name)) {// 입력받은 재료명에 해당하는 재료를 찾은 경우
				String temp = material.remove(key);// 재료 제거 후 제거한 재료를 temp에 대입
				return "재료 '" + temp + "'가 성공적으로 제거되었습니다.";
			}
		}
		return "해당 이름의 재료가 존재하지 않습니다.";
	}
}
