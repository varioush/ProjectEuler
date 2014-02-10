package project.euler;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/29/14.
 */
public class LongestCollatzSequence implements IProblem {

	private int limit = 1000000;

	public Integer solve() {

		
		int sequenceLength = 0;
		int startingNumber = 0;
		long sequence;
		 
		int[] cache = new int[limit + 1];
		//Initialise cache
		for (int i = 0; i < cache.length; i++) {
		    cache[i] = -1;
		}
		cache[1] = 1;
		 
		for (int i = 2; i <= limit; i++) {
		    sequence = i;
		    int k = 0;
		    while (sequence != 1 && sequence >= i) {
		        k++;
		        if ((sequence % 2) == 0) {
		            sequence = sequence / 2;
		        } else {
		            sequence = sequence * 3 + 1;
		        }
		    }
		    //Store result in cache
		    cache[i] = k + cache[(int) sequence];
		 
		    //Check if sequence is the best solution
		    if (cache[i] > sequenceLength) {
		        sequenceLength = cache[i];
		        startingNumber = i;
		    }
		}
		return startingNumber;
	}

	
	public LongestCollatzSequence limit(int limit)
	{
		this.limit = limit;
		return this;
	}
}
