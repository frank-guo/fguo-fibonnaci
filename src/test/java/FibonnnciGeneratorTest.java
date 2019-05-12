import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;

import org.junit.Test;

public class FibonnnciGeneratorTest {
	private final FibonnaciGenerator generator = new FibonnaciGenerator(new ConsoleOutputWriter());

	@Test
	public void testInputNegative() {		
		BigInteger lastFib = generator.run(-20);
		assertThat(lastFib, is(BigInteger.valueOf(-1)));
	}	
	
	@Test
	public void testInputZero() {
		BigInteger lastFib = generator.run(0);
		assertThat(lastFib, is(BigInteger.valueOf(-1)));
	}
	
	@Test
	public void testInputOne() {
		BigInteger lastFib = generator.run(1);
		assertThat(lastFib, is(BigInteger.valueOf(0)));
	}
	
	@Test
	public void testInput5() {
		BigInteger lastFib = generator.run(5);
		assertThat(lastFib, is(new BigInteger("3")));
	}
	
	@Test
	public void testInput100() {
		BigInteger lastFib = generator.run(100);
		assertThat(lastFib, is(new BigInteger("218922995834555169026")));
	}

}
