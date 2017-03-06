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
	
	public long evenFibonacciNumbers(int end) {
			
		long sum = 0;
		int first;
		int second = 0;
		int third = 1;
		
		for(int i = 0; i< end; ++i) {
			first = second;
			second = third;
			third = first+second;
			
			if((i+1) % 2 == 0) {
				sum+=third;
			}
		}
		return sum;
	}
}
