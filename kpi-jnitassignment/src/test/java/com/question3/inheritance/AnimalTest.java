package com.question3.inheritance;
// Example Of inheritance
// Class : Animal,Dog, Cat,BabyDog
// Test Case:AnimalTest

/**
 * @author VrishaliMore
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void testanimal() {
		Animal a= new Animal();  
		
	 assertEquals("eating",a.eat("eating"));
		System.out.println("Animal method:"+a.eat("eating"));
	}
	
	@Test
	public void testDog() {
		//Animal a= new Animal();
		Dog dog = new Dog();
		assertEquals("eating", dog.eat("eating"));
		assertEquals("Barking",dog.bark());
		System.out.println("Dog is "+dog.eat("eating"));
		System.out.println("Dog is "+dog.bark());
	}
	
	@Test
	public void testBabyDog() {
		//Animal a= new Animal();
	    //Dog dog = new Dog();
		BabyDog bdog = new BabyDog();
	
		assertEquals("eating", bdog.eat("eating"));
		assertEquals("Barking",bdog.bark());
		assertEquals("Black",bdog.color());
		
		System.out.println("Dog is "+bdog.eat("eating"));
		System.out.println("Dog is "+bdog.bark());
		System.out.println("Dog is "+bdog.color());
	}
	
	
	@Test
	
	public void testCat() {
	//	Animal a= new Animal();
		Cat cat = new Cat();
		String eatt= cat.eat("eating");
		assertEquals(eatt, cat.eat("eating"));
		assertEquals("White",cat.color());
		System.out.println("Cat is "+cat.eat("eating"));
		System.out.println("Cat is "+cat.color());
	}
	
	
}
