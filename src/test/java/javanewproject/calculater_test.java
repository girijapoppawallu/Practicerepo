package javanewproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculator.calculator;

public class calculater_test {

	
		// TODO Auto-generated method stub
		@Test
		public void testadd() {
			 
			assertEquals(6,calculator.add(3,3));

	}
		@Test
		public void testsub() {
			
			assertEquals(4,calculator.sub(6,2));
		}
		
	
			
		
		@Test
		public void testmultiply() {
		assertEquals(8,calculator.multiply(2,4)); 
		}
			
		@Test
	
		public void divide() {
			assertEquals(3,calculator.divide(6,2));
		}
		
		}


