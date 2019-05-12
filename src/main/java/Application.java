import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		int numOfFib;
		try {
			numOfFib = reader.read();
			FibonnaciGenerator generator = new FibonnaciGenerator();
			generator.run(numOfFib);
		} catch (IOException e) {
			System.out.printf("Can not get input for the number of fibonnaci number from console. Exit\n");
			System.out.printf(e.getMessage());
		}
		

	}
}
