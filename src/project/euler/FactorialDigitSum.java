package project.euler;

import java.math.BigInteger;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/30/14.
 */
public class FactorialDigitSum implements IProblem {

	private int limit = 0;

	public BigInteger solve() {
		BigInteger sum = BigInteger.ZERO;
		BigInteger integer = BigInteger.ONE;

		for (int i = 1; i <= limit; i++) {
			integer = integer.multiply(BigInteger.valueOf(i));
		}

		while (integer.compareTo(BigInteger.ZERO) != 0) {
			BigInteger fact = integer.mod(BigInteger.TEN);
			integer = integer.divide(BigInteger.TEN);
			sum = sum.add(fact);

		}
		return sum;
	}

	public FactorialDigitSum limit(int limit) {
		this.limit = limit;
		return this;
	}
}
