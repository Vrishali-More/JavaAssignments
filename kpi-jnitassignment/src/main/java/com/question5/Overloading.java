package com.question5;

public class Overloading {
	Overloading(){
		System.out.println("Overloading");
	}
	Overloading(int a, int b){
		System.out.println("Paramert of DiaOverloading");
	}
}
 
/*
 * We can not achieve Solution of diamond problem using method Overloading 
 * 
 * we can achieve it using method overriding
 * Java does not allow multiple inheritance where one class can inherit
 *  properties from more than one class it is know as diamond problem
 *  to solve a diamond problem and achieve multiple inheritance we use interface
 *  in java 
 *   
 * */
