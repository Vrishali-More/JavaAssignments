package com.question3.polymorphism;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	/*@Test
	public void testvehicle() {
		Vehicle ve=new Vehicle();
		assertEquals("truck",ve. nameVehicle("truck"));
			
		System.out.println("Vehicle name is:"+ve.nameVehicle("truck"));
	}
	*/
	
	@Test
	public void testBike() {
	  Bike b= new Bike();
		assertEquals("bike",b. nameVehicle("bike"));
			
		System.out.println("Vehicle name is:"+b.nameVehicle(" bike"));
	}


}	
		
		
	
