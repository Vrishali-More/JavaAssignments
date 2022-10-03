package com.question3.encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@SuppressWarnings("deprecation")
	@Test
	public void banktest() {
		Bank b= new Bank();
		b.setName("Abc");
		b.setAccbalance(1256.99);
		assertEquals("Abc", b.getName());
		System.out.println("Name:"+ b.getName());
		
	}

}
