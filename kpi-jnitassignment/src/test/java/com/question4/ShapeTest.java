package com.question4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest {

	@Test
	public void shapetest() {
		//Shape s1= new Rectangle();
		//Shape s2 = new Circle();
		//Shape s3= new Square();
		//Shape s4= new Triangle();
		
		
	}
	 @Test
	 public void Triangletest() {
		 Shape  s = new Triangle();
		 assertEquals(3,s.sides(3));
		 System.out.println("Sides of Triangle:"+ s.sides(4));
		 
		 assertEquals("DrowingTriangle",s.drow("DrowingTriangle"));
		 System.out.println(s.drow("DrowingTriangle"));
		 
	 }
	 @Test
	 public void squaretest() {
		 Shape  seq = new Square();
		 assertEquals(4,seq.sides(4));
		 System.out.println("Sides of rectangle:"+ seq.sides(4));

		 assertEquals("DrowingSquare",seq.drow("DrowingSquare"));
		 System.out.println(seq.drow("DrowingSquare"));
	 }
	 @Test
	 public void rectangletest() {
		 Rectangle r = new Rectangle();
		 assertEquals(4,r.sides(4));
		 System.out.println("Sides of rectangle:"+ r.sides(4));

		 assertEquals("DrowingRectangle",r.drow("DrowingRectangle"));
		 System.out.println(r.drow("DrowingRectangle"));
	 }
	 @Test
	 public void circletest() {
		 Circle c = new Circle();
		 assertEquals(0,c.sides(0));
		 System.out.println("Sides of rectangle:"+ c.sides(0));

		 assertEquals("DrowingCircle",c.drow("DrowingCircle"));
		 System.out.println(c.drow("DrowingCircle"));
	 }
}
