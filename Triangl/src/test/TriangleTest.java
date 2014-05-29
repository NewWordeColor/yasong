package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	
	public TriangleTest(){}

	@Test
	public void tringleHasAllpositiveSides() {
		assertTrue(new Triangle(2,2,3).isValid());
		assertFalse(new Triangle(3,4,1).isValid());		
		assertFalse(new Triangle(-2,2,3).isValid());
	}
	@Test
	public void twoSidesBiggerThenThird() {
		assertTrue(new Triangle(2,2,3).isValid());
		assertFalse(new Triangle(3,4,1).isValid());	
	}
	@Test
	public void isoscelesHasTwoEqualSides() {
		assertTrue(new Triangle(2,2,3).isocelestriangle());
		assertTrue(new Triangle(3,3,3).isocelestriangle());	
		assertFalse(new Triangle(1,2,3).isocelestriangle());
		assertFalse(new Triangle(-1,2,3).isocelestriangle());
	}
	@Test
	public void equilateralHas3EqualSides() {
		assertTrue(new Triangle(2,2,2).equilateraltriangle());
		assertFalse(new Triangle(3,4,4).equilateraltriangle());	
		assertFalse(new Triangle(1,2,4).equilateraltriangle());	
		assertFalse(new Triangle(-1,2,3).isocelestriangle());
	}

}
