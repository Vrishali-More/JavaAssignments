package com.Question6;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matcher;
import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testemployee() {
		Employee emp =new Employee();
	assertEquals("Gita",emp.show());
	
	
	}


}
