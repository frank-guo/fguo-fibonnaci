import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;

import org.junit.Test;

public class FibonnnciGeneratorTest {

	@Test
	public void testInputNegative() {
		FibonnaciGenerator generator = new FibonnaciGenerator();
		
		BigInteger lastFib = generator.run(-20);
		assertThat(lastFib, is(BigInteger.valueOf(-1)));
	}	
	
	@Test
	public void testInputZero() {
		FibonnaciGenerator generator = new FibonnaciGenerator();
		
		BigInteger lastFib = generator.run(0);
		assertThat(lastFib, is(BigInteger.valueOf(-1)));
	}
	
	@Test
	public void testInputOne() {
		FibonnaciGenerator generator = new FibonnaciGenerator();
		
		BigInteger lastFib = generator.run(1);
		assertThat(lastFib, is(BigInteger.valueOf(0)));
	}
	
	@Test
	public void testInput5() {
		FibonnaciGenerator generator = new FibonnaciGenerator();
		
		BigInteger lastFib = generator.run(5);
		assertThat(lastFib, is(new BigInteger("3")));
	}
	
	@Test
	public void testInput100() {
		FibonnaciGenerator generator = new FibonnaciGenerator();
		
		BigInteger lastFib = generator.run(100);
		assertThat(lastFib, is(new BigInteger("218922995834555169026")));
	}

}
