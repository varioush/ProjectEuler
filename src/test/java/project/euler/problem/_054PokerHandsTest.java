package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _054PokerHandsTest extends EulerTest {
	static Logger logger = Logger.getLogger(_054PokerHandsTest.class);

	public _054PokerHandsTest() {
		super(_054PokerHands.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_054PokerHands problem = new _054PokerHands();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}