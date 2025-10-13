package poppyPlaytime.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
	

	@Override
	public int hashCode() {
		return Objects.hash(age, color, date, name, price, toyMaterial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(date, other.date)
				&& Objects.equals(name, other.name) && price == other.price
				&& Objects.equals(toyMaterial, other.toyMaterial);
	}

	/**
	 * 장난감들의 정보 출력포맷 설정
	 */
	public void information() {
		
		System.out.print("이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + 
				age + " / 제조년월일 : " + date + " / 재료 : ");
		
		List<String> list = new ArrayList<>(toyMaterial);// 재료Set의 출력포맷을 구현하기 위해 List로 변환
		for(int i = 0; i < list.size(); i++) {
			if(i != 0) {// 인덱스가 1 이상이 되면 앞에 ","를 추가
				System.out.print(", ");
			}
			System.out.print(list.get(i));
		}
		System.out.println();
	}

}
