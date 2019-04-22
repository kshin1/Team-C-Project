import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class SimpleCalculatorTests {
	
	public static SimpleCalculator cal = new SimpleCalculator();
	
	@Test
	public void testAddition() {
		
		assertEquals(9,cal.Addition(2,3,4));
		assertEquals(200,cal.Addition(10,89,67,34));
		assertEquals(97,cal.Addition(2,3,4,65,23,0));
		assertEquals(1,cal.Addition(-34, 35));
		assertEquals(-40,cal.Addition(30, -70));
		assertEquals(0,cal.Addition(0, 0));
		assertEquals(9,cal.Addition(2,3,4));
		assertNotEquals(10, cal.Addition());
		assertNotEquals(5, cal.Addition(3,8,0));
			
	}
	
	@Test
	public void testSubtraction() {
		
		assertEquals(25, cal.Subtraction(35, 10));
		assertEquals(-25, cal.Subtraction(10, 35));
		assertNotEquals(5, cal.Subtraction(22, 11));
		assertEquals(0, cal.Subtraction(0, 0));
		assertEquals(-25, cal.Subtraction(-10,15));
		assertNotEquals(25, cal.Subtraction(10,15));	
		
	}
	
	@Test
	public void testMultiplication() {
		
		assertEquals(50, cal.Multiplication(5,10));
		assertEquals(0, cal.Multiplication(5,10,0));
		assertEquals(24, cal.Multiplication(1,2,3,4));
		assertEquals(5, cal.Multiplication(5));
		assertEquals(-56, cal.Multiplication(7,-8));
		assertEquals(18, cal.Multiplication(-6,-3));
		assertNotEquals(0, cal.Multiplication(5,6,9));
			
	}
	
	@Test
	public void TestDivision() {
		
		assertEquals(0.7, cal.Divison(7, 10),0);
		assertEquals(2.0, cal.Divison(100, 50),0);
		assertNotEquals(0, cal.Divison(12, 10));
				
	}

}
