package com.question5;

/**
 * @author VrishaliMore
 *
 */

// To achieve Multiple inheritance and solve Diamond problem method overriding is used

public class Abc implements  Booksroom , Studyroom {

	@Override
	public String location(String location) {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Studyroom.super.display();
		
	}
	
	@Override
	public void addbook() {
		// TODO Auto-generated method stub
		Booksroom.super.addbook();
		
	}
	
	
}
