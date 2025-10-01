package com.hw3.model.dto;

public class Book {
	private String bookNum;
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {}

	public Book(String bookNum, String title, String author, int price, String publisher) {
		super();
		this.bookNum = bookNum;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return bookNum + "번 도서 : [도서제목 : " + title + " / 도서저자 : " + author + 
				" / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]";
	}
	
	

}
