import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConsoleOutputWriterTest {
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
	public void testWrite(){
		ConsoleOutputWriter writer = new ConsoleOutputWriter();
	
		String output = "test string\n";
		writer.write(output);
		assertThat(outContent.toString(), containsString(output));
	}
	
	@Test
	public void testWriteLine(){
		ConsoleOutputWriter writer = new ConsoleOutputWriter();
	
		String output = System.lineSeparator();
		writer.writeNewLine();
		assertThat(outContent.toString(), containsString(output));
	}
}
