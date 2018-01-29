package JavaUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oopCalc.main;

class addTest {

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
	public void testAdd() {
		System.out.println("add");
		double a = 5;
		double b = 4;
		double expResult = 9;
		double result = main.add(a,b);
		assertEquals(expResult, result);
		
	}

	private void assertEquals(double expResult, double result) {
		
	}

}
