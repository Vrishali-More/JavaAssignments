package com.question3.abstraction;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VishaliMore
 *
 */
public class StudentTest {

	@Test
	public void testStudent() {
		Student std= new Vrishali();
			
	  assertEquals(995674,std.mobileno());
	   assertEquals(94,std.id());
	   
	   System.out.println("Mobile no:"+std.mobileno());
	   System.out.println("Student Id:"+std.id());

			
	
}
}
