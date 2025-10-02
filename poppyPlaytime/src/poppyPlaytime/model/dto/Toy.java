package poppyPlaytime.model.dto;

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

	@Override
	public String toString() {
		
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + 
				age + " / 제조년월일 : " + date + " / 재료 : " + toyMaterial;
	}

}
