import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NonNegativeIntReaderTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	}

	@Test
	public void testNoInput() throws IOException {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		
	    String input = "\r\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		int number = reader.read();

		assertThat(number, is(-1));
		
		String output = "No input. Please retry";
		assertThat(outContent.toString(), containsString(output));
	}	
	
	@Test
	public void testNegativeInput() throws IOException {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		
	    String input = "-60\r\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		int number = reader.read();

		assertThat(number, is(-1));
		
		String output = "Input -60 is negative or not a valid integer. Please retry.";
		assertThat(outContent.toString(), containsString(output));
	}
	
	@Test
	public void testNotNumberInput() throws IOException {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		
	    String input = "t60\r\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		int number = reader.read();

		assertThat(number, is(-1));
		
		String output = "Input t60 is negative or not a valid integer. Please retry.";
		assertThat(outContent.toString(), containsString(output));
	}
	
	@Test
	public void testFloatNumberInput() throws IOException {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		
	    String input = "60.33\r\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		int number = reader.read();

		assertThat(number, is(-1));
		
		String output = "Input 60.33 is negative or not a valid integer. Please retry.";
		assertThat(outContent.toString(), containsString(output));
	}
	
	@Test
	public void testOutBoundIntegerInput() throws IOException {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		
	    String input = "2147483648\r\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		int number = reader.read();

		assertThat(number, is(-1));
		
		String output = "Input 2147483648 has to be in the range of [0-2147483647]. Please retry.";
		assertThat(outContent.toString(), containsString(output));
	}
	
	@Test
	public void testValidInput() throws IOException {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		
	    String input = "600\r\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		int number = reader.read();

		assertThat(number, is(600));
	}
	
	@Test
	public void testValidInputWithWhitSpace() throws IOException {
		NonNegativeIntReader reader = new NonNegativeIntReader();
		
	    String input = " 600 \r\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		int number = reader.read();

		assertThat(number, is(600));
	}

}
