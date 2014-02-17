package project.euler.problem;

import java.math.BigInteger;

import project.euler.base.IProblem;

public class _056PowerfulDigitSum implements IProblem {

	@Override
	public Integer solve() {
		int a = 100;
		int b = 100;

		Integer answer = 0;
		int answerA = 0;
		int answerB = 0;

		for (int i = 1; i < a; i++) {
			for (int j = 0; j < b; j++) {
				BigInteger power = BigInteger.valueOf(i).pow(j);
				Integer sum = addDigit(power);
				
				if (sum > answer) {
					answerA = i;
					answerB = j;
					answer = sum;
				}
			}
		}
		System.out.println(answer + " ::"+answerA + "::"+answerB);

		return answer;
	}

	private Integer addDigit(BigInteger number) {
		String str = number.toString();
		char[] characters = str.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += characters[i]-48;

		}
		return sum;

	}
}
