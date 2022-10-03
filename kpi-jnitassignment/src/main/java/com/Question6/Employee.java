package com.Question6;

/**
 * @author VishaliMore
 *
 */

import java.util.HashMap;
import java.util.Map;


public class Employee {
	public static String show() {

	Map< Integer, String>emp1 = new HashMap<  Integer , String>();
	 
	
	emp1.put(1,"Sham");
	emp1.put(2,"Ram");
	emp1.put(3,"Gita");
	emp1.put(4,"nita");
	
	System.out.println( emp1.get(3));
	return emp1.get(3);
}
	
}