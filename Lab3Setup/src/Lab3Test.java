import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Lab3Test {
	
	@Test
	public void testFor1() {
		ArrayList<Integer> value = new ArrayList<Integer>();
		assertEquals(Prime.primefactorization(1), value); 
	}
	
	@Test
	public void testFor2() {
		ArrayList<Integer> value = new ArrayList<Integer>();
		value.add(2);
		System.out.println(value);
		assertEquals(Prime.primefactorization(2), value);
	}

}
