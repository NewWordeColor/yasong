package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest {
	@Test
	public void isValidShape() {
		assertTrue(new Shape(new double[]{1, 1, 1}).isValidShape());
	}
	@Test
	public void moreTestMethods() {
		assertTrue(new Shape(new double[]{3, 4, 5}).isValidShape());
		assertTrue(new Shape(new double[]{1, 1, 1, 1}).isValidShape());
		assertFalse(new Shape(new double[]{1, 1}).isValidShape());
		assertFalse(new Shape(new double[]{-1, 1, 1}).isValidShape());
		assertFalse(new Shape(new double[]{ 1, 1}).isValidShape());
		assertFalse(new Shape(new double[]{1, 1, 1 ,3}).isValidShape());
		assertFalse(new Shape(new double[]{ 0, 0}).isValidShape());
	}
	
}
