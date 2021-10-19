package com.ust.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTestCase {
	
	DivisionTest divisionTest1 = new DivisionTest(10, 2); 
	DivisionTest divisionTest2 = new DivisionTest(10, 0); 

	@Test
	public void test() {
		assertEquals(5, divisionTest1.division());
	}
 
	@Test(expected = ArithmeticException.class)  
	public void testException() {
		assertEquals(5, divisionTest2.division());
	}



}