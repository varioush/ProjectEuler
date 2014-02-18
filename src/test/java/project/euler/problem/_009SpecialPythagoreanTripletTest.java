package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _009SpecialPythagoreanTripletTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_009SpecialPythagoreanTripletTest.class);

	public _009SpecialPythagoreanTripletTest() {
		super(_009SpecialPythagoreanTriplet.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_009SpecialPythagoreanTriplet problem = new _009SpecialPythagoreanTriplet();

		testEquality(problem);
	}

}
