//Author: Katherine S. Viilegas
//Student Number: 2012 - 18102
//CMSC 128 AB-6L
//tester for the MyCalculator.java

import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() { //Test the Factorial Function
		MyCalculator calc = new MyCalculator();
		
		int actual = calc.nfactorial(3);
		
		assertEquals("5! is 120",120,actual,0.0);
		
	}

	@Test
	public void testBinarySearch() { //test the Binary Search function
		
		MyCalculator calc2 = new MyCalculator();
		
		int [] array = {5, 10, 8, 4};
		
		int actual = calc2.binarySearch(array, 7);
		
		assertEquals("Find 8",2,actual,0.0);
	}

}
