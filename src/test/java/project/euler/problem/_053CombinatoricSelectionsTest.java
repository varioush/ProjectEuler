package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _053CombinatoricSelectionsTest extends EulerTest {
	static Logger logger = Logger.getLogger(_053CombinatoricSelectionsTest.class);

	public _053CombinatoricSelectionsTest() {
		super(_053CombinatoricSelections.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_053CombinatoricSelections problem = new _053CombinatoricSelections();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}