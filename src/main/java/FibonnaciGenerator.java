import java.math.BigInteger;
import java.util.Arrays;

public class FibonnaciGenerator {
	/**
	 * Run the generator to generate the fibonnaci sequence
	 * @param numOfFib the number of the fibonnacis in the generated sequence
	 * @return an array of BigInteger which contains the generated fibonnaci sequence
	 */
	public BigInteger[] run(int numOfFib) {
		BigInteger[] fibonnaci = new BigInteger[numOfFib];
		if (numOfFib == 0) {
			return fibonnaci;
		}
		
		fibonnaci[0] = BigInteger.valueOf(0);
		if(numOfFib == 1) {
			return fibonnaci;
		}
		fibonnaci[1] = BigInteger.valueOf(1);
		
		for(int i=2; i<numOfFib; i++) {
			fibonnaci[i] = fibonnaci[i-1].add(fibonnaci[i-2]);
		}
		
		return fibonnaci;
	}
}
