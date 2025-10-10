package poppyPlaytime.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Toy {
	private String name;
	private int age;
	private int price;
	private String color;
	private String date;
	private Set<String> toyMaterial;

	public Toy() {}

	public Toy(String name, int age, int price, String color, String date, Set<String> toyMaterial) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
		this.toyMaterial = toyMaterial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Set getMaterial() {
		return toyMaterial;
	}

	public void setMaterial(Set<String> toyMaterial) {
		this.toyMaterial = toyMaterial;
	}

	public void information() {// 장난감들의 정보 출력포맷 설정
		
		System.out.print("이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + 
				age + " / 제조년월일 : " + date + " / 재료 : ");
		
		List<String> list = new ArrayList<>(toyMaterial);// 재료Set의 출력포맷을 구현하기 위해 List로 변환
		for(int i = 0; i < list.size(); i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(list.get(i));
		}
		System.out.println();
	}

}
