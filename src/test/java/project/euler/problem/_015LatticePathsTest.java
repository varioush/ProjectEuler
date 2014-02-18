package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _015LatticePathsTest extends EulerTest {
	static Logger logger = Logger.getLogger(_015LatticePathsTest.class);

	public _015LatticePathsTest() {
		super(_015LatticePaths.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_015LatticePaths problem = new _015LatticePaths();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
