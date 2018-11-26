import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L4HW1Test {

	@Test
	void testRange1True() {
		L4HW1 test = new L4HW1(-5f,0f,5f,0,0,0);
		
		boolean actual = true;
		boolean expected = test.checkRange();
		assertTrue(expected);
		
	}
	@Test
	void testRange2True() {
		L4HW1 test = new L4HW1(-5f,-3f,5f,0,0,0);
		
		boolean actual = true;
		boolean expected = test.checkRange();
		assertTrue(expected);
		
	}
	@Test
	void testRange1False() {
		L4HW1 test = new L4HW1(-6f,0f,5f,0,0,0);
		
		boolean actual = false;
		boolean expected = test.checkRange();
		assertFalse(expected);
		
	}
	@Test
	void testRange2False() {
		L4HW1 test = new L4HW1(-6f,0f,9f,0,0,0);
		
		boolean actual = false;
		boolean expected = test.checkRange();
		assertFalse(expected);
		
	}
	@Test
	void testRange3False() {
		L4HW1 test = new L4HW1(-1f,6f,-3f,0,0,0);
		
		boolean actual = false;
		boolean expected = test.checkRange();
		assertFalse(expected);
		
	}
	@Test
	void test1checkMin() {
		L4HW1 test = new L4HW1(0,0,0,1,5,0);
		
		int actual = 0;
		int expected = test.checkMin();
		assertEquals(actual,expected);
	}
	@Test
	void test2checkMin() {
		L4HW1 test = new L4HW1(0,0,0,1,5,7);
		
		int actual = 1;
		int expected = test.checkMin();
		assertEquals(actual,expected);
	}
	@Test
	void test3checkMin() {
		L4HW1 test = new L4HW1(0,0,0,9,5,4);
		
		int actual = 4;
		int expected = test.checkMin();
		assertEquals(actual,expected);
	}
	@Test
	void test1checkMax() {
		L4HW1 test = new L4HW1(0,0,0,1,5,0);
		
		int actual = 5;
		int expected = test.checkMax();
		assertEquals(actual,expected);
	}
	@Test
	void test2checkMax() {
		L4HW1 test = new L4HW1(0,0,0,1,5,7);
		
		int actual = 7;
		int expected = test.checkMax();
		assertEquals(actual,expected);
	}
	@Test
	void test3checkMax() {
		L4HW1 test = new L4HW1(0,0,0,9,5,4);
		
		int actual = 9;
		int expected = test.checkMax();
		assertEquals(actual,expected);
	}
}
