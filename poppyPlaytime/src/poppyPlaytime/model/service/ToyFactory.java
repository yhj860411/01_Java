package poppyPlaytime.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
	


}
