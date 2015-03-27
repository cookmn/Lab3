import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {

	int testGiven;
	ArrayList<Integer> testReturned;

	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		Integer[] first = {};
		return Arrays.asList(new Object [] [] {
				{1, new ArrayList<Integer>(Arrays.asList(first))}
		});
		
		
		
	}

	public PrimeNumberGeneratorTest(int given, ArrayList<Integer> returned) {
		testGiven = given;
		testReturned = returned;
	}

	@Test
	public void realTest() {
		assertEquals(testReturned, PrimeNumberGenerator.generator(testGiven));
	}

}