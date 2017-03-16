package projecteuler;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class ProblemSetsTest {

	@Test
	public void sumThreeFiveMultiplesTest() {
		ProblemSets problemSets =  new ProblemSets();
		long expectedSum = 233168;
		assertEquals(expectedSum, problemSets.sumThreeFiveMultiples(1000));
	}
	
	@Test
	public void evenFibonacciTest() {
		ProblemSets problemSets =  new ProblemSets();
		long expectedSum = 7;
		assertEquals(expectedSum, problemSets.evenFibonacciNumbers(4));
	}
	
	
	@Test
	public void largestPrimeFactorTest() {
		ProblemSets problemSets =  new ProblemSets();
		BigInteger number = new BigInteger("600851475143");
		BigInteger expectedFactor = new BigInteger("6857");
		assertEquals(expectedFactor, problemSets.largestPrimeFactor(number));
	}
	
	
	
	
}
