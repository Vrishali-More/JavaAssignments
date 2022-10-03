package com.question5;

/**
 * @author VrishaliMore
 *
 */

import static org.junit.Assert.*;
import org.junit.Test;


public class AbcTest {

	@Test
	public void abctest() {
		 Abc obj= new Abc();
		 assertEquals("rightside",obj.location("rightside"));
		 obj.display();
		 obj.addbook();
		 System.out.println("Location:"+obj.location("rightside"));
		 
	}	

}
