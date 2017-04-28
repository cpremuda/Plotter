package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.maths.AdvancedCalculator;
import com.maths.Calculator;

public class AdvancedCalculatorTest {
	static Calculator calc;

	static String function1 = "x";
	static String function2 = "x^2";
	static String function3 = "x^2 + x";


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc=new Calculator(0,0);
		calc.setRecalculate(false);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void simpsonTest() {
		calc.DISPLAYED_FUNCTION=function1;
		calc.getFunction3D();
		assertEquals(19.78205, AdvancedCalculator.SimpsonIntegral(calc), 0.001);
		
		calc.DISPLAYED_FUNCTION=function2;
		calc.getFunction3D();
		assertEquals(82.952729666667, AdvancedCalculator.SimpsonIntegral(calc), 0.001);
		
		calc.DISPLAYED_FUNCTION=function3;
		calc.getFunction3D();
		assertEquals(102.73477966667, AdvancedCalculator.SimpsonIntegral(calc), 0.001);
	}
	
	@Test
	public void trapeziumTest() {
		calc.DISPLAYED_FUNCTION=function1;
		calc.getFunction3D();
		assertEquals(19.78205, AdvancedCalculator.trapeziumIntegral(calc), 0.001);
		
		calc.DISPLAYED_FUNCTION=function2;
		calc.getFunction3D();
		assertEquals(84.1048509120370, AdvancedCalculator.trapeziumIntegral(calc), 0.001);
		
		calc.DISPLAYED_FUNCTION=function3;
		calc.getFunction3D();
		assertEquals(103.886900912037, AdvancedCalculator.trapeziumIntegral(calc), 0.001);
	}
	
	@Test
	public void gaussTest() {
		calc.DISPLAYED_FUNCTION=function1;
		calc.getFunction3D();
		assertEquals(19.78205, AdvancedCalculator.gaussIntegral(calc), 0.001);
		
		calc.DISPLAYED_FUNCTION=function2;
		calc.getFunction3D();
		assertEquals(82.952729666667, AdvancedCalculator.gaussIntegral(calc), 0.001);
		
		calc.DISPLAYED_FUNCTION=function3;
		calc.getFunction3D();
		assertEquals(102.73477966667, AdvancedCalculator.gaussIntegral(calc), 0.001);
		
	}

}
