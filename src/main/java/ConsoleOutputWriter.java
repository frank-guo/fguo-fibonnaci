/**
 * A output writer class to write to console
 * @author Frank
 *
 */
public class ConsoleOutputWriter implements OutputWriter{
	/**
	 * Write a string to console
	 */
	public void write(String str) {
		System.out.print(str);
	}
	
	/**
	 * write a new line to console
	 */
	public void writeNewLine() {
		System.out.println();
	}
}
