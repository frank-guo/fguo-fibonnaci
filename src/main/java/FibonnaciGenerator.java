import java.math.BigInteger;

/**
 * A fibonnaci sequence generator which can output the first specified number of fibonnaci numbers
 * @author Frank
 *
 */
public class FibonnaciGenerator {
	//Other types of output writer can be created in future if needed, e.g. file
	private final OutputWriter outputWriter;
	
	FibonnaciGenerator(OutputWriter outputWriter){
		this.outputWriter = outputWriter;
	}
	
	/**
	 * Run the generator to generate the fibonnaci sequence
	 * @param numOfFib the int number of the fibonnaci numbers in the generated sequence
	 * @return the last number in the output fibonnaci sequence or -1 if numOfFib is invalid
	 */
	//I am assuming int is big enough for this application.If not, the parameter type can be changed to long or BigInteger
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
		
		String str = String.format("The first %d numbers within the Fibonnaci sequence are: \n", numOfFib);
		outputWriter.write(str);
		
		BigInteger secondLastFibonnaci = BigInteger.valueOf(0);
		str = String.format("%s ", secondLastFibonnaci);
		outputWriter.write(str);
		if(numOfFib == 1) {			
			return secondLastFibonnaci;
		}
		BigInteger lastfibonnaci = BigInteger.valueOf(1);
		str = String.format("%s ", lastfibonnaci);
		outputWriter.write(str);
		
		BigInteger fibonnaci = lastfibonnaci;
		for(int i=2; i<numOfFib; i++) {
			fibonnaci = lastfibonnaci.add(secondLastFibonnaci);
			str = String.format("%s ", fibonnaci);
			outputWriter.write(str);
			secondLastFibonnaci = lastfibonnaci;
			lastfibonnaci = fibonnaci;
		}
		outputWriter.writeNewLine();
		
		return fibonnaci;
	}
}
