package JavaUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oopCalc.main;

class substractTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSubstract() {
		System.out.println("substract");
		double a = 9;
		double b = 2;
		double expResult = 7;
		double result = main.substract(a,b);
		assertEquals(expResult, result);
	}

	private void assertEquals(double expResult, double result) {
		
	}

}
