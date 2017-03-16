package projecteuler;

import java.math.BigInteger;

import javax.security.auth.x500.X500Principal;

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
	
	public BigInteger rhoPollard(BigInteger number) {
		BigInteger ZERO = new BigInteger("0");
		if (number.compareTo(new BigInteger("1")) == 0) return new BigInteger("1");
		if (number.mod(new BigInteger("2")) == ZERO) return new BigInteger("2");
		
		BigInteger slow = new BigInteger("2");
		BigInteger fast = new BigInteger("2");
		BigInteger constant = new BigInteger("3");
		BigInteger divisor;
		
		do {
			slow = slow.multiply(slow).mod(number).add(constant).mod(number);
			fast = fast.multiply(fast).mod(number).add(constant).mod(number);
			fast = fast.multiply(fast).mod(number).add(constant).mod(number);
			divisor = slow.subtract(fast).gcd(number);
		} while(divisor.compareTo(new BigInteger("1")) == 0);
		
		return divisor;
	}
	
	public BigInteger largestPrimeFactor(BigInteger number) {
		if(number.compareTo(new BigInteger("1")) == 0) return null;
		if(number.isProbablePrime(20)) return number;
		BigInteger divisor = rhoPollard(number);
		largestPrimeFactor(divisor);
		return largestPrimeFactor(number.divide(divisor));
		
	}
}
