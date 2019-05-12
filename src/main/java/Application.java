import java.io.IOException;

/**
 * The application gets a non-negative integer from standard input and output the fibonnaci sequence as per the input 
 * @author Frank
 *
 */
public class Application {
	public static void main(String[] args) {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		int numOfFib;
		try {
			numOfFib = reader.read();
			OutputWriter outputWriter = new ConsoleOutputWriter();
			FibonnaciGenerator generator = new FibonnaciGenerator(outputWriter);
			generator.run(numOfFib);
		} catch (IOException e) {
			System.out.printf("Can not get input for the number of fibonnaci number from console. Exit\n");
			System.out.printf(e.getMessage());
		}
		

	}
}
