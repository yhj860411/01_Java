package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack snack1 = new Snack();
	
	public SnackController() {
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		snack1.setKind(kind);
		snack1.setName(name);
		snack1.setFlavor(flavor);
		snack1.setNumOf(numOf);
		snack1.setPrice(price);
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		return snack1.information();
	}

}
