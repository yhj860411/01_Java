package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;

public class Zoo {
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Animal> animals = new ArrayList<>();
	
	public Zoo() {}
	
	
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void showAnimals() {
		for(Animal ani : animals) {
			ani.sound();
		}
	}
	
	public void displayMenu() {
		int input;
		do {
			System.out.println("****** KH 동물원 ******");
			System.out.println("원하는 작업을 선택하세요 :");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택: ");
			input = sc.nextInt();
			
			switch(input) {
			case 1: showAnimals(); break;
			case 2: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("번호를 잘못 입력하였습니다.");
			}
		} while(input != 2);
		
		
		
	}

}
