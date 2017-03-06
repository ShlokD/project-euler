package projecteuler;




public class ProblemSets {
	public long sumThreeFiveMultiples(int end) {
		long sum = 0;
		for(int i = 1; i < end; ++i) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
