import java.math.BigInteger;

/**
 * A fibonnaci sequence generator which can output the first specified number of fibonnaci numbers
 * @author Frank
 *
 */
public class FibonnaciGenerator {
	/**
	 * Run the generator to generate the fibonnaci sequence
	 * @param numOfFib the number of the fibonnaci numbers in the generated sequence
	 * @return the last number in the output fibonnaci sequence or -1 if numOfFib is invalid
	 */
	public BigInteger run(int numOfFib) {
		//I don't use a collection to store the generated sequence in order to save memory
		//so that this generator can do much larger sequence.
		//However, this makes testing a bit harder
		if(numOfFib < 0) {
			System.out.printf("%d is invalid", numOfFib);
			return BigInteger.valueOf(-1);
		}
		
		if(numOfFib == 0) {
			return BigInteger.valueOf(-1);
		}
		
		System.out.printf("The first %d numbers within the Fibonnaci sequence are: \n", numOfFib);
		
		BigInteger secondLastFibonnaci = BigInteger.valueOf(0);
		//ToDo: Better make an OutputWriter class which can be any type of output device, e.g. file
		System.out.printf("%s ", secondLastFibonnaci);
		if(numOfFib == 1) {			
			return secondLastFibonnaci;
		}
		BigInteger lastfibonnaci = BigInteger.valueOf(1);
		System.out.printf("%s ", lastfibonnaci);
		
		BigInteger fibonnaci = lastfibonnaci;
		for(int i=2; i<numOfFib; i++) {
			fibonnaci = lastfibonnaci.add(secondLastFibonnaci);
			System.out.printf("%s ", fibonnaci);
			secondLastFibonnaci = lastfibonnaci;
			lastfibonnaci = fibonnaci;
		}
		System.out.println();
		
		return fibonnaci;
	}
}
