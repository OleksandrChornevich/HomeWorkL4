import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogHWTest {

	@Test
	void testsameNameTrue1() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 5);
		DogHW dog2 = new DogHW("Chaki", "GERMANSHEPHERD", 2);
		DogHW dog3 = new DogHW("Palkan", "BULDOOG", 8);

		boolean actual = true;
		boolean expected = DogHW.sameName(dog1, dog2, dog3);
		assertTrue(expected);
	}

	@Test
	void testsameNameTrue2() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 5);
		DogHW dog2 = new DogHW("Rex", "GERMANSHEPHERD", 2);
		DogHW dog3 = new DogHW("Chaki", "BULDOOG", 8);

		boolean actual = true;
		boolean expected = DogHW.sameName(dog1, dog2, dog3);
		assertTrue(expected);
	}

	@Test
	void testsameNameFalse() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 5);
		DogHW dog2 = new DogHW("Rex", "GERMANSHEPHERD", 2);
		DogHW dog3 = new DogHW("Palkan", "BULDOOG", 8);

		boolean actual = false;
		boolean expected = DogHW.sameName(dog1, dog2, dog3);
		assertFalse(expected);
	}

	@Test
	void testoldest1() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 5);
		DogHW dog2 = new DogHW("Rex", "GERMANSHEPHERD", 2);
		DogHW dog3 = new DogHW("Palkan", "BULDOOG", 8);

		DogHW dogOldest = new DogHW("Palkan", "BULDOOG", 8);

		DogHW actual = dogOldest;
		DogHW expected = DogHW.oldest(dog1, dog2, dog3);
		assertEquals(actual, expected);
	}
	@Test
	void testoldest2() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 8);
		DogHW dog2 = new DogHW("Rex", "GERMANSHEPHERD", 2);
		DogHW dog3 = new DogHW("Palkan", "BULDOOG", 8);

		DogHW dogOldest = new DogHW("Chaki", "BOXER", 8);

		DogHW actual = dogOldest;
		DogHW expected = DogHW.oldest(dog1, dog2, dog3);
		assertEquals(actual, expected);
	}
	@Test
	void testoldest3() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 1);
		DogHW dog2 = new DogHW("Rex", "GERMANSHEPHERD", 5);
		DogHW dog3 = new DogHW("Palkan", "BULDOOG", 9);

		DogHW dogOldest = new DogHW("Palkan", "BULDOOG", 9);

		DogHW actual = dogOldest;
		DogHW expected = DogHW.oldest(dog1, dog2, dog3);
		assertEquals(actual, expected);
	}
	@Test
	void testoldest4() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 10);
		DogHW dog2 = new DogHW("Rex", "GERMANSHEPHERD", 7);
		DogHW dog3 = new DogHW("Palkan", "BULDOOG", 3);

		DogHW dogOldest = new DogHW("Chaki", "BOXER", 10);

		DogHW actual = dogOldest;
		DogHW expected = DogHW.oldest(dog1, dog2, dog3);
		assertEquals(actual, expected);
	}
	@Test
	void testCheckOldestTrue() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 5);
		DogHW dog2 = new DogHW("Chaki", "GERMANSHEPHERD", 2);
	
		boolean actual = true;
		boolean expected = dog1.checkOldest(dog2);
		assertTrue(expected);
	}
	@Test
	void testCheckOldestFalse() {
		DogHW dog1 = new DogHW("Chaki", "BOXER", 1);
		DogHW dog2 = new DogHW("Chaki", "GERMANSHEPHERD", 8);
	
		boolean actual = false;
		boolean expected = dog1.checkOldest(dog2);
		assertFalse(expected);
	}
	

}
