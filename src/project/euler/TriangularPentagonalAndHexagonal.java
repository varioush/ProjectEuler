package project.euler;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class TriangularPentagonalAndHexagonal implements IProblem {

	public Long solve() {

		int i = 143;
		long result =0;
		while(true)
		{
			i++;
			result = i * (2 * i - 1);
			if (Learning.isPentagonal(result)) {
		        break;
		    }
		}
		return result;
	}

	
}
