package JavaUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oopCalc.main;

class multiplyTest {

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
	public void testMultiply() {
		System.out.println("multiply");
		double a = 6;
		double b = 2;
		double expResult = 12;
		double result = main.multiply(a,b);
		assertEquals(expResult, result);
	}

	private void assertEquals(double expResult, double result) {

		
	}

}
