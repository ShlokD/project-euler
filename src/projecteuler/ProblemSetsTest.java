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

}
