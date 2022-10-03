package com.question5;

/**
 * @author VrishaliMore
 *
 */
public interface Booksroom extends Library {
	String location(String location);
  
	default void addbook() {
	System.out.println("Adding book");
	
	
}
}
