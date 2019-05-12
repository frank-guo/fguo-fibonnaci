import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonNegativeIntReader {
	/**
	 * Read a non-negative integer number from console
	 * @return The non-negative input int number or -1 for testing
	 * @throws IOException
	 */
	public int read() throws IOException {
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)))
		{		
			boolean retry = true;
			int number = 0;
			String input="";
			
			System.out.printf("Please input the number[1-%d] of fibonnaci numbers that you want to output.\n", Integer.MAX_VALUE);
			while(retry) {
				input = bufferedReader.readLine();
				if(input==null) {
					//This only occurs in test cases
					bufferedReader.close();
					return -1;
				}
				if("".equals(input)) {
					System.out.printf("No input. Please retry\n");
					continue;
				}
				input = input.trim();
				if(!input.matches("^\\d+$")) {
					System.out.printf("Input %s is not a valid number. The input number has to be in the range of [1-%d]. Please retry.\n", input, Integer.MAX_VALUE);
				} else {
					retry = false;
				}
			}
			bufferedReader.close();
			
			number = Integer.valueOf(input);
			
			return number;
		}
	}
}
