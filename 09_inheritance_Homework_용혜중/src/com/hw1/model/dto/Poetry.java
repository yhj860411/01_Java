package com.hw1.model.dto;

public class Poetry extends Book{
	private int numberOfPeoms;
	
	public Poetry() {}

	public Poetry(String title, String author, int numberOfPeoms) {
		super(title, author);
		this.numberOfPeoms = numberOfPeoms;
	}

	public int getNumberOfPeoms() {
		return numberOfPeoms;
	}

	public void setNumberOfPeoms(int numberOfPeoms) {
		this.numberOfPeoms = numberOfPeoms;
	}

	@Override
	public void displayInfo() {
		System.out.println("[시집] 제목 : " + getTitle() + " / 저자 : " + getAuthor() + " / 시 수 : " + numberOfPeoms);
		
	}

}
