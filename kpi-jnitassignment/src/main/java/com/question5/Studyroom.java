package com.question5;

/**
 * @author VrishaliMore
 *
 */
public interface Studyroom extends Library {
	String location(String location);
	 default void display() {
		 System.out.println("This is Studyroom in Library");
	 }
 }

