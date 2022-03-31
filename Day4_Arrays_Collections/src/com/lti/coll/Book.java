package com.lti.coll;

public class Book {
	
	int bookId;
	String bName;
	int noPages;
	double cost ;
	public Book(int bookId, String bName, int noPages, double cost) {
		super();
		this.bookId = bookId;
		this.bName = bName;
		this.noPages = noPages;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bName=" + bName + ", noPages=" + noPages + ", cost=" + cost + "]";
	}
	
	
	

}
