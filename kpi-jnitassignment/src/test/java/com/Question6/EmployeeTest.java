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
	
		Map<String, String>emp1 = new HashMap<>();
		emp1.put("Sham","1");
		emp1.put("Ram", "2");
		emp1.put("Gita","3" );
		emp1.put("nita"," 4");
		
		Map<String, String>expected = new HashMap<>();
		expected.put("Sham","1");
		expected.put("Ram"," 2");
		expected.put("Gita","3" );
		expected.put("nita", "4");
		
/*		
		assertThat(emp1, is(expected));
		assertThat(emp1.size(), is(4));
		assertThat(emp1,IsMapContaining.hasValue("3"));
		
		*/
		System.out.println(emp1);
	}


}
