package projecteuler;

import static org.junit.Assert.*;

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
}
