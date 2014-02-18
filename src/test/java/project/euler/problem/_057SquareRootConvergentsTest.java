package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _057SquareRootConvergentsTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_057SquareRootConvergentsTest.class);

	public _057SquareRootConvergentsTest() {
		super(_057SquareRootConvergents.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_057SquareRootConvergents problem = new _057SquareRootConvergents();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
