package project.euler.problem;

import project.euler.base.IProblem;


public class IntegerRightTriangles implements IProblem {

	private int limit = 0;

	public Integer solve() {

		int count = 0;
		int max = 0;
		for (int i = 0; i <= limit; i++) {
			int x = dosomething(i);
			if (x > count) {
				count = x;
				max = i;

			}
		}
		return max;

	}

	private int dosomething(int marker) {
		int count = 0;
		for (int c = 1; c <= marker; c++) {

			int a;
			int residue = marker - c;
			for (int b = 1; b < residue; b++) {
				a = residue - b;
				if (a * a + b * b == c * c) {

					count++;
				} else {
					if (a == b || a == (b - 1)) {
						break;
					}
				}
			}

		}
		return count;
	}

	public IntegerRightTriangles limit(int limit) {
		this.limit = limit;

		return this;
	}
}