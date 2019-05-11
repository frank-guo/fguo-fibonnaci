import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;

import org.junit.Test;

public class FibonnnciGeneratorTest {

	@Test
	public void testInputZero() {
		FibonnaciGenerator generator = new FibonnaciGenerator();
		
		BigInteger[] result = generator.run(0);
		assertThat(result.length, is(0));
	}
	
	@Test
	public void testInputOne() {
		FibonnaciGenerator generator = new FibonnaciGenerator();
		
		BigInteger[] result = generator.run(1);
		assertThat(result.length, is(1));
	}
	
	@Test
	public void testInput100() {
		FibonnaciGenerator generator = new FibonnaciGenerator();
		
		BigInteger[] result = generator.run(100);
		assertThat(result.length, is(100));
	}

}
