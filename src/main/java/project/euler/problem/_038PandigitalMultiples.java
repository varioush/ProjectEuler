package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;
import project.euler.feature.Functions;

public class _038PandigitalMultiples implements IProblem {
	
	static Logger logger = Logger.getLogger(_038PandigitalMultiples.class);

	public Integer solve() {
	
		int result = 0;
	
		for (int i = 9876; i > 9183; i--) {

			final int val = i * 100002;
			
			if (Functions.isPandigital(Integer.toString(val))) {
			
				result = val;
				
				break;
			}
		}

		return result;
	}

}
