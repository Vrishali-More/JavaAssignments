package com.question3.polymorphism;

// Method overloading

/**
 * @author VishaliMore
 *
 */
public class Student1 {
	int id;
	String name;
	Student1 (){
	  System.out.println("Student");
	}
	Student1(int i)
	{
		id= i;
		System.out.println("Student id :"+ id);
		
	}
	Student1(int i, String n){
		id=i;
		name=n;
		System.out.println("student id and name:"+ id+""+name);
	}
	
 void display() {
	 System.out.println(id+""+name);
 }

}
