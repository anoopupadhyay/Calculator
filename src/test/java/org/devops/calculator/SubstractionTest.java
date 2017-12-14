package org.devops.calculator;

import junit.framework.TestCase;

public class SubstractionTest extends TestCase{
	Substraction subs=new Substraction();

	public SubstractionTest(String name) {
		super(name);
	}

	public void testSubOfTwoPositiveNumbers() {
		assertEquals(-100.00,subs.sub(300.00,400.00));
		System.out.println("testSumOfTwoPositiveNumbers: "+subs.sub(300,400));
	}
	public void testSubOfTwoNegativeNumbers() {
		assertEquals(-100.00,subs.sub(-400.00,-300.00));
		System.out.println("testSumOfTwoNegativeNumbers: "+subs.sub(-400,-300));
	}
	public void testSubOfOneNegativeAndOnePositive() {
		assertEquals(700.00,subs.sub(400.00,-300.00));
		System.out.println("testSumOfTwoNegativeNumbers: "+subs.sub(400,-300));
	}	
}
