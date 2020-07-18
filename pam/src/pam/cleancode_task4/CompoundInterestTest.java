package pam.cleancode_task4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompoundInterestTest {

	@Test
	public void test() {
		SimpleInterest s=new SimpleInterest();
		assertEquals(Double.valueOf(200.0),s.calculate_simpleinterest(1000.0,5.0,4.0));
		CompoundInterest c=new CompoundInterest();
		assertEquals(Double.valueOf(216.65290240000013),c.calculate_compoundinterest(1000.0,5.0,4.0));
	}

}