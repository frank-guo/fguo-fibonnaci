import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Application {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String number = bufferedReader.readLine();
		bufferedReader.close();
		int numOfFib = Integer.valueOf(number);
		
		FibonnaciGenerator generator = new FibonnaciGenerator();
		BigInteger[] fibonnacis = generator.run(numOfFib);
		
		System.out.printf("The first %d numbers within the Fibonnaci sequence are: \n", numOfFib);
		System.out.printf(Arrays.toString(fibonnacis));		
	}
}
