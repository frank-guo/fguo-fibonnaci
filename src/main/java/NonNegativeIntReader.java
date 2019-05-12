import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonNegativeIntReader {
	/**
	 * Read a non-negative integer number from console
	 * @return The non-negative input int number or -1 for testing
	 * @throws IOException thrown possibly by reading lines from the standard input
	 */
	public int read() throws IOException {
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)))
		{		
			boolean retry = true;
			int number = 0;
			String input="";
			
			System.out.printf("Please input the number[0-%d] of fibonnaci numbers that you want to output.\n", Integer.MAX_VALUE);
			while(retry) {
				input = bufferedReader.readLine();
				if(input==null) {
					//This occurs in test cases
					bufferedReader.close();
					return -1;
				}
				if("".equals(input)) {
					System.out.printf("No input. Please retry\n");
					continue;
				}
				input = input.trim();
				if(!input.matches("^\\d+$")) {
					System.out.printf("Input %s is negative or not a valid integer. Please retry.\n", input, Integer.MAX_VALUE);
					continue;
				}
				
				try
				{
					number = Integer.valueOf(input);
					retry = false;
				}
				catch (NumberFormatException ex)
				{
					System.out.printf("Input %s has to be in the range of [0-%d]. Please retry.\n", input, Integer.MAX_VALUE);
				}
			}
						
			return number;
		}
	}
}
