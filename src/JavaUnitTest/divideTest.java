package JavaUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oopCalc.main;

class divideTest {

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

	@Test (expected = ArithmeticExcept)
	public void testDivide() {
		System.out.println("divide");
		double a = 24;
		double b = 3;
		double expResult = 6;
		double result = main.divide(a,b);
		assertEquals(expResult, result);
	}

	private void assertEquals(double expResult, double result) {
		
	}

}
