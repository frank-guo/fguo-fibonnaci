import java.io.IOException;

/**
 * A universal wrapper interface for output
 * @author Frank
 *
 */
public interface OutputWriter {
	/**
	 * Write a string to output
	 * @param str the string to write to output
	 */
	void write(String str);
	
	/**
	 * Write a new line to output
	 */
	void writeNewLine();
}
